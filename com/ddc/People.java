package test01.smallGadget;

import org.junit.Test;

import java.util.Arrays;

public class TestArray {

    private void changeArray(int [] a){
        a[0]=1;
    }


    /*
        就是测试一下 数组参数传值 送过来的到底是不是引用
        我怎么会怀疑这个呢？ 当然是啊
     */
    @Test
    public void test(){
        int [] w= new int[] {3,2};

        changeArray(w);

        Arrays.stream(w).forEach(System.out::println);

    }


}
