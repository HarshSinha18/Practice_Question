public class Main{
  public void Speed(int speed){
    System.out.println("Speed Of Car is "+speed+" km/hour");
    
  }
  static void owner(){
    System.out.println("Harsh Sinha is the Owner of this Car");
    
  }
  public static void main (String [] args){
    Main obj = new Main();
    obj.Speed(120);
    owner();
  }
}
// public method can be called after creating object//
//static method can be called without Creation of object//
