package com.example.programmingquiz

object Constants {

    const val USER_NAME: String = "user name"
    const val TOTAL_QUESTION: String = "total questions"
    const val CORRECT_ANSWERS: String = "correct answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "Which of the following is true about Static Initialization Block?",
            "We can use only static members of a class inside the Static Initialization Block.",
            "Static Initialization Blocks are mainly used to initialize static fields of a class.",
            "Static Initialization Block is the first block to be executed after class is loaded in the memory.",
            "All of the above.",
        4)

        questionsList.add(que1)

        val que2 = Question(2,"To which of the following classes, you can create objects without using new operator?",
            "String",
            "StringBuffer",
            "StringBuilder",
            "None of the above",
            1)
        questionsList.add(que2)

        val que3 = Question(3, "Which of the following option leads to the portability and security of Java?",
            "Bytecode is executed by JVM",
            "The applet makes the Java code secure and portable",
            "Use of exception handling",
            "Dynamic binding between objects",
            1)
        questionsList.add(que3)

        val que4 = Question(4, "Which of the following is not a Java features?",
            "Dynamic",
            "Architecture Neutral",
            "Use of pointers",
            "Object-oriented",
            3)
        questionsList.add(que4)

        val que5 = Question(5, "What should be the execution order, if a class has a method, static block, instance block, and constructor?",
            "Instance block, method, static block, and constructor",
            "Method, constructor, instance block, and static block",
            "Static block, method, instance block, and constructor",
            "Static block, instance block, constructor, and method",
            4)
        questionsList.add(que5)

        val que6 = Question(6, "The \\u0021 article referred to as a?",
            "Unicode escape sequence",
            "Octal escape",
            "Hexadecimal",
            "Line feed",
            1)
        questionsList.add(que6)

        val que7 = Question(7, " _____ is used to find and fix bugs in the Java programs.",
            "JVM",
            "JRE",
            "JDK",
            "JDB",
            4)
        questionsList.add(que7)

        val que8 = Question(8, "Which of the following is a valid declaration of a char?",
            "char ch = '\\utea';",
            "char ca = 'tea';",
            "char cr = \\u0223;",
            "char cc = '\\itea';",
            3)
        questionsList.add(que8)

        val que9 = Question(9, "What is the return type of the hashCode() method in the Object class?",
            "Object",
            "int",
            "long",
            "void",
            2)
        questionsList.add(que9)

        val que10 = Question(10, "What does the expression float a = 35 / 0 return?",
            "0",
            "Not a Number",
            "Infinity",
            "Infinity",
            3)
        questionsList.add(que10)

        return questionsList
    }
}