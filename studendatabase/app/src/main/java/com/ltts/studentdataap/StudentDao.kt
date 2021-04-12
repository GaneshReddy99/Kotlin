package com.ltts.studentdataap

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {
    @Query("SELECT * FROM StudentModel")
    fun getAllStudents(): LiveData<List<StudentModel>>

    @Insert
    fun insert(studentmodel: StudentModel)
}