package newandroid.com.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by Alvaro on 3/2/18.
 */

class ClaseAuxiliarSQLiteOpenHelper/* public static final String TABLE_DEPTOS = "aux";
    public static final String COLUMN_ID_AUX = "id_aux";
*/
(context: Context) : SQLiteOpenHelper(context, "aux.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }

}
