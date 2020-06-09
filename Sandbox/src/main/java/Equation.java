public class Equation {

    private int n;

    public Equation(int a, int b, int c) {

        int d =b*b-4*a*c;

        if (d > 0) {
            n = 2;
        } else {
          if (d == 0) {
              n = 1;
          } else {
              n = 0;
        }
    }
}
    public int rootNumber() {
        return n;
    }
    }
