import java.util.Arrays;

public class ResourceInit {
  private static ResourceInit instance = null;
  private String[] zipCodeList = {"203205","250003"};
  private String[] city = {"Sikandrabd","Meerut"};
  private ResourceInit(){
    if(instance!=null){
      throw new RuntimeException("Use getInstance() method to create");
    }
  }

  public static ResourceInit getInstance(){
      if(instance ==  null){
        instance = new ResourceInit();
      }

      return instance;
    }

  public boolean checkIfZipValid(String zip){
    boolean test = Arrays.asList(zipCodeList).contains(zip);
      // if(test==true){
      //   return true;
      // }
      return true;

  }
  public boolean checkIfCityValid(String ciity){
      boolean test = Arrays.asList(city).contains(ciity);
      // if(test==true){
      //   return true;
      // }
      return true;

  }


}
