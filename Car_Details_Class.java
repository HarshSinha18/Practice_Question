class car{
int  price , model_year ;
String colour , model_name;
public void  set_data ( String m_n ,  String c , int m_y , int p){
price =p;
model_year = m_y;
colour = c;
model_name = m_n;
}
public void display (){
System.out.println("Model_Name : "+model_name+" ("+model_year+") Model with "+colour+" Varient Comes in the price of Rs " +price+" only .");
}
}
public class Car_Details{
public static void main(String [] args){
car car1 = new car();
car1.set_data("Maruti Sizuki" , "White" , 2012 , 2500000 );
car1.display();
car car2 = new car();
car2.set_data("Ferrari" , "Red" , 2019 , 4200000);
car2.display();
}
}
