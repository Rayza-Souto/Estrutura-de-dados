public class Ordenacoes {
    
    public static int[] Bolha (int numeros []) //bubblesort
    {

        final int n = numeros.length; //recebe o vetor desordenado
        int aux;

        for (int i = 0; i< n-1; i++){ //ordenação dos elementos
            for (int j = 0; j< n-1-i; j++){
                if (numeros [j] > numeros [j+1]){
                    aux = numeros[j];
                    numeros [j] = numeros [j+1];
                    numeros [j+1] = aux;
                }
            }
        }
        return numeros; //recebe o valor ordenado
    }



public static void main (String entrada[]){ //vai realizar a ordenação bolha
    int i, vet[] = {9,4,7,6,2,8,1,3};

    vet = Bolha(vet);
    
    for (i=0; i<10; i++){
        System.out.println(vet[i] +  " ");
    }
    System.exit(0);
    }

    public static void quicksort(int p, int q, int vetor[])
   {
     int x;
     if (p < q)
      {
        x = particao(p, q, vetor);
        quicksort(p, x - 1, vetor);
        quicksort(x + 1, q, vetor);
      }
   }

 

public static int particao(int p, int q, int vetor[])

   {
     int j = p - 1;
     int temp, aux = vetor[q];

     for (int i = p; i <= q; i++)
      {

        if (vetor[i] <= aux)
         {
           j++;
           temp = vetor[i];
           vetor[i] = vetor[j];
           vetor[j] = temp;
         }
      }
     return j;
   }

   public static void merge(int[] a, int inicio, int meio, int fim)
  { 
    int n = fim - inicio + 1;       
    int[] b = new int[n];
    int i1 = inicio;        
    int i2 = meio + 1;     
    int j = 0;            

    while (i1 <= meio && i2 <= fim)
     { 
       if (a[i1] < a[i2])
        { 
          b[j] = a[i1];
          i1++;
        }
       else
        { 
          b[j] = a[i2];
          i2++;
        }
       j = j + 1;
     }
    while (i1 <= meio)
     { 
       b[j] = a[i1];
       i1 = i1 + 1;
       j = j + 1;
     }
    while (i2 <= fim)
     { 
       b[j] = a[i2];
       i2 = i2 + 1;
       j = j + 1;
     }
    for (j = 0; j < n; j++)
     {
       a[inicio + j] = b[j];
     }

  }

 

public static void mergeSort(int[] a, int inicio, int fim)

  { 

    if (inicio == fim)

     {

       return;

     }

    int meio = (inicio + fim) / 2;

    mergeSort(a, inicio, meio);

    mergeSort(a, meio + 1, fim);

    merge(a, inicio, meio, fim);

  }
}
