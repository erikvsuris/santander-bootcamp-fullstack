class CardNews extends HTMLElement {
    constructor() {
        super()

        const shadow = this.attachShadow({mode: 'open'})
        shadow.appendChild(this.build())
        shadow.appendChild(this.styles())
    }

    build() {
        const componentRoot = document.createElement('div')
        componentRoot.setAttribute('class', 'card')

        const cardLeft = document.createElement('div')
        cardLeft.setAttribute('class', 'card-left')

        const cardRight = document.createElement('div')
        cardRight.setAttribute('class', 'card-right')

        componentRoot.appendChild(cardLeft)
        componentRoot.appendChild(cardRight)

        const autor = document.createElement('span')
        autor.textContent = 'By ' + (this.getAttribute('autor') || 'Anonymous')
        
        const titulo = document.createElement('a')
        titulo.textContent = this.getAttribute('titulo')

        const subtitulo = document.createElement('p')
        subtitulo.textContent = this.getAttribute('subtitulo')

        cardLeft.appendChild(autor)
        cardLeft.appendChild(titulo)
        cardLeft.appendChild(subtitulo)

        const image = document.createElement('img')
        image.src = this.getAttribute('image')
        image.alt = this.getAttribute('alt')

        cardRight.appendChild(image)

        return componentRoot
    }

    styles() {
        const style = document.createElement('style')
        
        style.textContent = `
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            
                font-family: 'Segoe UI', Tahoma, Verdana, sans-serif;
            }
            
            .container {
                margin: 50px 0;
            }
            
            .card {
                display: flex;
                flex-direction: row;
                justify-content: space-around;
                margin: 50px auto;
                width: 720px;
                height: 180px;
                box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.5);
                -webkit-box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.5);
                -moz-box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.5);
            }
            
            .card-left {
                display: flex;
                flex-direction: column;
                justify-content: space-around;
                width: 50%;
            }
            
            .card-left > span {
                font-weight: light;
                color: gray;
            }
            
            .card-left > a {
                text-decoration: none;
                font-weight: bold;
                font-size: 25px;
                color: black;
            }
            
            .card-left > p {
                font-weight: normal;
                font-size: 15px;
                color: gray;
            }
            
            .card-right {
                display: flex;
                justify-content: center;
                width: 40%;
            }
            
            .card-right img {
                align-self: center;
                width: 100%;
            }
        `

        return style
    }
}

customElements.define('card-news', CardNews)