public class ZipValidator {
  boolean validateZip(String zip){
    ResourceInit instance = ResourceInit.getInstance();
    return instance.checkIfZipValid(zip);
  }

}
