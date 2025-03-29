package org.ulrich.test.springboot.app.services;

import org.ulrich.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;
import java.util.List;

public interface CuentaService {
    List<Cuenta> findAll();
    Cuenta save(Cuenta cuenta);
    void deleteById(Long id);
    Cuenta findById(Long id);
    int revisarTotalTransferencias(Long bancoId);
    BigDecimal revisarSaldo(Long cuentaId);
    void transferir (Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto, Long bancoId);
}
