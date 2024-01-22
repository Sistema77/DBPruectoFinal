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
@Table(name = "transacion", schema = "public")
public class Transacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_trasaciones")
	private Long id_trasaciones;

	@Column(name = "cantidadDinero")
	private Double cantidadDinero;

	@Column(name = "Fecha_Hora")
	private Date Fecha_Hora;

	@ManyToOne
	@JoinColumn(name = "cuentaEnvia")
	private Cuenta cuentaEnvia;

	@ManyToOne
	@JoinColumn(name = "cuentaRecive")
	private Cuenta cuentaRecive;

	public Transacion() {
	}
}
