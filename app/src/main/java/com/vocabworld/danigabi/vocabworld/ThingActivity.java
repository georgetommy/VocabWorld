package com.vocabworld.danigabi.vocabworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;

import com.vocabworld.danigabi.database.DatabaseHelper;

import java.sql.SQLException;

/**
 * Activity which shows the latest thing that was stored to the database.
 *
 * @author kevingalligan
 */
public class ThingActivity extends OrmLiteBaseActivity<DatabaseHelper> {

    public static final String KEY_THING_ID = "NOTIFY_SERVICE_ID";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thing);

        int thingId = getIntent().getIntExtra(KEY_THING_ID, -1);
        Thing thing;
        try {
            thing = getHelper().getThingDao().queryForId(thingId);
        } catch (SQLException e) {
            throw new RuntimeException("Could not lookup Think in the database", e);
        }

        String idString;
        String description;
        if (thing == null) {
            idString = "id " + thingId + " not found";
            description = "id " + thingId + " not found";
        } else {
            idString = thing.getId().toString();
            description = thing.getDescription();
        }
        ((TextView) findViewById(R.id.thingId)).setText(idString);
        ((TextView) findViewById(R.id.thingDescription)).setText(description);
    }
}