package Com.Provility.Practice.Training.StringChar;

public class throwException {
    public static void validate(int age) {
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");

        }
        else {
            System.out.println("Person eligible to vote");
        }
    }

    public static void main(String[] args) {
        validate(17);
        System.out.println("rest of the code...");
    }
}
