class Solution {
  List<int> getRow(int rowIndex) {
    List<int> row = List.filled(rowIndex + 1, 1);

    for (int i = 2; i <= rowIndex; i++) {
      for (int j = i - 1; j > 0; j--) {
        row[j] = row[j] + row[j - 1];
      }
    }

    return row;
  }
}
