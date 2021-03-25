package br.com.zup.pix.chaves;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChavePix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chave;

    private String tipoDeChave;

    /**
     * @deprecated uso exclusivo dos frameworks
     */
    @Deprecated
    ChavePix() { }

    public ChavePix(String chave,
                    String tipoDeChave) {
        this.chave = chave;
        this.tipoDeChave = tipoDeChave;
    }
}
