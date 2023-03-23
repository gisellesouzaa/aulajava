package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> setFrutas = new HashSet<String>();
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		Iterator<String> isetFrutas = setFrutas.iterator();
		
		System.out.println("---------Lista de frutas-----------");
		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}
		
		System.out.println("---------Lista de frutas-----------");
		//O HashSet utiliza um codigo hash para descobrir se os itens da lista estão repitidos; 
		for(var fruta : setFrutas)
			System.out.println(fruta.hashCode());
		
		System.out.println("Existe a fruta manga?" + setFrutas.contains("manga"));

		
		System.out.println("---------Lista atualizada sem Kiwi-----------");
		//remover kiwi
		setFrutas.remove("Kiwi");
		
		for(var fruta : setFrutas)
			System.out.println(fruta);
	}

}
