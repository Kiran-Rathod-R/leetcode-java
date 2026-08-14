class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int elem : nums) {

            if (map.containsKey(elem)) {
                int freq = map.get(elem);
                map.put(elem, freq + 1);

            }
            else{

            map.put(elem, 1);
            }

        }

        System.out.print(map);

        for (int ele : map.keySet()) {
            int freq = map.get(ele);

            if (freq == 1) {
                return ele;
            }
        }

        return 0;

    }
}