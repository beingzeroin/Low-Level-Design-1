public class CityValidator {
  boolean validateCity(String city){
    ResourceInit instance = ResourceInit.getInstance();
    return instance.checkIfCityValid(city);
  }

}
