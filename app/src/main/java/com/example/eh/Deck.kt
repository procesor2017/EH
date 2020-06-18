package com.example.eh

class Deck(var card_id: Int, var card_name: String, var card_stavebni_material: Int, var card_mana: Int, var card_war_power: Int) {

    override fun toString(): String {
        return "Deck obsahuje tyto $card_id "
    }
}


