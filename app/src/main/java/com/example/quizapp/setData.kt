package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "what is capital of India ?",

           "Uttar Pradesh",
           "Madhya Pradesh",
           "Kanpur",
           "New Delhi",
           4
       )
       var question2 = QuestionData(
           2,
           "Who was the first Indian woman in Space ?",

           "Kalpana Chawla",
           "Sunita Williams",
           "Koneru Humpy",
           "None of the above",
           1
       )
       var question3 = QuestionData(
           3,
           "Who wrote the Indian National Anthem ?",

           "Bakim Chandra Chatterji",
           "Rabindranath Tagore",
           "Swami Vivekanand",
           "None of the above",
           2
       )
       var question4 = QuestionData(
           4,
           "Who was the first President of India ?",

           "Abdul Kalam",
           "Lal Bahadur Shastri",
           "Dr. Rajendra Prasad",
           "Zakir Hussain",
           3
       )

       var question5 = QuestionData(
           5,
           "Who built the Jama Masjid ?",

           "Jahangir",
           "Akbar",
           "Imam Bukhari",
           "Shah Jahan",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}