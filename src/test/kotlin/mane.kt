fun main () = try {
    println(Tricolor.Red.colorName() + " " +  Tricolor.Red.hex())
    println(Tricolor.Blue.colorName() + " " +  Tricolor.Blue.hex())
    println(Tricolor.Yellow.colorName() + " " + Tricolor.Yellow.hex())
    println(Tricolor.Green.colorName() + " " +  Tricolor.Green.hex())
    println(Tricolor.Orange.colorName() + " " +  Tricolor.Orange.hex())
    println(Tricolor.Indigo.colorName() + " " +  Tricolor.Indigo.hex())
    println(Tricolor.Violet.colorName() + " " +  Tricolor.Violet.hex())

    println("")

    println(DaysNedeli.Monday.denNedeliFullName())
    println(DaysNedeli.Tuesday.denNedeliFullName())
    println(DaysNedeli.Wednesday.denNedeliFullName())
    println(DaysNedeli.Thursday.denNedeliFullName())
    println(DaysNedeli.Friday.denNedeliFullName())
    println(DaysNedeli.Saturday.denNedeliFullName())
    println(DaysNedeli.Sunday.denNedeliFullName())
    println(DaysNedeli.Monday.WorkDays())

}
catch (e:NumberFormatException) {println("Err")}