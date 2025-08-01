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

(or)
//we are only checking the first and last string in lexicography order because it pushes the strings with largest difference.
//In case any mismatch is present then it is also present in the strings inbetween
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);

        String first=strs[0];
        int l1=first.length();
        String last=strs[n-1];
        int l2=last.length();

        int index=-1;
        for(int i=0;i<Math.min(l1,l2);i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            index=i;
        }

        if(index==-1){
            return "";
        }
        return strs[0].substring(0,index+1);
    }
}
