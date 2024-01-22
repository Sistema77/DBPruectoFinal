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
}
