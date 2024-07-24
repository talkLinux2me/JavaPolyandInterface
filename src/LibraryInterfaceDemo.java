public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser saul = new KidUser(10, "Kids");
        KidUser r = new KidUser(18, "Fiction");

        saul.requestBook();
        r.requestBook();
        saul.registerAccount();
        r.requestBook();


        AdultUser steven = new AdultUser(5, "Kids");
        AdultUser edwin = new AdultUser(23, "Fiction");

        steven.requestBook();
        edwin.registerAccount();
        steven.requestBook();
        edwin.registerAccount();

    }
}
