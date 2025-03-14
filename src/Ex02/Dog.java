package Ex02;
//3. Ví dụ
public class Dog extends Animals{
    private int type;
    public Dog(String name){
        super(name);
    }
    public void eat(){
        System.out.println("Dog eat food");
    }
}
