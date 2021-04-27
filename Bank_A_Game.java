import java.util.Scanner;
public class Bank_Game{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
System.out.println("Welcome to Our Bank  ");
System.out.println("***********************");
double current_balance = 0.0;
int deposit = 0;
int withdraw = 0;
int opt = 0;
for(int i = 0 ; i<=1000 ; i++){
System.out.println("Enter 1 : For Know Current Balance");
System.out.println("Enter 2 : For Deposit Money ");
System.out.println("Enter 3 : For Withdrawal Money ");
System.out.println("Enter 4 : Exit");
System.out.println(); 
System.out.print("Enter Your Option : ");
opt = sc.nextInt();
System.out.println();
if(opt>=5 )
System.out.println("Enter Valid Number ");
System.out.println();
if(opt<=0)
System.out.println("Enter Valid Number ");
System.out.println();
switch(opt){
case 1:
System.out.println("Your Current Balance is : "+current_balance+" Rs ");
System.out.println();
break;
case 2 :
System.out.print("How Much Money do you want to Deposit : ");
deposit = sc.nextInt();
current_balance+=deposit;
System.out.println();
System.out.println(+deposit+ " Rs Deposit Successfully.");
System.out.println();
break;
case 3:
System.out.print("How Much Money do you Want to Withdrawal: ");
withdraw = sc.nextInt();
System.out.println();
if(withdraw>current_balance){
System.out.println();
System.out.println("You Have Not Sufficient Balance for withdrawal this Amaount .");
System.out.println();
System.out.print("Again Enter Amount : ");
withdraw = sc.nextInt();
current_balance-=withdraw;
System.out.println(+withdraw+" Rs Successfully Withdraw");
System.out.println();
}else{
current_balance-=withdraw;
System.out.println(+withdraw+" Rs Successfully Withdraw");
System.out.println();
}
break;
case 4:
System.out.println("Thanks for Using Our Bank App");
break;
}
if(opt==4)
break;
}
}
}
