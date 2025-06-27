package Pratricasozinho.ModificadorStatic;

/*
 * Desafio 2: Constantes da gravidade
Objetivo: Declarar constantes com static final e utilizá-las corretamente.

Calcule o peso de um corpo de 70kg na lua.

Imprima o valor com:
System.out.println("Peso na Lua: " + Fisica.calcularPesoNaLua(70) + " N");

Dicas rápidas:
static = pertence à classe, e não ao objeto.

static final = constante global

Pode usar Math.round() ou Math.ceil() se quiser brincar com arredondamento nos valores.
 */

public class Fisica {
    static final double GRAVIDADE_TERRA = 9.80665;
    static final double GRAVIDADE_LUA = 1.622;

    static double calcularPesoNaLua(double peso) {
        return peso * GRAVIDADE_LUA / GRAVIDADE_TERRA;
    }
}
