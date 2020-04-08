import java.util.*;

interface Validator {
  void validator();
}

class USValidator implements Validator {

  public void validator(){
    System.out.println("This is US validator function");
  }
}

class INValidator implements Validator{

  public void validator(){
    System.out.println("This is India validator function");
  }
}



// This is singleton class because we only need it once.
public class ValidatorFactory {

  private static Map<String,Validator> countryToValidator = new HashMap<String,Validator>();
  private static ValidatorFactory instance=null;

  private ValidatorFactory(){
    countryToValidator.put("US",new USValidator());
    countryToValidator.put("IN",new INValidator());
    // countryToValidator.put("US",new USValidator());
  }

  public static ValidatorFactory getInstance(){
    if(instance==null){
      instance = new ValidatorFactory();
    }
    return instance;
  }

  public Validator getValidator(String country){
    if(!countryToValidator.containsKey(country)){
      throw new RuntimeException("This country validator does not exist yet");
    }
    return countryToValidator.get(country);
  }

}
