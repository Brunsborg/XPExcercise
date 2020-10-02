package XPExcercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    void testPrimeNumber(){
        int prim = 31;
        boolean flag = true;
        for(int i = 2; i < prim; i++){
            if (prim % i == 0){
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }
    @Test
    void testPrimeFactor(){
        int prim = 117;
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
            for(int i = 0; i < primes.size(); i++){
                if (temp % primes.get(i)== 0){
                    factors.add(primes.get(i));
                    temp = temp / primes.get(i);
                    break;
                }
            }
        }
        while(temp != 1);
        System.out.println("The prime factors of " + prim + " are: ");
        for(int i = 0; i < factors.size(); i++){
            System.out.print(factors.get(i));
            if (i < factors.size() - 1){
                System.out.print(", ");
            }
        }
    }

}