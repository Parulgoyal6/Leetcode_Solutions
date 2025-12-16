class Solution {
  String convertToTitle(int columnNumber) {
     String result = "";

    while (columnNumber > 0) {
        columnNumber--;
        int rem = columnNumber%26;
        result = String.fromCharCode(65+rem) +  result;
        columnNumber~/= 26;
    }
    return result;
  }
}