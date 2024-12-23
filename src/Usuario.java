import java.io.Serializable;

@ITabela("Nome da classe é Usuario")
public class Usuario implements Serializable {
    @ITabela("getCodigo")
    private Long codigo;
}
