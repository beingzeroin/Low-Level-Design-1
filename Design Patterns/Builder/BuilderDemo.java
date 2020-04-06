public class BuilderDemo {
  BuilderDemo(){
    System.out.println("Builder Demo is called");
  }
  public static void main(String[] args) {
    Bird croww = new Bird.Builder().setHeight(50).setColor("Black").setWeight(10).build();
    Bird parrot = new Bird.Builder().setHeight(50).setWeight(6).setName("Parrot").setColor("Green").build();
    Bird femaleCrow = new Bird.Builder().setHeight(30).setWeight(4).setName("Female croww").build();

    croww.printDetails();
    femaleCrow.printDetails();
    parrot.printDetails();

  }
}
