// usando hashmap

class Solution {
  public int[] twoSum(int[] nums, int target){
    Map<Integer, Integer> numMap = new HashMap<>(); // <- cria um map para armazenar os números e os índices
    for (int i = 0; i < nums.lenght; i++) { // <- itera sobre os números dentro do array
      int complement = target - nums[i]; // <- calcula quanto falta para chegar no alvo
      if (numMap.constainskey(complement)){ // <- se o complemento já existir no map, retorna os índices dos dois números
        return new int[]{numMap.get(complement), i};
      }
      num.Map.put(nums[i], i); // <- senão, adiciona o número atual e o índice dele no map
    }
    return null; // <- se nenhum dos dois números somarem o valor alvo, retorna nulo
  }
}


          
      
