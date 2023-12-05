package pe.BoraBora.response;

import org.springframework.http.HttpStatus;

public class CategoriaResponse {
	
	private String message;
    private HttpStatus status;
	
	private Integer id;
	private String nombre;
	
	public CategoriaResponse() {
	}

	public CategoriaResponse(String message, HttpStatus status, Integer id, String nombre) {
		super();
		this.message = message;
		this.status = status;
		this.id = id;
		this.nombre = nombre;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
