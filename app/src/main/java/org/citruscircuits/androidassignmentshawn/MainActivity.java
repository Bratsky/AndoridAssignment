package org.citruscircuits.androidassignmentshawn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Switch IncognitoSwitchMode;
    private EditText RoomName, Username;
    private Button EnterTheRoom;

    ArrayList <String> Messages = new ArrayList<String>();
    ArrayAdapter <String> MessagesAdapter = new ArrayAdapter<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IncognitoSwitchMode= (Switch) findViewById(R.id.IncognitoSwitchMode);
        RoomName= (EditText) findViewById(R.id.RoomName);
        Username= (EditText) findViewById(R.id.Username);
        EnterTheRoom= (Button) findViewById(R.id.EnterTheRoom);
    }

    public void enterChat (View view) {
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra("Username", Username.getText());
        intent.putExtra("RoomName", RoomName.getText());
        intent.putExtra("IncognitoMode", IncognitoSwitchMode.getText());

        startActivity(intent);

    }
}
