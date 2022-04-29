package chap10_03.chap10_03_01;
import chap10_03.ProtectedParent;

public class ProtectedChild extends ProtectedParent{

    void setNum(int num){

        super.num = num;
    }

    int getNum(){
        return super.num;
    }
    
}
