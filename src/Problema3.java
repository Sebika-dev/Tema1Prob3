public class Problema3 {
    static int[] aduna(int[] num1, int[] num2){
        int len = num1.length, carry = 0;
        int[] res = new int[len+1];
        for (int i = len - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            res[i + 1] = sum % 10;
            carry = sum / 10;
        }
        res[0] = carry;
        if (res[0] == 0){
            int[] trimRes = new int[len];
            for (int i = 0; i < len; i++) trimRes[i] = res[i+1];
            return trimRes;
        }
        return res;
    }
    static int[] scadere(int[] num1, int[] num2){
        int len = num1.length, borrow = 0;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0){
                diff += 10;
                borrow = 1;
            }
            else borrow = 0;
            res[i] = diff;
        }
        return res;
    }
    static int[] inmultire(int[] num1, int div) {
        int len = num1.length, carry = 0;
        int[] res = new int[len + 1];
        for (int i = len - 1; i >= 0; i--) {
            int prod = num1[i] * div + carry;
            res[i + 1] = prod % 10;
            carry = prod / 10;
        }
        res[0] = carry;
        if (res[0] == 0) {
            int[] trimRes = new int[len];
            for (int i = 0; i < len; i++) trimRes[i] = res[i + 1];
            return trimRes;
        }
        return res;
    }
    static int[] impartire(int[] num1, int div) {
        int len = num1.length, rem = 0;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int curr = rem * 10 + num1[i];
            res[i] = curr / div;
            rem = curr % div;
        }
        return res;
    }
    static void afis(int[] arr) {
        for (int arrVal : arr) System.out.print(arrVal + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num1a = {1,3,0,0,0,0,0,0,0};
        int[] num2a = {8,7,0,0,0,0,0,0,0};
        System.out.print("Suma: "); afis(aduna(num1a,num2a));

        int[] num1b = {8,3,0,0,0,0,0,0,0};
        int[] num2b = {5,4,0,0,0,0,0,0,0};
        System.out.print("Diferenta: "); afis(scadere(num1b,num2b));

        int[] num1c = {2,3,6,0,0,0,0,0,0};
        System.out.print("Inmultire: "); afis(inmultire(num1c,2));
        System.out.print("Impartire: "); afis(impartire(num1c,2));
    }
}
