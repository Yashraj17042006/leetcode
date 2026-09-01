class Solution {
    public int countCommas(int n) {
        int comma=0;
        long factor=1000;
        while(n>=factor){
            comma+=(n-factor+1);
            factor*=1000;
        }
        return comma;
    }
}