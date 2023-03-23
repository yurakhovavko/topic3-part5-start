package com.topic3.android.reddit.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.topic3.android.reddit.data.database.model.PostDbModel

/**
 * Dao для управления таблицей сообщений в базе данных.
 */
@Dao
interface PostDao {

  @Query("SELECT * FROM PostDbModel")
  fun getAllPosts(): List<PostDbModel>

  @Query("SELECT * FROM PostDbModel WHERE username = :username")
  fun getAllOwnedPosts(username: String): List<PostDbModel>
  @Query("SELECT DISTINCT subreddit FROM PostDbModel")
  fun getAllSubreddits(): List<String>

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insert(postDbModel: PostDbModel)

  @Query("DELETE FROM PostDbModel")
  fun deleteAll()

  @Insert
  fun insertAll(vararg PostDbModels: PostDbModel)
}