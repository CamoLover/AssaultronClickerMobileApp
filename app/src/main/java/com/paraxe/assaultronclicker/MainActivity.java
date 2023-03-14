package com.paraxe.assaultronclicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private double Moneu = 0;
	private double PuissanceClique = 0;
	
	private LinearLayout linear2;
	private LinearLayout linear9;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private TextView textview5;
	private LinearLayout linear10;
	private ImageView imageview5;
	private ImageView imageview1;
	private TextView textview3;
	private LinearLayout linear4;
	private ImageView imageview2;
	private TextView textview4;
	private ImageView imageview4;
	private ImageView decals_img;
	private LinearLayout _drawer_linear1;
	private TextView _drawer_textview1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear5;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_linear19;
	private TextView _drawer_textview2;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear12;
	private LinearLayout _drawer_linear13;
	private Button _drawer_button4;
	private LinearLayout _drawer_linear11;
	private Button _drawer_button1;
	private LinearLayout _drawer_linear9;
	private Button _drawer_button2;
	private LinearLayout _drawer_linear10;
	private Button _drawer_button3;
	private Button _drawer_button5;
	private LinearLayout _drawer_linear15;
	private Button _drawer_button6;
	private LinearLayout _drawer_linear14;
	private Button _drawer_button7;
	private LinearLayout _drawer_linear16;
	private Button _drawer_button8;
	private LinearLayout _drawer_linear18;
	private Button _drawer_button9;
	private LinearLayout _drawer_linear17;
	private TextView _drawer_textview3;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear21;
	private Button _drawer_button10;
	private LinearLayout _drawer_linear22;
	private Button _drawer_button11;
	private LinearLayout _drawer_linear23;
	private Button _drawer_button12;
	private LinearLayout _drawer_linear24;
	private Button _drawer_button13;
	private Button _drawer_button14;
	private LinearLayout _drawer_linear26;
	private Button _drawer_button15;
	private LinearLayout _drawer_linear27;
	private Button _drawer_button16;
	private LinearLayout _drawer_linear28;
	private Button _drawer_button17;
	private Button _drawer_button19;
	private LinearLayout _drawer_linear31;
	private LinearLayout _drawer_linear33;
	private LinearLayout _drawer_linear34;
	private Button _drawer_button20;
	private Button _drawer_button21;
	private Button _drawer_button22;
	private Button _drawer_button23;
	private Button _drawer_button24;
	private Button _drawer_button25;
	private Button _drawer_button26;
	private LinearLayout _drawer_linear35;
	private LinearLayout _drawer_linear36;
	private LinearLayout _drawer_linear37;
	private LinearLayout _drawer_linear38;
	private LinearLayout _drawer_linear39;
	private LinearLayout _drawer_linear40;
	private LinearLayout _drawer_linear41;
	
	private TimerTask t;
	private Vibrator v;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		decals_img = (ImageView) findViewById(R.id.decals_img);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_vscroll1 = (ScrollView) _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_linear19 = (LinearLayout) _nav_view.findViewById(R.id.linear19);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_linear12 = (LinearLayout) _nav_view.findViewById(R.id.linear12);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_button4 = (Button) _nav_view.findViewById(R.id.button4);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_button1 = (Button) _nav_view.findViewById(R.id.button1);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_button2 = (Button) _nav_view.findViewById(R.id.button2);
		_drawer_linear10 = (LinearLayout) _nav_view.findViewById(R.id.linear10);
		_drawer_button3 = (Button) _nav_view.findViewById(R.id.button3);
		_drawer_button5 = (Button) _nav_view.findViewById(R.id.button5);
		_drawer_linear15 = (LinearLayout) _nav_view.findViewById(R.id.linear15);
		_drawer_button6 = (Button) _nav_view.findViewById(R.id.button6);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_button7 = (Button) _nav_view.findViewById(R.id.button7);
		_drawer_linear16 = (LinearLayout) _nav_view.findViewById(R.id.linear16);
		_drawer_button8 = (Button) _nav_view.findViewById(R.id.button8);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_button9 = (Button) _nav_view.findViewById(R.id.button9);
		_drawer_linear17 = (LinearLayout) _nav_view.findViewById(R.id.linear17);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_linear20 = (LinearLayout) _nav_view.findViewById(R.id.linear20);
		_drawer_linear21 = (LinearLayout) _nav_view.findViewById(R.id.linear21);
		_drawer_button10 = (Button) _nav_view.findViewById(R.id.button10);
		_drawer_linear22 = (LinearLayout) _nav_view.findViewById(R.id.linear22);
		_drawer_button11 = (Button) _nav_view.findViewById(R.id.button11);
		_drawer_linear23 = (LinearLayout) _nav_view.findViewById(R.id.linear23);
		_drawer_button12 = (Button) _nav_view.findViewById(R.id.button12);
		_drawer_linear24 = (LinearLayout) _nav_view.findViewById(R.id.linear24);
		_drawer_button13 = (Button) _nav_view.findViewById(R.id.button13);
		_drawer_button14 = (Button) _nav_view.findViewById(R.id.button14);
		_drawer_linear26 = (LinearLayout) _nav_view.findViewById(R.id.linear26);
		_drawer_button15 = (Button) _nav_view.findViewById(R.id.button15);
		_drawer_linear27 = (LinearLayout) _nav_view.findViewById(R.id.linear27);
		_drawer_button16 = (Button) _nav_view.findViewById(R.id.button16);
		_drawer_linear28 = (LinearLayout) _nav_view.findViewById(R.id.linear28);
		_drawer_button17 = (Button) _nav_view.findViewById(R.id.button17);
		_drawer_button19 = (Button) _nav_view.findViewById(R.id.button19);
		_drawer_linear31 = (LinearLayout) _nav_view.findViewById(R.id.linear31);
		_drawer_linear33 = (LinearLayout) _nav_view.findViewById(R.id.linear33);
		_drawer_linear34 = (LinearLayout) _nav_view.findViewById(R.id.linear34);
		_drawer_button20 = (Button) _nav_view.findViewById(R.id.button20);
		_drawer_button21 = (Button) _nav_view.findViewById(R.id.button21);
		_drawer_button22 = (Button) _nav_view.findViewById(R.id.button22);
		_drawer_button23 = (Button) _nav_view.findViewById(R.id.button23);
		_drawer_button24 = (Button) _nav_view.findViewById(R.id.button24);
		_drawer_button25 = (Button) _nav_view.findViewById(R.id.button25);
		_drawer_button26 = (Button) _nav_view.findViewById(R.id.button26);
		_drawer_linear35 = (LinearLayout) _nav_view.findViewById(R.id.linear35);
		_drawer_linear36 = (LinearLayout) _nav_view.findViewById(R.id.linear36);
		_drawer_linear37 = (LinearLayout) _nav_view.findViewById(R.id.linear37);
		_drawer_linear38 = (LinearLayout) _nav_view.findViewById(R.id.linear38);
		_drawer_linear39 = (LinearLayout) _nav_view.findViewById(R.id.linear39);
		_drawer_linear40 = (LinearLayout) _nav_view.findViewById(R.id.linear40);
		_drawer_linear41 = (LinearLayout) _nav_view.findViewById(R.id.linear41);
		v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_one_clique(true);
			}
		});
		
		_drawer_linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.transparent);
			}
		});
		
		_drawer_button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_1);
			}
		});
		
		_drawer_button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_2);
			}
		});
		
		_drawer_button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_3);
			}
		});
		
		_drawer_button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_4);
			}
		});
		
		_drawer_button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_5);
			}
		});
		
		_drawer_button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_6);
			}
		});
		
		_drawer_button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_7);
			}
		});
		
		_drawer_button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.decals_8);
			}
		});
		
		_drawer_button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_base);
			}
		});
		
		_drawer_button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_1);
			}
		});
		
		_drawer_button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_2);
			}
		});
		
		_drawer_button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_3);
			}
		});
		
		_drawer_button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_4);
			}
		});
		
		_drawer_button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_6);
			}
		});
		
		_drawer_button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_5);
			}
		});
		
		_drawer_button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color_7);
			}
		});
		
		_drawer_button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decals_img.setImageResource(R.drawable.gunner_decals);
			}
		});
		
		_drawer_button20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__6);
			}
		});
		
		_drawer_button21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__4);
			}
		});
		
		_drawer_button22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__1);
			}
		});
		
		_drawer_button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__7);
			}
		});
		
		_drawer_button24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__5);
			}
		});
		
		_drawer_button25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__3);
			}
		});
		
		_drawer_button26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setImageResource(R.drawable.assaultron_color__2);
			}
		});
	}
	private void initializeLogic() {
		PuissanceClique = 1;
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	private void _one_clique (final boolean _IsClique) {
		if (_IsClique) {
			Moneu = Moneu + PuissanceClique;
		}
		else {
			Moneu++;
		}
		textview3.setText(String.valueOf((long)(Moneu)));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
