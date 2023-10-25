package app.models;

public class UsersModel {

    /**
     * Method to store user admin data
     * 
     * @return admin data of multidimensions array
     */
    public static String[][] staticDataByAdmin() {
        String[][] admin = { { "Neville", "Jeremy" }, { "12345", "54321" } };
        return admin;
    }

    /**
     * Method to return users data depends on fillable field data
     * 
     * @return users data
     */
    public String[][] data() {
        return staticDataByAdmin();
    }
}
