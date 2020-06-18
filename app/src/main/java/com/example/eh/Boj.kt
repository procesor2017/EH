package com.example.eh

class Boj (private val player: Player, private val enemy: Enemy){
    // Player inicializating
    var playerName = player.name()
    var playerClass = player.pclass()
    var playerHp = player.health()
    var playerStavitele = player.stavitele()
    var playerStavebniMaterial = player.stavebniMaterial()
    var playerKrystaly = player.krystaly()
    var playerMana = player.mana()
    var playerKasarna = player.kasarna()
    var playerWarResources = player.warResources()
    var playerWall = player.wall()

    // Enemy inicializating
    var enemyrName = enemy.name()
    var enemyClass = enemy.pclass()
    var enemyHp = enemy.health()
    var enemyStavitele = enemy.stavitele()
    var enemyStavebniMaterial = enemy.stavebniMaterial()
    var enemyKrystaly = enemy.krystaly()
    var enemyMana = enemy.mana()
    var enemyKasarna = enemy.kasarna()
    var enemyWarResources = enemy.warResources()
    var enemyWall = enemy.wall()

    fun playerUtok(cAttack: Int): Int {
        val udder: Int = cAttack
        return udder
    }
    fun playerObrana(){
        println("Nastaví se utok")

    }
    fun enemyObrana(uder: Int){
        enemyHp -= enemyWall - uder
    }
    fun enemyUtok(){
        println("Zautočí enemy")

    }
}