public class DecisionMaking {
    public static void main(String[] args) {
        System.out.println("--Simple if statement--");
        int number = 10;
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }
        System.out.println("--Using if-else--");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
            System.out.println("--Using if-else-if--");
            int score= 100;
            if (score >= 90) {
                System.out.println("Grade A");
            } else if (score >= 80) {
                System.out.println("Grade B");
            } else if (score >= 70) {
                System.out.println("Grade C");
            } else if (score >= 60) {
                System.out.println("Grade D");
            } else {
                System.out.println("Grade F");
            }
           System.out.println("--Nested if statement--");
            int Salary= 15000;
            if (Salary >= 10000) {
                if (Salary >= 20000) {
                    System.out.println("You have good salary package.");
                } else {
                    System.out.println("You have average salary package.");
                }
            } else {
                System.out.println("You have low salary package.");
            }
        }
    }