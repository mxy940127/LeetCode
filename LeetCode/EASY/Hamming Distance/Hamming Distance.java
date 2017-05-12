public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int c = 0;
        while (z >0)
    {
        if((z &1) ==1) // 当前位是1
            ++c ; // 计数器加1
        z= z>>1 ; // 移位
    }
    return c ;
}
}