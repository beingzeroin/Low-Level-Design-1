import java.util.Arrays;
public class DbSingletonDemo{
  private static String[] zipCodeList = {"203205","250003"};
  public static void main(String[] args) {

    DbSingleton instance = DbSingleton.getInstance();

    System.out.println(instance);

    boolean test = Arrays.asList(zipCodeList).contains("203205");
      if(test){
        System.out.println("Fine");
      }
      else{
        System.out.println("Not fine");
      }
  }

}
