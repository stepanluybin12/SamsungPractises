fun main(){
    val student:Student? = Student()

    student?.let { st -> //работая с объектом через it не возвращает выходного значения
        st.hi()
        st.name = "Kolya"
    }
    println(student?.name)
    student.apply {
        hi()
        name = "hfdui"
    }


    val st = student.run(){//работает с параметрами объектов, возвращает выходное значение
        hi()
        name = "Peppa"
        age = 10
        age
    }

    val ageStudent = with(Student()){
        hi()
        age
    }
}