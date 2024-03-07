public class Tree {

	Nodo raiz;

	Tree() {
		raiz = null;
	}

	void insertar(int valor) {
		raiz = insertarRec(raiz, valor);
	}

	Nodo insertarRec(Nodo nodo, int valor) {
		if (nodo == null) {
			nodo = new Nodo(valor);
			return nodo;
		}

		if (valor < nodo.dato) {
			nodo.izquierda = insertarRec(nodo.izquierda, valor);
		} else if (valor > nodo.dato) {
			nodo.derecha = insertarRec(nodo.derecha, valor);
		}

		return nodo;
	}

	void imprimirEnOrden() {
		imprimirEnOrdenRec(raiz);
	}

	void imprimirEnOrdenRec(Nodo nodo) {
		if (nodo != null) {
			imprimirEnOrdenRec(nodo.izquierda);
			System.out.print(nodo.dato + " ");
			imprimirEnOrdenRec(nodo.derecha);
		}
	}

	void imprimirEnOrdenDerechaIzquierda() {
		imprimirEnOrdenRecDerechaIzquierda(raiz);
	}

	void imprimirEnOrdenRecDerechaIzquierda(Nodo nodo) {
		if (nodo != null) {
			imprimirEnOrdenRecDerechaIzquierda(nodo.derecha);
			System.out.print(nodo.dato + " ");
			imprimirEnOrdenRecDerechaIzquierda(nodo.izquierda);
		}
	}

	void imprimirPreOrden() {
		imprimirPreOrdenRec(raiz);
	}

	void imprimirPreOrdenRec(Nodo nodo) {
		if (nodo != null) {
			System.out.print(nodo.dato + " ");
			imprimirPreOrdenRec(nodo.izquierda);
			imprimirPreOrdenRec(nodo.derecha);
		}
	}

	void imprimirPreOrdenDerechaIzquierda() {
		imprimirPreOrdenRecDerechaIzquierda(raiz);
	}

	void imprimirPreOrdenRecDerechaIzquierda(Nodo nodo) {
		if (nodo != null) {
			System.out.print(nodo.dato + " ");
			imprimirPreOrdenRecDerechaIzquierda(nodo.derecha);
			imprimirPreOrdenRecDerechaIzquierda(nodo.izquierda);
		}
	}

	void imprimirPostOrden() {
		imprimirPostOrdenRec(raiz);
	}

	void imprimirPostOrdenRec(Nodo nodo) {
		if (nodo != null) {
			imprimirPostOrdenRec(nodo.izquierda);
			imprimirPostOrdenRec(nodo.derecha);
			System.out.print(nodo.dato + " ");
		}
	}

	void imprimirPostOrdenDerechaIzquierda() {
		imprimirPostOrdenRecDerechaIzquierda(raiz);
	}

	void imprimirPostOrdenRecDerechaIzquierda(Nodo nodo) {
		if (nodo != null) {
			imprimirPostOrdenRecDerechaIzquierda(nodo.derecha);
			imprimirPostOrdenRecDerechaIzquierda(nodo.izquierda);
			System.out.print(nodo.dato + " ");
		}
	}
}
