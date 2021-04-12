package com.ltts.studentdataap

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(foreignKeys = arrayOf(ForeignKey(entity = StudentModel::class,
    parentColumns = arrayOf("studentId"),
    childColumns = arrayOf("studentfeId"),
    onDelete = ForeignKey.CASCADE)))
 class StudentFees {
    @PrimaryKey(autoGenerate = true)
    var studentfeesId: Int=0
    var studentammount: Int =0
    var studentfeId: Int =0
}