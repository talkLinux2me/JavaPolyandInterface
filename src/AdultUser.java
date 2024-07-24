public class AdultUser implements LibraryUser{

    public int age;
    public String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (this.age >= 12){
            System.out.println("You have successfully registered under an Adult Account.");
        } else if (this.age <= 11) {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");

        }
    }






    @Override
    public void requestBook() {
        if (this.bookType == "Fiction"){
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        }else System.out.println("Oops, you are allowed to take only adult Fiction books.");
    }





}
