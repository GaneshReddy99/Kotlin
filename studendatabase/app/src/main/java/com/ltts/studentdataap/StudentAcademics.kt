package com.ltts.studentdataap

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(
    ForeignKey(entity = StudentModel::class,
    parentColumns = arrayOf("studentId"),
    childColumns = arrayOf("studentAcId"),
    onDelete = ForeignKey.CASCADE)
))
class StudentAcademics {
    @PrimaryKey(autoGenerate = true)
    var academicsId: Int =0
    var Marks:Int=0
    var studentAcId:Int =0

}
