package ru.dexsys;


public class RestPetShop {
    public static void main(String[] args) {
        String baseUri = "https://petstore.swagger.io/v2/pet";
        String bodyAdd = "{\n" +
                "  \"id\": 8,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"Rex\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
//        restRequests.addPet(baseUri, bodyAdd);

        String bodyUpdate = "{\n" +
                "  \"id\": 8,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"Hatiko\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
//        restRequests.updatePet(baseUri, bodyUpdate);

        int id = 8;
//        restRequests.findPetById(baseUri, id);

        restRequests.findPetByStatus(baseUri, StatusFilter.available    );

        int petid = 8;
//        restRequests.deletePet(baseUri, petid);

    }
}
