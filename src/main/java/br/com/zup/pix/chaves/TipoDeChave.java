package br.com.zup.pix.chaves;

import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;
import org.springframework.util.StringUtils;

// Open-close principle
public enum TipoDeChave {

    CPF {

        @Override
        public boolean valida(String chave) {
            CPFValidator cpfValidator = new CPFValidator();
            cpfValidator.initialize(null);

            return cpfValidator.isValid(chave, null);
        }
    },
    EMAIL {

        @Override
        public boolean valida(String chave) {
            EmailValidator emailValidator = new EmailValidator();
            emailValidator.initialize(null);

            return emailValidator.isValid(chave, null);
        }
    },
    ALEATORIA {

        @Override
        public boolean valida(String chave) {
            return !StringUtils.hasText(chave);
        }
    },

    TELEFONE {
        @Override
        public boolean valida(String chave) {
            return chave.matches("\\d+");
        }
    };


    public abstract boolean valida(String chave);
}
