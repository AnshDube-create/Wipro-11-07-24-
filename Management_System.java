import java.util.Scanner;

interface Diagnosable{
    void diagnose();
}
interface Treatable
{
    void treat();
}
interface Schedule
{
    void schedule();
}
class Patient 
{
    String name;
    int age;
    public Patient(String n, int a)
    {
      name = n;
      age = a;
    }
    void getInfo(){
    System.out.println("Patient Details :-  ");
    System.out.println("Name  : " + name);
    System.out.println("Age : " + age);
    }
    void Emergencycase(){
        System.out.println("Urgent Diagnosis");

    }
       
} 
class Doctor implements Diagnosable, Treatable, Schedule
{
    String name;
    int age;
    public Doctor(String n, int a) {
        name = n;
        age = a;
    }
    public void diagnose(){
    System.out.println("Patient Diagnosis");
    }
    public void treat(){
        System.out.println("Patient Treated");
    }
    public void schedule(){
        System.out.println("Patient Diagnosis schedule");
    }
    void performSurgery() {
        System.out.println("Surgery performed");
    }
    void getInfo(){
        System.out.println("Doctor's Details :-  ");
        System.out.println("Name  : " + name);
        System.out.println("Age : " + age);
        }
}
public class Management_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient's name:");

        String patientName = scanner.nextLine();
        System.out.println("Enter patient's age:");
        
        int patientAge = scanner.nextInt();
        Patient P = new Patient(patientName, patientAge);
        Doctor D = new Doctor("Dr.Sharma", 34);
        
        P.getInfo();
        D.getInfo();
        
        System.out.println("Urgent Appointment ? (Y/N): ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
    
        if(c == 'Y' || c== 'y'){
            P.Emergencycase();
            D.performSurgery();
            D.treat();

        }
        else if(c == 'N' || c== 'n'){
            D.schedule();
            D.diagnose();
            D.treat();
        }
        else{
            System.out.println("Invalid Input");
        }

           
    }
}
