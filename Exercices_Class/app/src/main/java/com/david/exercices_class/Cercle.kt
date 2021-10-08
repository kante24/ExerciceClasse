package com.david.exercices_class

import kotlin.math.pow

open class Cercle ( radius:Double,color:String) {
    constructor(radius: Double):this(radius,"red")

    private var radius:Double;
    private var color:String;

    init {
        this.radius = radius
        this.color = color
    }
    open fun getRadius():Double = this.radius

    fun getArea():Double = getRadius().pow(2) * 3.14

    override fun toString(): String {
        return "Cercle(radius=$radius, color='$color')"
    }

}
