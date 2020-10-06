package ru.dexsys;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class restRequests {

    public static void addPet(String baseUri, String body) {

        {
            RestAssured.given()
                    .baseUri(baseUri)
                    .body(body)
                    .log().body(true)
                    .contentType(ContentType.JSON)
                    .post("https://petstore.swagger.io/v2/pet")
                    .then()
                    .statusCode(200)
                    .extract()
                    .response()
                    .jsonPath();

        }
    }

    public static void updatePet(String baseUri, String body) {

        {
            RestAssured.given()
                    .baseUri(baseUri)
                    .body(body)
                    .log().body(true)
                    .contentType(ContentType.JSON)
                    .put("https://petstore.swagger.io/v2/pet")
                    .then()
                    .statusCode(200)
                    .extract()
                    .response()
                    .jsonPath();

        }

    }

    public static void findPetById(String baseUri, int id) {

        {
            RestAssured.given()
                    .baseUri(baseUri)
                    .when()
                    .get("https://petstore.swagger.io/v2/pet/" + id)
                    .then()
                    .log()
                    .body()
                    .statusCode(200)
                    .extract()
                    .response();

        }

    }

    public static void findPetByStatus(String baseUri, StatusFilter status ) {

        {
            RestAssured.given()
                    .baseUri(baseUri)
                    .when()
                    .get("https://petstore.swagger.io/v2/pet/findByStatus?status=" + status)
                    .then()
                    .log()
                    .body()
                    .statusCode(200)
                    .extract()
                    .response();

        }

    }

    public static void deletePet(String baseUri, int petid) {

        {
            RestAssured.given()
                    .baseUri(baseUri)
                    .when()
                    .delete("https://petstore.swagger.io/v2/pet/" + petid)
                    .then()
                    .log()
                    .body()
                    .statusCode(200)
                    .extract()
                    .response();

        }

    }
}
