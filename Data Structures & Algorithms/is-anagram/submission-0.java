class Solution {
    public boolean isAnagram(String s, String t) {
ArrayList<Character> n=new ArrayList<>();
if(s.length()!=t.length()){
    return false;
}
for(int i =0;i<s.length();i++){
    n.add(s.charAt(i));

}
for(int i=0;i<t.length();i++){
    char ch =t.charAt(i);
    if(n.contains(ch)){
        n.remove((Character)ch);
    }
    else{
        return false;
    }

}
return n.isEmpty();
    }
}
