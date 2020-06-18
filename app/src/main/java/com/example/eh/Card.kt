package com.example.eh

class Card {
    private var deck: List<Deck> = listOf()

    fun addCard(card_id: Int, card_name: String, card_stavebni_material: Int, card_mana: Int, card_war_power: Int, cardAtttack: Int, cardDeffens: Int, cardDescribe: String){
        deck += Deck(card_id, card_name, card_stavebni_material, card_mana, card_war_power)
    }

    fun findCard(card_id: Int): List<Deck>{
        var foundCard: List<Deck> = listOf()
        for (z in deck){
            if (card_id == z.card_id){
                foundCard += z
            }
        }
        return foundCard
    }

    fun deleteCard(card_id: Int){
        val found = findCard(card_id)
        deck -= found
    }

}