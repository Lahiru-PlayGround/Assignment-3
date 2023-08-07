import java.util.Scanner;

class Demo1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String redColour = "\033[31m";
        String greenColour = "\033[32m";
        String blueColour = "\033[34m";
        String yellowColoue ="\033[33m";
        String blueColourUpper = "\033[34;1m";
        String noColour = "\033[0;0m";
        String line = "+----------+----------+---------------------------+\n";
        //System.out.println(redColour);
        myBlock:
        {
            System.out.print("Enter Your Name : ");
            String name = scanner.nextLine();
            String nameWithoutSpace = name.stripLeading();

            if(nameWithoutSpace.length()>0){
                name = nameWithoutSpace;
            }else{
                System.out.println(redColour+"Invalid Name"+noColour);
                if (true) break myBlock;
            }

            System.out.print("Enter Your Age : ");
            int age = scanner.nextInt();

            if(age <10 || age > 18 ){
                System.out.println(redColour+"Invalid Age"+noColour);
                if (true) break myBlock;

            }
        
            System.out.print("Enter Your Subject 1 : ");
            String sub1 = scanner.next();
            boolean startWithSE = sub1.startsWith("SE-");

            if(!startWithSE){
                System.out.println(redColour+"Invalid Subject Name"+noColour);
                if (true) break myBlock; 
            }

            System.out.print("Enter Your Subject 1 Marks : ");
            double sub1_Marks = scanner.nextDouble();

            if(sub1_Marks<0 || sub1_Marks>100){
                System.out.println(redColour+"Invalid Marks"+noColour);
                if (true) break myBlock;
            }

            System.out.print("Enter Your Subject 2 : ");
            String sub2 = scanner.next();
            startWithSE = sub2.startsWith("SE-");

            if(!startWithSE){
                System.out.println(redColour+"Invalid Subject Name"+noColour);
                if (true) break myBlock; 
            }else if (sub2.equals(sub1)){
                System.out.println(redColour+"Subject Name Alredy Exists"+noColour);
                if (true) break myBlock;
            }

            System.out.print("Enter Your Subject 2 Marks : ");
            double sub2_Marks = scanner.nextDouble();

            if(sub2_Marks<0 || sub2_Marks>100){
                System.out.println(redColour+"Invalid Marks"+noColour);
                if (true) break myBlock;
            }

            System.out.print("Enter Your Subject 3 : ");
            String sub3 = scanner.next();
            startWithSE = sub3.startsWith("SE-");

            if(!startWithSE){
                System.out.println(redColour+"Invalid Subject Name"+noColour);
                if (true) break myBlock; 
            }else if(sub3.equals(sub1)||sub3.equals(sub2)){
                System.out.println(redColour+"Subject Name Alredy Exists"+noColour);
                if (true) break myBlock;
            }

            System.out.print("Enter Your Subject 3 Marks : ");
            double sub3_Marks = scanner.nextDouble();

            if(sub3_Marks<0 || sub3_Marks>100){
                System.out.println(redColour+"Invalid Marks"+noColour);
            }
            System.out.println();

            name = name.toUpperCase();
            System.out.println("Name :  "+blueColourUpper+name+noColour);
            System.out.println("Age :   "+age+" Years Old");

            double total =sub1_Marks+sub2_Marks+sub3_Marks;
            double avarage =total/3;

            String statusAll = avarage>=75?blueColour+"Distinguished Pass(DP)"+noColour: avarage>=65?greenColour+"Credit Pass(CP)"+noColour:avarage>=55?yellowColoue+"Pass(P)"+noColour:redColour+"Fail(F)"+noColour;
            String statusSub1 = sub1_Marks>=75?blueColour+"Distinguished Pass(DP)"+noColour: sub1_Marks>=65?greenColour+"Credit Pass(CP)"+noColour:sub1_Marks>=55?yellowColoue+"Pass(P)"+noColour:redColour+"Fail(F)"+noColour;
            String statusSub2 = sub2_Marks>=75?blueColour+"Distinguished Pass(DP)"+noColour: sub2_Marks>=65?greenColour+"Credit Pass(CP)"+noColour:sub2_Marks>=55?yellowColoue+"Pass(P)"+noColour:redColour+"Fail(F)"+noColour;
            String statusSub3 = sub3_Marks>=75?blueColour+"Distinguished Pass(DP)"+noColour: sub3_Marks>=65?greenColour+"Credit Pass(CP)"+noColour:sub3_Marks>=55?yellowColoue+"Pass(P)"+noColour:redColour+"Fail(F)"+noColour;
            System.out.println("Status :    "+statusAll);

            int lastNumberSub1 = Integer.valueOf(sub1.substring(3));
            int lastNumberSub2 = Integer.valueOf(sub2.substring(3));
            int lastNumberSub3 = Integer.valueOf(sub3.substring(3));
            

            System.out.printf("Total :   %.2f        Avg :  %.2f\n",total,avarage);
            System.out.printf(line+"| %-9s| %-9s| %-26s|\n"+line,"Subject","Marks","Status");
            System.out.printf("| SE-%03d%3s| %-9.2f| %-37s|\n",lastNumberSub1, " ",sub1_Marks,statusSub1);
            System.out.printf("| SE-%03d%3s| %-9.2f| %-37s|\n",lastNumberSub2," ", sub2_Marks,statusSub2);
            System.out.printf("| SE-%03d%3s| %-9.2f| %-37s|\n"+line,lastNumberSub3," ", sub3_Marks,statusSub3);




        }
    }
}