fun main () = try {
    println(Tricolor.Red.colorName() + " " +  Tricolor.Red.hex())
    println(Tricolor.Blue.colorName() + " " +  Tricolor.Blue.hex())
    println(Tricolor.Yellow.colorName() + " " + Tricolor.Yellow.hex())
    println(Tricolor.Green.colorName() + " " +  Tricolor.Green.hex())
    println(Tricolor.Orange.colorName() + " " +  Tricolor.Orange.hex())
    println(Tricolor.Indigo.colorName() + " " +  Tricolor.Indigo.hex())
    println(Tricolor.Violet.colorName() + " " +  Tricolor.Violet.hex())

    println("")

    println(DaysNedeli.Monday.denNedeliFullName() + " " + DaysNedeli.Monday.dayType())
    println(DaysNedeli.Tuesday.denNedeliFullName() + " " + DaysNedeli.Tuesday.dayType())
    println(DaysNedeli.Wednesday.denNedeliFullName() + " " + DaysNedeli.Wednesday.dayType())
    println(DaysNedeli.Thursday.denNedeliFullName() + " " + DaysNedeli.Thursday.dayType())
    println(DaysNedeli.Friday.denNedeliFullName() + " " + DaysNedeli.Friday.dayType())
    println(DaysNedeli.Saturday.denNedeliFullName() + " " + DaysNedeli.Saturday.dayType())
    println(DaysNedeli.Sunday.denNedeliFullName() + " " +DaysNedeli.Sunday.dayType())
    println(DaysNedeli.Monday.WorkDays())

}
catch (e:NumberFormatException) {println("Err")}