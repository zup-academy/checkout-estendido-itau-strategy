package br.com.zup.pix.chaves;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChavePixValidator implements ConstraintValidator<ChavePixValida, NovaChavePixRequest> {


    @Override
    public boolean isValid(NovaChavePixRequest novaChavePix, ConstraintValidatorContext context) {
        String chave = novaChavePix.getChave();
        TipoDeChave tipoDeChave = novaChavePix.getTipoDeChave();

        // padrao de projeto (design pattern) -> Strategy

        // cheia de ifs -> forte candidata ao stategy

        return tipoDeChave.valida(chave);
    }
}
