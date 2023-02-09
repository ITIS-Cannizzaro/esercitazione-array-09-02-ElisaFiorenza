import java.util.Scanner;
public class Fiorenza
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n.1 - Titolo es. Ordinare due array in un terzo");
		System.out.println("2 - Es n.2 - Titolo es. Copia tutti i valori maggiori o uguali a zero");
	}

	static int[] array1es1 = new int[5];
	static int[] array2es1 = new int[5];
	static int[] array1es2 = new int[10];
	static int[] arrayRisultato= new int[10];
	public static void es1()
	{
			Scanner in = new Scanner(System.in);
			System.out.println("Inserisci 5 numeri nel primo array:");
			for(int i = 0; i < array1es1.length; i++)
			{
				System.out.println("Inserisci il "+(i + 1)+"° numero");
				array1es1[i] = Integer.parseInt(in.nextLine());
			}
			System.out.println("Inserisci 5 numeri nel secondo array:");
			for(int i = 0; i < array2es1.length; i++)
			{
				System.out.println("Inserisci il "+(i + 1)+"° numero");
				array2es1[i] = Integer.parseInt(in.nextLine());
			}
			for(int k = 0, i = 0; k < arrayRisultato.length; k++)
			{
				if(k < array1es1.length)
				{
					arrayRisultato[k] = array1es1[k];
				}
				if(k >= array1es1.length)
				{
				    arrayRisultato[k] = array2es1[i];
				    i++;
			    }
			}
			for(int i = 0; i < arrayRisultato.length; i++)
			{
				for(int j = 0; j < arrayRisultato.length; j++)
				{
					if(arrayRisultato[i] < arrayRisultato[j])
					{
						swap(i,j);
					}
				}
			}
			System.out.println("I numeri presenti negli array in ordine sono:");
			System.out.print("| ");
			for(int i = 0; i < arrayRisultato.length; i++)
			{
				System.out.print(arrayRisultato[i]+" | ");
			}
			System.out.print("\n");
	}
	public static void swap(int a,int b)
	{
			int copia = arrayRisultato[a];
			arrayRisultato[a] = arrayRisultato[b];
			arrayRisultato[b] = copia;
	}
	public static void es2()
	{
			Scanner in = new Scanner(System.in);
			int lungarray = 0;
			System.out.println("Ecco 10 numeri casuali:");
			for(int i = 0; i < array1es2.length; i++)
			{
				array1es2[i] = (int) (Math.random()*20)-10;
				System.out.print(array1es2[i]+",");
			}
			System.out.print("\n");
			for(int i = 0; i < arrayRisultato.length; i++)
			{
				for(int j = 0; j < array1es2.length; j++)
				{
					if(array1es2[j] >= 0)
					{
						arrayRisultato[i] = array1es2[j];
						array1es2[j] = -1;
						lungarray += 1;
						break;
					}
				}
			}
			for(int i = 0; i < lungarray; i++)
			{
				for(int j = 0; j < lungarray; j++)
				{
					if(arrayRisultato[i] < arrayRisultato[j])
					{
						swap(i,j);
					}
				}
			}
			System.out.println("Ecco i numeri maggiori o uguali a 0 in ordine inverso:");
			System.out.print("| ");
			for(int i = lungarray-1;i >= 0; i--)
			{
				System.out.print(arrayRisultato[i]+" | ");
			}
			System.out.print("\n");
	}
}
