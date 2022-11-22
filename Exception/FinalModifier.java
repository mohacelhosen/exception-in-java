package Exception;

public class FinalModifier {
    public static void main(String[] args) {
        FinalVariable obj1 = new FinalVariable();
        obj1.ID = 1003;
        obj1.show();

        Student st1 = new Student();
        st1.name = "Mohacel";
        st1.id=1002;
        st1.greeting(st1.name);
        st1.show();
    }
}
class FinalVariable{
    final int ID =1002;
   final String COMPANY_NAME ="Mohacel IT";
    public  void show(){
        System.out.println(COMPANY_NAME+" "+ID);
    }
}

 final class Info{
    String name;
    final public void greeting(String name){
        System.out.println("welcome, "+name);
    }
}

class Student extends Info{
    int id;
    public void show(){
        System.out.println(name+" your id "+id);
    }
    public void greeting(String name){
        System.out.println("Hi,😉 "+name);
    }
}
