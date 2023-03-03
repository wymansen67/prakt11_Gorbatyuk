enum class DaysNedeli {
    Monday{
        override fun denNedeliName () = "Пн"
        override fun denNedeliFullName () = "Понедельник"
        override fun dayType () = "Рабочий"
    },
    Tuesday{
        override fun denNedeliName () = "Вт"
        override fun denNedeliFullName () = "Вторник"
        override fun dayType () = "Рабочий"
    },
    Wednesday{
        override fun denNedeliName () = "Ср"
        override fun denNedeliFullName () = "Среда"
        override fun dayType () = "Рабочий"
    },
    Thursday{
        override fun denNedeliName () = "Чт"
        override fun denNedeliFullName () = "Четверг"
        override fun dayType () = "Рабочий"
    },
    Friday{
        override fun denNedeliName () = "Пт"
        override fun denNedeliFullName () = "Пятница"
        override fun dayType () = "Рабочий"
    },
    Saturday{
        override fun denNedeliName () = "Сб"
        override fun denNedeliFullName () = "Суббота"
        override fun dayType () = "Выходной"
    },
    Sunday{
        override fun denNedeliName () = "Вс"
        override fun denNedeliFullName () = "Воскресенье"
        override fun dayType ()= "Выходной"
    };

    open fun denNedeliName () = ""
    open fun denNedeliFullName () = ""
    open fun dayType () = ""
    open fun WorkDays () = "Пн, Вт, Ср, Чт, Пт"
    open fun Weekends () = "Сб, Вс"

}