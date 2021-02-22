package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa (val nome: String, var veiculos: List <Veiculo>, val dataDeNascimento: Date){
    var carta: Carta ?= null
    var posica: Posicao ?= null

    fun comprarVeiculo(veiculo: Veiculo){

    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){


    }

    fun moverVeiculo(identificador: String, x: Int, y: Int){

    }

    /*

    fun pesquisarVeiculo(identificador: String): Veiculo {

    }

    fun temCarta(): Boolean{

    }
     */

    fun tirarCarta(){

    }
}