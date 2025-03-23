package org.ulrich.test.springboot.app.models;

import java.math.BigDecimal;

public class TransaccionDto {
    private long cuentaOrigenId;
    private long cuentaDestinoId;
    private BigDecimal monto;
    private long bancoId;

    public long getCuentaOrigenId() {
        return cuentaOrigenId;
    }

    public void setCuentaOrigenId(long cuentaOrigenId) {
        this.cuentaOrigenId = cuentaOrigenId;
    }

    public long getCuentaDestinoId() {
        return cuentaDestinoId;
    }

    public void setCuentaDestinoId(long cuentaDestinoId) {
        this.cuentaDestinoId = cuentaDestinoId;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public long getBancoId() {
        return bancoId;
    }

    public void setBancoId(long bancoId) {
        this.bancoId = bancoId;
    }
}
