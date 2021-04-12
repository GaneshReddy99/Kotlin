package com.ltts.studentdataap

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class StudentModel {

    @PrimaryKey(autoGenerate = true)
    var studentId: Int =0
    var studentname:  String =""
    var studentaddr:  String =""
    var studentclass:  String =""
    var studenttech:  String =""

}
