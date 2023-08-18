
const offset = 0
const limit = 10
const url = `https://pokeapi.co/api/v2?offset=${offset}&limit=${limit}`

fetch(url)
    .then(response => {
        console.log(response)
    })
    .catch(error => {
        console.log(error)
    })
    .finally(() => {
        console.log('Request successfully')
    })