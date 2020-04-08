public class FactoryMain {

  void validatorC(String country){
    ValidatorFactory.getInstance().getValidator(country).validator();

  }

  public static void main(String[] args) {

    FactoryMain validateAdd = new FactoryMain();
    validateAdd.validatorC("US");
    validateAdd.validatorC("IN");
    validateAdd.validatorC("NZ");

  }
}
