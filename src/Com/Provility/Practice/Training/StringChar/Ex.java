package Com.Provility.Practice.Training.StringChar;

public class Ex {
    void display(){
        try{
            String str = null;
            System.out.println(str.length());

        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println("Exception handled.....");
    }
}
class Except{
    public static void main(String[] args) {
        Ex obj = new Ex();
        obj.display();
    }
}
