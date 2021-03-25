package br.com.zup.pix.chaves;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = { ChavePixValidator.class })
@Target({ TYPE })
@Retention(RUNTIME)
public @interface ChavePixValida {

    String message() default "Chave invalida";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
