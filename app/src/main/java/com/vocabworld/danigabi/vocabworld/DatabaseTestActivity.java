package com.vocabworld.danigabi.vocabworld;

import java.util.List;
import java.util.Random;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import com.vocabworld.danigabi.database.DatabaseHelper;
import com.vocabworld.danigabi.datastructure.Word;

/**
 * Sample Android UI activity which displays a text window when it is run.
 */
public class DatabaseTestActivity extends OrmLiteBaseActivity<DatabaseHelper> {

    private final String LOG_TAG = getClass().getSimpleName();
    private final static int MAX_NUM_TO_CREATE = 8;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(LOG_TAG, "creating " + getClass() + " at " + System.currentTimeMillis());
        TextView tv = new TextView(this);
        tv.setMovementMethod(new ScrollingMovementMethod());
        doSampleDatabaseStuff("onCreate", tv);
        setContentView(tv);
    }

    /**
     * Do our sample database stuff.
     */
    private void doSampleDatabaseStuff(String action, TextView tv) {
        // get our dao
//        RuntimeExceptionDao<Word, Integer> simpleDao = getHelper().getSimpleRuntimeDao();
//        // query for all of the data objects in the database
//        List<Word> list = simpleDao.queryForAll();
//        // our string builder for building the content-view
//        StringBuilder sb = new StringBuilder();
//        sb.append("Found ").append(list.size()).append(" entries in DB in ").append(action).append("()\n");
//
//        // if we already have items in the database
//        int simpleC = 1;
//        for (Word simple : list) {
//            sb.append('#').append(simpleC).append(": ").append(simple).append('\n');
//            simpleC++;
//        }
//        sb.append("------------------------------------------\n");
//        sb.append("Deleted ids:");
//        for (Word simple : list) {
//            simpleDao.delete(simple);
//            sb.append(' ').append(simple.getId());
//            Log.i(LOG_TAG, "deleting simple(" + simple.getId() + ")");
//            simpleC++;
//        }
//        sb.append('\n');
//        sb.append("------------------------------------------\n");
//
//        int createNum;
//        do {
//            createNum = new Random().nextInt(MAX_NUM_TO_CREATE) + 1;
//        } while (createNum == list.size());
//        sb.append("Creating ").append(createNum).append(" new entries:\n");
//        for (int i = 0; i < createNum; i++) {
//            // create a new simple object
//            long millis = System.currentTimeMillis();
//            Word simple = new Word();
//            simple.setText(String.valueOf(millis));
//            // store it in the database
//            simpleDao.create(simple);
//            Log.i(LOG_TAG, "created simple(" + millis + ")");
//            // output it
//            sb.append('#').append(i + 1).append(": ");
//            sb.append(simple).append('\n');
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                // ignore
//            }
//        }
//
//        tv.setText(sb.toString());
//        Log.i(LOG_TAG, "Done with page at " + System.currentTimeMillis());
    }
}