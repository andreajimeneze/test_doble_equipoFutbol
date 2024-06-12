package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipoDeFutbol {
    int juegosGanados;
    int juegosPerdidos;
    int juegosEmpatados;
}
