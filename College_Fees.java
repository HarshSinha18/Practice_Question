class c_fees{
String clg_name;
double clg_fees;
c_fees(){ //Default Constructor //
}
}
public class constructor {
public static void main(String[]args){
c_fees clg1 = new c_fees ();
c_fees clg2 = new c_fees ();
clg1.clg_name = "Iter";
clg1.clg_fees = 900000.0;
clg2.clg_name = "Kiit";
clg2.clg_fees = 1200000.0;
System.out.println("clg name     clg fees");
System.out.println();
System.out.println(clg1.clg_name+":         "+clg1.clg_fees);
System.out.println(clg2.clg_name+":         "+clg2.clg_fees);
}
}
