class Solution {
  public int singleNumber(int[] nums) {
      
      Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
      
      for (int i : nums) {
          if (!numbers.containsKey(i)) {
              numbers.put(i, 1);
          } else {
              numbers.put(i, numbers.get(i) + 1);
          }
      }
      
      for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
          if (entry.getValue().equals(1)) {
              return entry.getKey();
          }
      }
      
      return 0;
      
  }
}