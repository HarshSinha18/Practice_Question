import java.util.Scanner;
public class Password {
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int i = 0;
    int opt = 0;
    long user_id = 0;
    long user_password = 0;
    long id = 0;
    long password = 0;
    for(i = 0 ; i<= 1000 ; i++){
    System.out.println("Press 1 : For Sign - Up");
    System.out.println("Press 2 : For Log  in ");
    System.out.print("Enter Your Option : ");
    opt = sc.nextInt();
    switch (opt){
      case 1:
        System.out.println();
        System.out.print("User Id( min 6 Number) : ");
        user_id = sc.nextLong();
        System.out.print("Password (min 6 Number): ");
        password = sc.nextLong();
        System.out.println();
        System.out.println("Congratulation! You Have Successfully Created Id.");
        System.out.println();
        break;
        case 2:
        System.out.println();
        System.out.print("Enter Your Id: ");
        id = sc.nextLong();
        System.out.print("Enter Your Password : ");
        password = sc.nextLong();
        if( password != user_password){
        System.out.println();
        System.out.println("Please write correct Information");
        System.out.println();
     }else if( id != user_id){
        System.out.println();
        System.out.println("Please write correct Information");
        System.out.println();
        }else{
        System.out.println();
        System.out.println("");
        System.out.println("Welcome");
        System.out.println("Congrats You Have Successfully Log in");
        System.out.println();
        System.out.println();
        }
        
        
      break;
    }
    }
    }
    }
    // Not Solved //
