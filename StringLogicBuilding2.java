//longest prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n=strs.length;
        ArrayList<Integer> len=new ArrayList<>();

        for(int i=0;i<n;i++){
            len.add(strs[i].length());
        }

        int minLength=Collections.min(len);
        int index=-1;
        boolean flag=true;
        for(int i=0;i<minLength;i++){
            for(int j=0;j<n-1;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                index=i;
            }
        }
        if(index==-1){
            return "";
        }
        return strs[0].substring(0,index+1);

    }
}
