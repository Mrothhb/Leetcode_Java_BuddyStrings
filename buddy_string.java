class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() < 2){
            return false;
        }
        if( A.length() != B.length() ){
            return false;
        }
       Set<Character> hash_Set 
            = new HashSet<Character>(); 
        
        boolean saved = false;
        char saveA1 = A.charAt(0);
        char saveA2 = B.charAt(0);
        char saveB1 = B.charAt(0);
        char saveB2 = B.charAt(1);
        int mis = 0;
        
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                mis++;
                if(mis>2){
                    return false;
                }
                if(saved){
                    saveA1 = A.charAt(i);
                    saveB1 = B.charAt(i);
                }else{
                    saveA2 = A.charAt(i);
                    saveB2 = B.charAt(i);
                }
                saved = true;
            }
        }
        
        if(mis == 0){
            for(int i = 0; i<A.length();i++){
                if(hash_Set.contains(A.charAt(i))){
                    return true;
                }
                hash_Set.add(A.charAt(i));
            }
            return false;
        }
       
        if(mis == 2){

            if(saveA1 == saveB2 && saveA2 == saveB1 ){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

