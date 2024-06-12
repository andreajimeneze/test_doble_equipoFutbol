package modelosTest;

import modelos.EquipoDeFutbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquipoDeFutbolTest {
    private static int CUATRO_JUEGOS_GANADOS = 4;
    private static int TRES_JUEGOS_PERDIDOS = 3;
    private static int CINCO_JUEGOS_EMPATADOS = 5;
    @Test
    public void constructorDebeSetearJuegosGanados() {
        EquipoDeFutbol equipo1 = new EquipoDeFutbol(CUATRO_JUEGOS_GANADOS, 3, 0);
        assertEquals(CUATRO_JUEGOS_GANADOS, equipo1.getJuegosGanados());
    }

    @Test
    public void constructorDebeSetearJuegosPerdidos() {
        EquipoDeFutbol equipo2 = new EquipoDeFutbol(CUATRO_JUEGOS_GANADOS, TRES_JUEGOS_PERDIDOS, 0);
        assertEquals(TRES_JUEGOS_PERDIDOS, equipo2.getJuegosPerdidos());
    }

    @Test
    public void constructorDebeSetearJuegosEmpatados() {
        EquipoDeFutbol equipo3 = new EquipoDeFutbol(CUATRO_JUEGOS_GANADOS, TRES_JUEGOS_PERDIDOS, CINCO_JUEGOS_EMPATADOS);
        assertEquals(CINCO_JUEGOS_EMPATADOS, equipo3.getJuegosEmpatados());
    }
}
