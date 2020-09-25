package XPExcercise;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    void testPrimeNumber(int prim){
        boolean flag = true;
        for(int i = 2; i < prim; i++){
            if (prim % i == 0){
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }

    void testPrimeFactor(){
        int prim = 30;
        int temp = prim;
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> factors = new ArrayList<>();

        for(int i = 2; i < prim; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                primes.add(i);
            }
            System.out.println(primes);
        }
        do{

        }
        while();
    }

}