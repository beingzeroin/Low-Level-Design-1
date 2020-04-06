public class DbSingleton {

  private static DbSingleton instance = null;

  private DbSingleton(){
    if(instance!=null){
      throw new RuntineException("Use getInstance() method to create");
    }
  }

  public static DbSingleton getInstance(){
      if(instance ==  null){
        instance = new DbSingleton();
      }

      return instance;
    }
}
