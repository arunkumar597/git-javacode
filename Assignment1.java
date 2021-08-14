
import java.util.Scanner;
class Assignment1 {

    public static void main(String[] args) {
	

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Age");
        int age = sc.nextInt();
		sc.nextLine();
        System.out.println("Enter your Blood Group");
        String group = sc.nextLine();
		
        System.out.println("--------------------");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Blood Group: " +group);
        System.out.println("--------------------");

        if(age>=20)
        {
            System.out.println("Your group is RED");
        }
        else if(age>=15 && age<20)
        {
            System.out.println("Your group is BLUE");
        }
        else if(age>=10 && age<15)
        {
            System.out.println("Your group is YELLOW");
        }
		else if(age<10)
		{
			System.out.println("Warning : Age should be greater than or equal to 10");
		}
        System.out.println("--------------------");
		
    }
}
