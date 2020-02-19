import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class HelperDB extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "dbexam.db";
    private static final int DATABASE_VERSION = 1;

    String strCreate, strDelete;

    public HelperDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
                strCreate="CREATE TABLE "+ Users.TABLE_USERS;
                strCreate+=" ("+ Users.KEY_ID+" INTEGER PRIMARY KEY,";
                strCreate+=" "+Users.NAME+" Student_Name,";
                strCreate+=" "+Users.ADDRESS+" Address,";
                strCreate+=" "+ Users.STUDENT_PHONE+" Student_Phone";
                strCreate+=" "+ Users.HOME_PHONE+" Home_Phone,";
                strCreate+=" "+ Users.MOTHER_NAME+" Mother_Name,";
                strCreate+=" "+ Users.MOTHER_PHONE+" Mother_Phone,";
                strCreate+=" "+ Users.FATHER_NAME+" Father_Name,";
                strCreate+=" "+ Users.FATHER_PHONE+" Father_Phone,";
                strCreate+=");";
                db.execSQL(strCreate);

                strCreate="CREATE TABLE "+ Grades.TABLE_GRADES;
                strCreate+=" ("+ Users.KEY_ID+" INTEGER PRIMARY KEY,";
                strCreate+=" "+ Grades.SUBJECT+" TEXT,";
                strCreate+=" "+ Grades.GRADE+" INTEGER";
                strCreate+=");";
                db.execSQL(strCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}