package com.example.eh

class Enemy(val enemy_name: String, val enemy_class: String){
    fun name(): String{
        return enemy_name
    }
    fun pclass(): String{
        return enemy_class
    }
    fun health(): Int{
        val phealth = 10
        return phealth
    }
    fun stavitele(): Int{
        val stavitele = 1
        return stavitele
    }
    fun stavebniMaterial(): Int{
        val stavebni_Material = 1
        return stavebni_Material
    }
    fun krystaly(): Int{
        val krystaly = 1
        return krystaly
    }
    fun mana(): Int{
        val mana_d = 1
        return mana_d
    }
    fun kasarna(): Int{
        val kasarna = 1
        return kasarna
    }
    fun warResources(): Int{
        val war_Resources = 1
        return war_Resources
    }
    fun wall(): Int{
        val wall = 0
        return wall
    }
}