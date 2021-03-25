package br.com.zup.pix.chaves;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.StringJoiner;


@ChavePixValida
public class NovaChavePixRequest {

    private String chave;

    @NotNull
    private TipoDeChave tipoDeChave;

    public String getChave() {
        return chave;
    }

    public TipoDeChave getTipoDeChave() {
        return tipoDeChave;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", NovaChavePixRequest.class.getSimpleName() + "[", "]")
                .add("chave='" + chave + "'")
                .add("tipoDeChave='" + tipoDeChave + "'")
                .toString();
    }
}
