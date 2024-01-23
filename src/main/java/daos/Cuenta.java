package daos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta", schema = "public")
public class Cuenta {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_cuenta")
    private Long id_cuenta;

    @Column(name = "numeroCuenta")
    private String numeroCuenta;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "fch_apertura")
    private Date fch_apertura;

    @Column(name = "conNomina")
    private Boolean conNomina;

    @ManyToOne
    @JoinColumn(name="id_user")
    private Usuario usuario;

    @OneToMany(mappedBy="cuentaEnvia")
    private List<Transacion> transacionesEnviadas;

    @OneToMany(mappedBy="cuentaRecive")
    private List<Transacion> transacionesRecibidas;

    @OneToMany(mappedBy="cuenta")
    private List<Credito> creditos;
    
    public Cuenta() {
    	
    }

	public Long getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(Long id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getFch_apertura() {
		return fch_apertura;
	}

	public void setFch_apertura(Date fch_apertura) {
		this.fch_apertura = fch_apertura;
	}

	public Boolean getConNomina() {
		return conNomina;
	}

	public void setConNomina(Boolean conNomina) {
		this.conNomina = conNomina;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Transacion> getTransacionesEnviadas() {
		return transacionesEnviadas;
	}

	public void setTransacionesEnviadas(List<Transacion> transacionesEnviadas) {
		this.transacionesEnviadas = transacionesEnviadas;
	}

	public List<Transacion> getTransacionesRecibidas() {
		return transacionesRecibidas;
	}

	public void setTransacionesRecibidas(List<Transacion> transacionesRecibidas) {
		this.transacionesRecibidas = transacionesRecibidas;
	}

	public List<Credito> getCreditos() {
		return creditos;
	}

	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}
    
    
}
