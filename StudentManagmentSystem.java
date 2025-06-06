import java.util.Scanner;

class Student{
    String name;
    int age;
    int usn;
    public int exam_fee=500;
    public int sem_fee=1500;

    Student(String name,int age,int usn){
        this.name=name;
        this.age=age;
        this.usn=usn;
    }
    public String toString(){
        return "name: "+ name +" age: "+age+" usn: "+usn;
    }
}
class RegularStudents extends Student{
    int class_attened;
    RegularStudents(String name,int age,int usn,int class_attened){
        super(name, age, usn);
        this.class_attened=class_attened;
    }
    void claculatefee(){
        int fee=sem_fee*class_attened;
        int total_fee=fee+exam_fee;
        System.out.println("total fee (included exam fee-500): "+total_fee);
    }
    public String toString(){
        return super.toString()+" class attened: "+class_attened;
    }
}
class IrregularStudent extends Student{
    int class_attened;
    IrregularStudent(String name,int age,int usn,int class_attened){
        super(name, age, usn);
        this.class_attened=class_attened;
    }
    void claculatefee(){
            int total_fee=sem_fee*class_attened;
            System.out.println("total fee ( excluded exam fee because you are not eligible to write exam due to low attendence): "+total_fee);
        }
    public String toString(){
        return super.toString()+" class attened: "+class_attened;
    }
}
public class StudentManagmentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of students in class: ");
        int n=sc.nextInt();
        RegularStudents[] rs=new RegularStudents[n];
        IrregularStudent[] irs=new IrregularStudent[n];
        for (int i=0;i< rs.length;i++){
            sc.nextLine();
            System.out.print("enter the student name: ");
            String name=sc.nextLine();
            System.out.print("enter the student age: ");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.print("enter the student usn: ");
            int usn=sc.nextInt();
            System.out.println("total class attened: ");
            int class_attened=sc.nextInt();
            if (class_attened>10){
                rs[i]=new RegularStudents(name,age,usn,class_attened);
                System.out.println(rs[i]);
                rs[i].claculatefee();
                System.out.println("thank you");
                System.out.println("-----------------------------");
            }else {
                irs[i]=new IrregularStudent(name,age,usn,class_attened);
                System.out.println(irs[i]);
                irs[i].claculatefee();
                System.out.println("thank you");
                System.out.println("--------------------------------");
            }

        }
    }
}
