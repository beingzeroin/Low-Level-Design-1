public class Bird {
  int weight,height;
  String color,name;

  private Bird(Builder details){
    // System.out.println("Bird class is called");
    this.weight = details.weight;
    this.height = details.height;
    this.color = details.color;
    this.name =  details.name;
  }

  void printDetails(){
    System.out.println(this.name + " bird has " + this.weight + " weight and fly at "  + this.height + " and has color " + this.color);

  }

  // public static nested builder class to initialise Bird class vars.

  public static class Builder{
    int weight,height;
    String color,name;
    // constructor to set default values for variabels
    public Builder(){
      this.weight = 5;
      this.height = 30;
      this.color = "default from const.";
      this.name = "default from const.";
    }



    public Builder setHeight(int height ){
      this.height = height;
      return this;
    }

    public Builder  setWeight(int  weight){
      this.weight = weight;
      return this;
    }


    public Builder  setColor(String color){
      this.color = color;
      return this;
    }


    public Builder  setName(String  name){
      this.name = name;
      return this;
    }

    public Bird build(){
      Bird temp = new Bird(this);
      return temp;
    }

  }

}
