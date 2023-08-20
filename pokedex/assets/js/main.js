
const offset = 0
const limit = 10
const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`

function pokemonToListItem(pokemon) {
    return `
        <li class="pokemon">
            <span class="number">${pokemon.number}</span>
            <span class="name">${pokemon.name}</span>

            <div class="detail">
                <ol class="types">
                    
                </ol>

                <img src=""
                    alt="${pokemon.name}">
            </div>
        </li>
    `
}

const pokemonList = document.getElementById('pokemonList')

fetch(url)
    .then(response => response.json())
    .then(jsonBody => jsonBody.results)
    .then(pokemons => {
        for (let i of pokemons) {
            const pokemon = i
            pokemonList.innerHTML += pokemonToListItem(pokemon)
        }
    })
    .catch(error => console.log(error))