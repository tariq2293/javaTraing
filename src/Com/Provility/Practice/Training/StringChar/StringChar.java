package Com.Provility.Practice.Training.StringChar;

public class StringChar {
    String a = "                    91 = 7 × 13 . Therefore, 7 and 13 are proper factors of 91. " +
            "This means that 91 is a composite number, it isn't prime! However," +
        "although 91 is not a prime number, it is the product of exactly two " +
                "primes: 7 and 13.";

    public static void main(String[] args) {
        StringChar at = new StringChar();
        System.out.println(at.a.replaceAll("[^a-zA-Z0-9]", " "));
        System.out.println(at.a.toUpperCase());
        System.out.println(at.a.trim());
        System.out.println(at.a.replaceAll("\\s", ""));
    }



}
