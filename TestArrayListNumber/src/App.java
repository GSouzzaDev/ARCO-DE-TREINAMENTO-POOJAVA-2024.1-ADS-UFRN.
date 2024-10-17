import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> rep = new ArrayList<Integer>();
        ArrayList<Integer> cont = new ArrayList<Integer>();
        int reep=0;
        int min = 10;
        int max = 20;
        int valorMedio;
        Integer[] vetor = new Integer[5];
        
        for(int i=0; i<10; i++){
        int num= (int)(Math.random() * (max-min)-1)+min;
        list.add(num);
        }

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

        for(int i=0; i<rep.size(); i=i+1){
            if (cont.get(i)>1) {
                System.out.print(rep.get(i) + ": " + cont.get(i) + ", ");
            }
        }

        ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
        Collections.sort(clone, Collections.reverseOrder());
        System.out.println(clone);

        Integer maxValor = Collections.max(list);
        list.remove(maxValor);

        Integer minValor = Collections.min(list);
        list.remove(minValor);

        list.addAll(clone);

        System.out.println(list);

        System.out.println(list.size());

        int soma = list.stream()
        .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(soma);

        valorMedio = soma/list.size();

        minValor = Collections.min(list);
        System.out.println(valorMedio);
        System.out.println(list);
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
