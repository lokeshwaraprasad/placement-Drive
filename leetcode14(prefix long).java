class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String first = strs[0];

        // Loop through each character of first string
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            // Compare with same index in all other strings
            for (int j = 1; j < strs.length; j++) {

                // If index exceeds OR characters mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        // Entire first string is common prefix
        return first;
    }
}
