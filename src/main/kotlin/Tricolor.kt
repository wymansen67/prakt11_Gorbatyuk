enum class Tricolor {
    Red{
        override fun  colorName () = "Red"
        override fun rgb () = "(255, 0, 0)"
        override fun hex () = "#FF0000"
       },
    Green{
        override fun  colorName () = "Green"
        override fun rgb () = "(0, 255, 0)"
        override fun hex () = "#00FF00"
    },
    Blue{
        override fun  colorName () = "Blue"
        override fun rgb () = "(0, 0, 255)"
        override fun hex () = "#0000FF"
    },
    Yellow{
        override fun  colorName () = "Yellow"
        override fun rgb () = "(255, 255, 0)"
        override fun hex () = "#ffff00"
    },
    Orange{
        override fun  colorName () = "Orange"
        override fun rgb () = "(255, 165, 0)"
        override fun hex () = "#ffa500"
    },
    Indigo{
        override fun  colorName () = "Indigo"
        override fun rgb () = "(75, 0, 130)"
        override fun hex () = "#4b0082"
    },
    Violet{
        override fun  colorName () = "Violet"
        override fun rgb () = "(238, 130, 238)"
        override fun hex () = "#ee82ee"
    };

    open fun RGB () = "Red, Green, Blue"
    open fun colorName () = ""
    open fun rgb () = ""
    open fun hex () = ""
}