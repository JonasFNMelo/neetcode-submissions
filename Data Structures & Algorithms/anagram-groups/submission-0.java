class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> myList = new ArrayList<>();
        boolean[] usedIndexs = new boolean[strs.length];

        for(int i = 0; i < strs.length; i ++){
            if (usedIndexs[i]) {continue;}
            usedIndexs[i] = true;
            List<String> localList = new ArrayList<>();
            localList.add(strs[i]);
            char[] orderString = strs[i].toCharArray();
            Arrays.sort(orderString);

            for(int j = i + 1; j < strs.length; j ++){
                if (usedIndexs[j]) {continue;} 

                char[] orderComparator = strs[j].toCharArray();
                Arrays.sort(orderComparator);

                if (Arrays.equals(orderComparator,orderString)){
                    usedIndexs[j] = true;
                    localList.add(strs[j]);
                }
            }
            myList.add(localList);
        }
        return myList;
    }
}
