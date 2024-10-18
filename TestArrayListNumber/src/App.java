import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
        public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> rep = new ArrayList<Integer>();
        ArrayList<Integer> cont = new ArrayList<Integer>();
        int reep=0;
        int min = 10;
        int max = 20;
        int valorMedio;
        Integer[] vetor = new Integer[5];
        
        //randomly generating numbers
        for(int i=0; i<10; i++){
        int num= (int)(Math.random() * (max-min)-1)+min;
        list.add(num);
        }

        //counting how many times each number is repeated
        for (int i = 0; i < list.size(); i++) {
            reep = 1; 
            if (!rep.contains(list.get(i))) {
                for (int u = i + 1; u < list.size(); u++) {
                    if (list.get(i).equals(list.get(u))) { 
                        reep++;
                    }
                }
                rep.add(list.get(i));
                cont.add(reep);
            }
        }

        //showing numbers that are repeated 2 or more times
        for(int i=0; i<rep.size(); i=i+1){
            if (cont.get(i)>1) {
                System.out.print(rep.get(i) + ": " + cont.get(i) + ", ");
            }
        }
        System.out.println("-------------------------------");

        //cloning the original list
        ArrayList<Integer> clone = new ArrayList<Integer>(list);
        Collections.sort(clone, Collections.reverseOrder());
        System.out.println("Cloned list: " + clone);
        System.out.println("Original list: " +list);

        //removing the highest value
        Integer maxValor = Collections.max(list);
        list.remove(maxValor);

        //removing the smallest value
        Integer minValor = Collections.min(list);
        list.remove(minValor);

        //joining the original and cloned list
        list.addAll(clone);
        System.out.println("joined lists: " + list);
        //United represent a size 18:
        System.out.println("list size: " + list.size());

        //adding the list elements
        int soma = list.stream()
        .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("sum: " + soma);

        valorMedio = soma/list.size();
        System.out.println("Average: " + valorMedio);

        //finding the smallest value
        minValor = Collections.min(list);
        System.out.println("lowest value: " + minValor);
        
        //replacing the lowest value with the average
        list.set(list.indexOf(minValor), valorMedio);
        System.out.println(list);

        vetor[0]=1;
        vetor[1]=1;
        vetor[2]=1;
        vetor[3]=1;
        vetor[4]=1;

        List<Integer> lista = new ArrayList<>(Arrays.asList(vetor));

        System.out.println(lista);
    }
}
