package chap12;

public class chap12_02 {
    //익명 클래스 예제 p.259
    int oNum;

    abstract class InnerClass{
        int iNum;
        abstract void innerMethod(int iP);
    }

    InnerClass inner = new InnerClass(){
        void innerMethod(int iP){
            iNum = iP;
            System.out.println("This is an inner class " + iP + " " + oNum);
        }
    };

    void outerMethod(int oP){
        oNum = oP;

        inner.innerMethod(oP);

        System.out.println("This is an outer class " +oP+ " " + inner.iNum);
    }

    public static void main(String[] args) {
        chap12_02 outer = new chap12_02();
        outer.outerMethod(3);
    }
}
