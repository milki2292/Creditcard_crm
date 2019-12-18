

const getCards = () => {
    const cardsIndexURL = "/api/cards/balances"
    const response = await fetch(cardsIndexURL)
    const data = await response.json()
    return data;
}

const handleAppendCards = (cards) =>{
    const cardsListEl = document.querySelector('.cards__list')
    cards
        .map(card => `<li>${card.number}<li>|${card.saldo}</li>`)
        .forEach(cardHtml => cardsListEl.insertAdjacentHTML("beforend", cardHtml)
}

(() => {
    const cardsListEl = document.querySelector('.cards__list')
    getCards()
        .then(cards => handleAppendCards(cards,cardsListEl))
})
}