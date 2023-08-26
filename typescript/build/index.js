"use strict";
/** Tipos Primitivos
 * number
 * string
 * boolean
 */
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
const numero = 0;
const palavra = 'Hello, world!';
const booleano = false;
const imp = 'Implicito';
const exp = 'Explicito';
/** Tipos Especiais
 * null
 * undefined
 */
const nulo = null;
const indefinido = undefined;
/** Tipos Abrangentes
 * any
 * void
 */
let qualquer = 'Hello, world!';
qualquer = 0;
qualquer = false;
function retornaVazio() { }
// Objetos
let pessoa = {
    nome: 'João',
    cidade: 'São Paulo'
};
let produto = {
    id: 1,
    nome: 'Bala',
    preço: 0.99,
    unidades: 100
};
// Arrays
let vetor = [1, 2, 3, 4, 5];
let vetorString = ['A', 'B', 'C'];
let vetorMultiTipos = [1, 'A', 2, 'B'];
// Tuplas
let transferencia = ['Santander', '8501', 950.90];
// Datas
let data = new Date();
// Funções
function soma(x, y) {
    return x + y;
}
// Funções Multi Tipos
function ligar(telefone) {
    return telefone;
}
// Funções Async
function getID(cpf) {
    return __awaiter(this, void 0, void 0, function* () {
        return 'Paulo';
    });
}
const audi = {
    numeroDeSerie: 15019890,
    modelo: "Audi A8",
    cor: "Vermelho"
};
//audi.numeroDeSerie = 38923981 ERROR readonly
class Carro {
    constructor(numeroDeSerie, modelo, cor) {
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.cor = cor;
    }
}
// Classes
/*
    Data Modifiers
    - public
    - private
    - protected
*/
// "?" torna um atributo opcional
class Personagem {
    constructor(nome, forca, skill) {
        this.nome = nome;
        this.forca = forca;
        this.skill = skill;
    }
    attack() {
        console.log(`${this.nome} causou ${this.forca * (this.skill || 1)} de dano`);
    }
}
const tahmKench = new Personagem('Tahm Kench', 50, 5);
//tahmKench.attack()
// Subclasses
// Superclass (pai) e Subclass (filho)
class Mago extends Personagem {
    constructor(nome, forca, skill, power) {
        super(nome, forca, skill);
        this.power = power;
    }
    magic() {
        console.log(`${this.nome} causou ${this.power * (this.skill || 1)} de dano`);
    }
}
const ryze = new Mago("Ryze", 2, 10, 75);
//ryze.magic()
//Generics
function concatenaVetor(...itens) {
    return new Array().concat(...itens);
}
const lista = concatenaVetor([1, 2, 3], [4, 5]);
console.log(lista);
