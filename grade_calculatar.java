import java.util.Scanner;

public class grade_calculatar {

    public static void main(String[] args) {
        int math;
        int eng;
        int phy;
        int chem;
        int bee;
        float avg;
        float perc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math marks: ");
        math = sc.nextInt();

        System.out.println("Enter English marks: ");
        eng = sc.nextInt();

        System.out.println("Enter Physics marks: ");
        phy = sc.nextInt();

        System.out.println("Enter Chemistry marks: ");
        chem = sc.nextInt();

        System.out.println("Enter BEE marks: ");
        bee = sc.nextInt();

        avg = (math + eng + phy + chem + bee)/(float) 5;

        perc = ((math + eng + phy + chem + bee)/(float) 500)*100;

        System.out.println("All subjects marks are");
        System.out.println("Math marks: " +math);
        System.out.println("English marks: " +eng);
        System.out.println("Physics marks: " +phy);
        System.out.println("Chemistry marks: " +chem);
        System.out.println("BEE marks: " +bee);
        System.out.println("Average of all subjects is: "+avg);
        System.out.println("Percentage: "+perc+"%");
        
        if (perc >= 85){
            System.out.println("student passed with A grade");
        }
        else if (perc >= 70) {
            System.out.println("student passed with B grade");
        } 
        else if (perc >= 55) {
            System.out.println("student passed with C grade");
        } 
        else if (perc >= 35) {
            System.out.println("student passed with D grade");
        }
        else {
            System.out.println("student failed the exam");
        }
            
        
        sc.close();
    }
}