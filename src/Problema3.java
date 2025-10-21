public class Problema3 {
    static int[] aduna(int[] a, int[] b){
        int n = a.length, t = 0;
        int[] r = new int[n+1];
        for (int i = n - 1; i >= 0; i--) {
            int s = a[i] + b[i] + t;
            r[i + 1] = s % 10;
            t = s / 10;
        }
        r[0] = t;
        if (r[0] == 0){
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = r[i+1];
            return x;
        }
        return r;
    }
    static int[] scadere(int[] a, int[] b){
        int n = a.length, d = 0;
        int[] r = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int x = a[i] - b[i] - d;
            if (x < 0){
                x += 10;
                d = 1;
            }
            else d = 0;
            r[i] = x;
        }
        return r;
    }
    static int[] inmultire(int[] a, int c) {
        int n = a.length, t = 0;
        int[] r = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int p = a[i] * c + t;
            r[i + 1] = p % 10;
            t = p / 10;
        }
        r[0] = t;
        if (r[0] == 0) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = r[i + 1];
            return x;
        }
        return r;
    }
    static int[] impartire(int[] a, int c) {
        int n = a.length, rest = 0;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            int cur = rest * 10 + a[i];
            r[i] = cur / c;
            rest = cur % c;
        }
        return r;
    }
    static void afis(int[] x) {
        for (int v : x) System.out.print(v + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1,3,0,0,0,0,0,0,0};
        int[] b = {8,7,0,0,0,0,0,0,0};
        System.out.print("Suma: "); afis(aduna(a,b));

        int[] a2 = {8,3,0,0,0,0,0,0,0};
        int[] b2 = {5,4,0,0,0,0,0,0,0};
        System.out.print("Diferenta: "); afis(scadere(a2,b2));

        int[] a3 = {2,3,6,0,0,0,0,0,0};
        System.out.print("Inmultire: "); afis(inmultire(a3,2));
        System.out.print("Impartire: "); afis(impartire(a3,2));
    }
}
