package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BaseDtsPlatos menuDeopciones = new BaseDtsPlatos();
        BaseDtsClientes listaDeClientes = new BaseDtsClientes();
        BaseDtsMesas disponibilidadMesas = new BaseDtsMesas();
        BaseDtsPedidos ordenesRealizadas = new BaseDtsPedidos();

        /*menuDeopciones.InfoDelPlatillo();// informacion del platillo
        listaDeClientes.ingresarDatos();// Lista de clientes */
        ordenesRealizadas.infoPedidos();// registro de pedidos
        //disponibilidadMesas.infoMesas();// Informacion de las mesas
    }
}
