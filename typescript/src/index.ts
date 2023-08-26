
/** Tipos Primitivos
 * number
 * string
 * boolean
 */

const numero: number = 0
const palavra: string = 'Hello, world!'
const booleano: boolean = false

const imp = 'Implicito'
const exp: string = 'Explicito'

/** Tipos Especiais
 * null
 * undefined
 */

const nulo: null = null
const indefinido: undefined = undefined

/** Tipos Abrangentes
 * any
 * void
 */

let qualquer: any = 'Hello, world!'
qualquer = 0
qualquer = false 

function retornaVazio(): void {}

// Objetos

let pessoa: object = {
    nome: 'João',
    cidade: 'São Paulo'
}

type Produto = {
    id: number,
    nome: string,
    preço: number,
    unidades: number
}

let produto: Produto = {
    id: 1,
    nome: 'Bala',
    preço: 0.99,
    unidades: 100
}

// Arrays

let vetor: number[] = [1, 2, 3, 4, 5]
let vetorString: Array<string> = ['A', 'B', 'C']
let vetorMultiTipos: (string | number)[] = [1, 'A', 2, 'B']

// Tuplas

let transferencia: [string, string, number] = ['Santander', '8501', 950.90]

// Datas

let data: Date = new Date()

// Funções

function soma(x: number, y: number): number {
    return x + y
}

// Funções Multi Tipos

function ligar(telefone: number | string): number | string {
    return telefone
}

// Funções Async

async function getID(cpf: number): Promise<string> {
    return 'Paulo'
}

// Type X Interface
// Type - variáveis
// Interface - classes

type dinheiro = number

interface brinquedo {
    id: number,
    nome: string,
}

// Readonly

interface carro {
    readonly numeroDeSerie: number
    modelo: string
    cor: string
}

const audi: carro = {
    numeroDeSerie: 15019890,
    modelo: "Audi A8",
    cor: "Vermelho"
}

//audi.numeroDeSerie = 38923981 ERROR readonly

class Carro implements carro {
    numeroDeSerie: number
    modelo: string
    cor: string

    constructor(numeroDeSerie: number, modelo: string, cor: string) {
        this.numeroDeSerie = numeroDeSerie
        this.modelo = modelo
        this.cor = cor
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
    protected nome: string
    protected forca: number
    protected skill?: number

    constructor(nome: string, forca: number, skill: number) {
        this.nome = nome
        this.forca = forca
        this.skill = skill
    }

    public attack(): void {
        console.log(`${this.nome} causou ${this.forca * (this.skill || 1)} de dano`)
    }
}

const tahmKench = new Personagem('Tahm Kench', 50, 5)
//tahmKench.attack()

// Subclasses
// Superclass (pai) e Subclass (filho)

class Mago extends Personagem {

    private power: number

    constructor(nome: string, forca: number, skill: number, power: number) {
        super(nome, forca, skill)
        this.power = power
    }

    public magic(): void {
        console.log(`${this.nome} causou ${this.power * (this.skill || 1)} de dano`)
    }
}

const ryze = new Mago("Ryze", 2, 10, 75)
//ryze.magic()

//Generics

function concatenaVetor<T>(...itens: T[]): T[] {
    return new Array().concat(...itens)
}

const lista = concatenaVetor([1,2,3], [4,5])
//lista.push('Texto')

// Decorators