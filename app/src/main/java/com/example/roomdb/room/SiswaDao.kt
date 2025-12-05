package com.example.roomdb.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDao {
    @Query("SELECT * FROM tblSsiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    //    edit
    @Query ("SELECT * FROM tblSsiswa WHERE id = :id")
    fun getSiswa(id :Int): Flow<Siswa?>

    //delete


    //search
//    @Query("SELECT * FROM tblSsiswa WHERE nama = :nama")
//    suspend fun searchSiswaByName(nama: String): Flow<Siswa>
//    suspend fun searchSiswaByName(nama: String): List<Siswa>






}