package chap12;

public class chap12_01 {
    private int oNum;

    class InnerClass{
        private int iNum;

        void innerMethod(int iP){
            iNum = iP;
            System.out.println("This is an inner class "+iP+""+oNum);
        }
    }

    void outerMethod(int oP){
        oNum = oP;
        InnerClass inner = new InnerClass();
        inner.innerMethod(oP);

        System.out.println("This is an outer class "+oP+""+inner.iNum);
    }
    
    public static void main(String[] args) {
        chap12_01 outer = new chap12_01();
        outer.outerMethod(3);

        chap12_01.InnerClass newInner = outer.new InnerClass();
        newInner.innerMethod(4);
    }
}
// p.250
// static을 쓰려면 내부 클래에서 클래스 선언부에 static만 붙히면 된다.
// static 내부 클래스에서 쓰이는 외부 참조 메소드나 변수는 static이 동일하게 붙어 있어야된다.
// 예시)
// static int iNum;
// static class InnerClass{ ... }