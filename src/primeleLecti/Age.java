package primeleLecti;

public class Age {
    public static void main(String[] args) {
        int age = 0;
        if(age <= 6) {
            System.out.println("Generation Alpha");
        } if(age > 6 && age <= 20) {
            System.out.println("Generation Z");
        } if (age > 20 && age <= 35) {
            System.out.println("Generation Y");
        } if (age > 35 && age <= 50) {
            System.out.println("Generation X");
        } if (age > 50 && age <= 69) {
            System.out.println("Baby Boomers");
        } if (age >= 70) {
            System.out.println("Builders");
        }

    }
}