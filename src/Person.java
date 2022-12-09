import business.Company;

public class Person {
    private String firstName;
    private int age;
    private long id;
    private char middleInitial;
    private byte myByte;
    private static Company company = new Company();
    private static Company company1 = new Company();
    private NewsAgency agency;

    public static void main(String[] args) {
        System.out.println(company);
        System.out.println(company1);
    }
}
