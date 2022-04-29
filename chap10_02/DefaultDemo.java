package chap10_02;


public class DefaultDemo {
    //p.202
    public static void main(String[] args) {
        Default defaultInstance = new Default();

        defaultInstance.setNum(3);
        System.out.println(defaultInstance.getNum());

        System.out.println(defaultInstance.num);
    }
    
}
