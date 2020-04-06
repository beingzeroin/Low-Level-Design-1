public class AddressValidator  {
  CityValidator c = new CityValidator();
  ZipValidator z = new ZipValidator();
  boolean validate(String zipCode,String cityName){
    return z.validateZip(zipCode) && c.validateCity(cityName);
  }
  public static void main(String[] args) {
    AddressValidator validateAdd = new AddressValidator();
    System.out.println(validateAdd.validate("203205","Meerut"));
  }
}
