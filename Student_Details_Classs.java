public class Student{
int Roll , Marks , Admission_Year;
String Name;
public void set_details(int r , int m , int a , String n){
Roll = r;
Marks = m;
Admission_Year = a;
Name = n;
}
public void show_data(){
System.out.println(Name+" :: Roll: "+Roll+" , Marks: "+Marks+" ,  Admission_year: "+Admission_Year);
}
public static void main(String[]args){
Student Harsh = new Student();
Student Anoushka = new Student();
Harsh.set_details(1 , 54 , 2019 , "Harsh Sinha");
Anoushka.set_details( 2 , 55 , 2020 , "Anoushka Raj");
Harsh.show_data();
Anoushka.show_data();
}
}
