import java.util.Scanner;
public class Average {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter N : ");
int n = sc.nextInt();
double a[] = new double[n];
double sum = 0;
int count = 0;
double average = 0;
System.out.println("Enter the Numbers : ");
for(int i = 0 ; i<n ; i++){
a[i] = sc.nextDouble();
sum+=a[i];
}
average = sum/n;
for(int i = 0 ; i<n ; i++){
if(a[i] > average)
count++;
}
System.out.println("Average : "+average);
System.out.println("Above the Average : " +count);
}
}
