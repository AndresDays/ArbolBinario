public class Principal {
	public static void main(String[] args) {
		Tree arbol = new Tree();

		arbol.insertar(4);
		arbol.insertar(2);
		arbol.insertar(8);
		arbol.insertar(9);
		arbol.insertar(5);

		System.out.println("\nEn Orden Izquierda-Derecha:");
		arbol.imprimirEnOrden();
		System.out.println("\n\nEn Orden Derecha-Izquierda:");
		arbol.imprimirEnOrdenDerechaIzquierda();
		System.out.println("\n\nPost Orden Izquierda-Derecha:");
		arbol.imprimirPostOrden();
		System.out.println("\n\nPost Orden Derecha-Izquierda:");
		arbol.imprimirPostOrdenDerechaIzquierda();
		System.out.println("\n\nPre Orden Izquierda-Derecha:");
		arbol.imprimirPreOrden();
		System.out.println("\n\nPre Orden Derecha-Izquierda:");
		arbol.imprimirPreOrdenDerechaIzquierda();
	}
}
