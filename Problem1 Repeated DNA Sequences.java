O(N) time and space solution

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub = s.substring(i,i+10);
            if (!seen.contains(sub)){
                seen.add(sub);
            }
            else {
                repeated.add(sub);
            }
        }
        return new ArrayList(repeated);
    }
}
