package daos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "credito", schema = "public")
public class Credito {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Credito")
	private Long id_Credito;

	@Column(name = "tipoPrestamo")
	private String tipoPrestamo;

	@Column(name = "CantidadPrestamo")
	private Double CantidadPrestamo;

	@Column(name = "tasaInteres")
	private Double tasaInteres;

	@Column(name = "EstadoPrestamo")
	private String EstadoPrestamo;

	@Column(name = "CuotaMensual")
	private Double CuotaMensual;

	@Column(name = "fch_inicio")
	private Date fch_inicio;

	@Column(name = "fch_final")
	private Date fch_final;

	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;
	
	public Credito() {}
}
