package org.dianlava.droplet.Activities;

import org.dianlava.droplet.R;
import org.dianlava.droplet.Interfaces.MainActivity;

import android.os.Bundle;

/**
 * ���û��ĸ���ҳ��
 * 
 * @author FreeTymeKiyan
 * @date 2012-07-11
 * @version 1.0 
 * */
public class MyMainActivity extends MainActivity{
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}