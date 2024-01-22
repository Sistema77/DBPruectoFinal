package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario", schema = "public")
public class Usuario {

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "id_usuario")
	    private Long id_usuario;

	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "dni")
	    private String dni;

	    @Column(name = "lastName")
	    private String lastName;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "password")
	    private String password;

	    @Column(name = "tlf")
	    private String tlf;

	    @Column(name = "foto")
	    private byte[] foto;

	    @Column(name = "tipoUsuario")
	    private String tipoUsuario;

	    @OneToMany(mappedBy="usuario")
	    private List<Cuenta> cuentas;
	    
	    public Usuario() {}
}
