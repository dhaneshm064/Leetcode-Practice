class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1.0;
        if(x == 0)
            return 0.0;
        if(n > 0)
        {
            double val = myPow(x, n/2);
            val = val * val;
                System.out.println("> "+val);
            if(n%2 != 0)
                return val*x;
            return val;
        }else{
            double val = myPow(x, n/2);
            val = val * val;
            System.out.println("< "+val);
            if(n%2 != 0)
                return val/x;
            return val;
        }
    }
}