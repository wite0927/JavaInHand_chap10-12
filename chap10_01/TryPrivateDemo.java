package chap10_01;

public class TryPrivateDemo {
    //p.200
    public static void main(String[] args) {
        Private pObject = new Private();

        pObject.setNum(3);
        System.out.println(pObject.getNum());

        // System.out.println(pObject.num);
        // num 은 private로 선언해서 참조 불가
    }
}