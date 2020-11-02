package Dao;

import java.util.List;

public interface DaoMain<T, K> {
	
	void insertar(T a);
	
	void modificar(T a);
	
	void eliminar(T a);
	
	List<T> obtenerTodos();
	T obtener (K id);

}