package view;

import br.mari.listaInt.Lista;

public class Principal {

	public static void main(String[] args) {
		int []l= {1,2,6,7,8};
		Lista j= new Lista();
		for(int valor:l) {
			if (j.isEmpty()) {
				j.addFirst(valor);
			}else {
				try {
					j.addLast(valor);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				
		}
		System.out.println(j.size());
		int a = j.size();
		for (int k=0;k <a;k++) {
			for(int valor:l)
			try {
				if(j.get(k)==valor) {
					j.addLast(valor);
				}else if(valor%2==0) {
					j.add(valor,2);
				}else {
					j.addFirst(valor);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
		for(int v=0;v < j.size();v++) {
			try {
				System.out.print(" "+j.get(v));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
