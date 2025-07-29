package org.prog.session10;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.PersonDto;
import org.prog.session9.ResultsDto;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.List;

public class HomeworkMySqlTests {

    private Connection connection;

    @BeforeSuite
    public void beforeSuite() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", "root", "password");
    }

@AfterSuite
public void tearDown() throws SQLException {
    if (connection != null) {
        connection.close();
    }
}

@Test
public void testWriteToDB() throws SQLException, ClassNotFoundException {
    Statement statement = connection.createStatement();
    statement.execute("INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, City, Street, HouseNumber) " +
            "VALUES ('Bill', 'Smith', 'male', 'Mr', 'US', 'New York', '5th Street', '1224')");
}

@Test
public void testReadFromDB() throws SQLException, ClassNotFoundException {
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons");
    while (resultSet.next()) {
        System.out.print(resultSet.getString("FirstName") + " ");
        System.out.println(resultSet.getString("LastName"));
    }
}

@Test
public void testWriteToDBFromAPI() throws SQLException, ClassNotFoundException {
    ResultsDto resultsDto = getUsers(3);
    List<PersonDto> personDtos = resultsDto.getResults();
//            Statement statement = connection.createStatement();
    PreparedStatement preparedStatement = connection.prepareStatement(
            "INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, City, Street, HouseNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
    );


    personDtos.forEach(dto -> executeStatement(dto, preparedStatement));

}
    private void executeStatement(PersonDto dto, PreparedStatement preparedStatement) {
        try {
            preparedStatement.setString(1, dto.getName().getFirst());
            preparedStatement.setString(2, dto.getName().getLast());
            preparedStatement.setString(3, dto.getGender());
            preparedStatement.setString(4, dto.getName().getTitle());
            preparedStatement.setString(5, dto.getNat());
            preparedStatement.setString(6, dto.getLocation().getCity());
            preparedStatement.setString(7, dto.getLocation().getStreet().getName());
            preparedStatement.setString(8, String.valueOf(dto.getLocation().getStreet().getNumber()));

            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error inserting person: " + dto);
            e.printStackTrace();
        }
    }


private ResultsDto getUsers(int amount) {
    Response respones = RestAssured.given()
            .baseUri("https://randomuser.me/")
            .basePath("api/")
            .queryParam("inc", "gender,name,nat")
            .queryParam("results", amount)
            .queryParam("noinfo")
            .get();
    respones.prettyPrint();
    return respones.as(ResultsDto.class);
}
}
