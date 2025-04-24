import java.util.Scanner;
public class students_result_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] subs=new int[6];
        int total=0;
        System.out.println("-------------------------------------------");
        System.out.println("           student results calculator               ");
        System.out.println("-------------------------------------------");
            System.out.println("enter student name= ");
            String name=sc.next();
            System.out.println("enter roll number= ");
            int roll_no=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the marks= ");
            System.out.println("enter the all subjects marks(out of 100)= ");
            for (int j=0;j<=5;j++){
                System.out.println("enter sub"+(j+1)+" marks= ");
                subs[j]=sc.nextInt();
                total+=subs[j];
            }
            float percentage= ((float) total/600)*100;
            System.out.println("name= "+name);
            System.out.println("roll no= "+roll_no);
            System.out.println("total marks= "+ total);
            System.out.println("percentage= "+percentage);
            if(percentage>=90){
                System.out.println("congrats...\nyou secured ----\n >> 'A' GRADE ");
            } else if (90>percentage && percentage>=75) {
                System.out.println("congrats...\nyou secured ----\n >> 'B' GRADE ");
            }else if (75>percentage && percentage>=60) {
                System.out.println("congrats...\nyou secured ----\n >> 'C' GRADE ");
            }else {
                System.out.println("better luck next time...\nyou scored less----\n read well nexttime");
            }

            System.out.println("-----------------------------------------");
        }
    }

