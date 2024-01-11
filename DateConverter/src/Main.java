import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);

        System.out.println("Input Date (YY-MM-DD):");
         String Date=sca.nextLine();

         String [] part= Date.split("-");
         int year=Integer.parseInt(part[0]);
         int month=Integer.parseInt(part[1]);
         int day=Integer.parseInt(part[2]);
    String letterMonth=getMname(month);

    if(letterMonth=="Month does not Exit!"){
        System.out.println("Wrong date inputted!");
    }
    else {
        System.out.println(letterMonth +" "+day+ ","+year);
    }

    sca.close();


    }
    public static String getMname(int num){
        String[] monthName ={"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        if(num>=1 &&num <=12){
            return monthName[num-1];
        }
        else {
            return"Month does not Exit!"
;        }
    }
}