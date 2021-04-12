package com.ltts.studentdataap

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [StudentModel::class,StudentAcademics::class,StudentFees::class],version = 1,exportSchema = true)
abstract class StudentService : RoomDatabase(){
    abstract fun studentModelDao() : StudentModel
    abstract fun studentAcademicsDao() : StudentAcademics
    abstract fun studentFeesDao() : StudentFees

    
}