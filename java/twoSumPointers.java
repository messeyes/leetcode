// usando ponteiros

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int esquerda = 0;          // <- cria dois ponteiros, um no inicio do array e outro no final
        int direita = nums.length - 1;

        while (esquerda < direita) {   // <- itera aproximando os ponteiros até eles se cruzarem
            int somaAtual = nums[esquerda] + nums[direita]; // <- faz a soma com os ponteiros atuais
            if (somaAtual == target) { // <- se a soma for igual ao alvo, retorna os indices
                return new int[]{esquerda, direita};
            }
        
            if (somaAtual < target) { // <- se a soma for menor, move o ponteiro para a esquerda
                esquerda++;
            } 
           
            else {  // <- senão (soma maior), move o ponteiro para direita
                direita--;
            }
        }
      
        return null; // <- se nenhum dos dois somar o valor do alvo, retorna nulo
    }
}
