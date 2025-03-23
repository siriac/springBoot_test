package org.ulrich.test.springboot.app;

import org.ulrich.test.springboot.app.models.Banco;
import org.ulrich.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;
import java.util.Optional;

public class Datos {
    //public final static Cuenta CUENTA_001 = new Cuenta(1L, "Andres", new BigDecimal("1000"));
    //public final static Cuenta CUENTA_002 = new Cuenta(2L, "Jhon", new BigDecimal("2000"));
    //public final static Banco BANCO = new Banco(1L, "El banco", 0);

    public static Optional <Cuenta> crearCuenta001(){

        return Optional.of(new Cuenta(1L, "Andres", new BigDecimal("1000")));
    }
    public static Optional <Cuenta> crearCuenta0002(){

        return Optional.of(new Cuenta(2L, "Jhon", new BigDecimal("2000")));
    }
    public static Optional <Banco> crearBanco(){

        return Optional.of(new Banco(1L, "El banco", 0));
    }
}
