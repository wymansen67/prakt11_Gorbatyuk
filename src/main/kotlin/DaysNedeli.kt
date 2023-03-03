enum class DaysNedeli {
    Monday{
        override fun denNedeliName () = "Пн"
        override fun denNedeliFullName () = "Понедельник"
        val dayType = "Рабочий"
    },
    Tuesday{
        override fun denNedeliName () = "Вт"
        override fun denNedeliFullName () = "Вторник"
        val dayType = "Рабочий"
    },
    Wednesday{
        override fun denNedeliName () = "Ср"
        override fun denNedeliFullName () = "Среда"
        val dayType = "Рабочий"
    },
    Thursday{
        override fun denNedeliName () = "Чт"
        override fun denNedeliFullName () = "Четверг"
        val dayType = "Рабочий"
    },
    Friday{
        override fun denNedeliName () = "Пт"
        override fun denNedeliFullName () = "Пятница"
        val dayType = "Рабочий"
    },
    Saturday{
        override fun denNedeliName () = "Сб"
        override fun denNedeliFullName () = "Суббота"
        val dayType = "Выходной"
    },
    Sunday{
        override fun denNedeliName () = "Вс"
        override fun denNedeliFullName () = "Воскресенье"
        val dayType = "Выходной"
    };

    open fun denNedeliName () = ""
    open fun denNedeliFullName () = ""
    open fun WorkDays () = "Пн, Вт, Ср, Чт, Пт"
    open fun Weekends () = "Сб, Вс"

}