public class Rascunho {

    private String name;
    private int age; 

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }




 public static void main(String[] args){
    var person = new Rascunho();

    person.setName("joão");
    person.setAge(15);

    System.out.print(" Nome: "+person.getName() + " idade: " + person.getAge());

 }
}