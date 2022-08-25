class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            arr.add(i);
        }
        
        int index=0;
        
        while(arr.size()>1)
        {
            int next=(index+k-1)%arr.size();
            arr.remove(next);
            index=next;
        }
        
        int ans=arr.get(0);
        
        return ans;
    }
}
