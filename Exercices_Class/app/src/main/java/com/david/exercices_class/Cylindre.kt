package com.david.exercices_class

class Cylindre(height: Double, radius: Double, color: String):Cercle(radius, color){
    constructor(radius: Double):this(1.0,radius,"red")
    constructor(radius: Double, height: Double):this(height,radius,"red")

    private var height:Double
    private var color:String

    init {
        this.height = height
        this.color = color
    }

    override fun getRadius(): Double {
        return super.getRadius()
    }
    fun getHeight():Double = this.height
    fun getVolume():Double = 3.14 * getHeight() * getRadius()
}