import java.util.* ; 

class Main {
  public static void main(String[] args) {

Scanner it = new Scanner(System.in);

ArrayList <String> lastNames = new ArrayList <String>(); 

lastNames.add("Dagher"); 
lastNames.add("Montgomery"); 
lastNames.add("Han"); 

System.out.println(lastNames) ; 

lastNames.add(1, "Singley"); // adds singley at position 2

System.out.println(lastNames) ; 

System.out.println("The size of lastNames is " + lastNames.size()); 

System.out.println("The String removed is  " + lastNames.remove(0)); // remove takes out the element, and then returns it to you

lastNames.set(0, "Giovanni"); // set is basically like replace. returns the element you replaced

System.out.println("The size of lastNames is " + lastNames.size()); 

lastNames.clear(); 

System.out.println("The size of lastNames is " + lastNames.size()); 

//  adding an Integer and Double into the String ArrayList. this doesn't work because you told java you would only add Strings into the arrayList

Integer x = new Integer(1); 
Double y = new Double(8.30); 
String z = "3" ; 

/*
lastNames.add(x);
lastNames.add(y); 
lastNames.add(z); 
*/ 

// however, the code below will work and run; it just gives you some warnings. this is because you don't clear what data type the arrayList will store

ArrayList demo = new ArrayList(); 

demo.add(x);
demo.add(y); 
demo.add(z); 

System.out.println(demo); 

  }
}