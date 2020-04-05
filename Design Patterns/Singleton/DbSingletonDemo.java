public class DbSingletonDemo{

  public static void main(String[] args) {

    DbSingleton instance = DbSingleton.getInstance();

    System.out.println(instance);

    DbSingleton SecondInstance = DbSingleton.getInstance();

    System.out.println(SecondInstance);

  }

}
