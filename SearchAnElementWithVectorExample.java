import java.util.Vector;
 
public class SearchAnElementInVectorExample {
 
  public static void main(String[] args) {
   
    //create a Vector object
    Vector v = new Vector();
   
    //Add elements to Vector
    v.add("1");
    v.add("2");
    v.add("3");
    v.add("4");
    v.add("5");
    v.add("1");
    v.add("2");
 
    /*
      To check whether the specified element exists in Java Vector use
      boolean contains(Object element) method.
      It returns true if the Vector contains the specified objct, false
      otherwise.
    */
   
    boolean blnFound = v.contains("3");
    System.out.println("Does Vector contain 3 ? " + blnFound);
 
    /*
      To get an index of specified element in Vector use
      int indexOf(Object element) method.
      This method returns the index of the specified element in Vector.
      It returns -1 if not found.
    */
 
    int index = v.indexOf("5");
    if(index == -1)
      System.out.println("Vector does not contain 5");
    else
      System.out.println("Vector contains 5 at index :" + index);
     
    /*
      To get last index of specified element in Vector use
      int lastIndexOf(Object element) method.
      This method returns index of the last occurrence of the
      specified element in Vector. It returns -1 if not found.
    */
 
    int lastIndex = v.lastIndexOf("2");
    if(lastIndex == -1)
      System.out.println("Vector does not contain 2");
    else
      System.out.println("Last occurrence of 2 in Vector is at index :" + lastIndex);
     
  }   
}
