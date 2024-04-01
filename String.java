class Mobile
{
  String brand;
  int price;
  String name ; 
 

  public void show()
  {
  System.out.println(brand +":"+ price +":" + name);
  }
}
  public class Hello
  {
    public static void main(String args[])
    {
      Mobile obj1= new Mobile();

      obj1.brand= "Apple";
      obj1.price=1199;
      obj1.name="iphone 12";

      Mobile obj2= new Mobile();

      obj2.brand= "Samsung";
      obj2.price=1099;
      obj2.name="s 22";
      
      obj1.show();
      obj2.show();

    }


    }
  
    