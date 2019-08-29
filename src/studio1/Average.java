package studio1;


import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("First amount of grams to be averaged?");
        int n2 = ap.nextInt("Second amount of grams to be averaged?");
       double avg = (double) (n1+ n2) / 2;
        System.out.println("The average is " + avg + " grams.");


    }
}
