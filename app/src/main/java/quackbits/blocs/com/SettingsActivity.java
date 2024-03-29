package quackbits.blocs.com;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import com.shobhitpuri.custombuttons.*;
import com.squareup.picasso.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import me.everything.*;
import org.json.*;

public class SettingsActivity extends AppCompatActivity {
	
	private LinearLayout topLayoutBar;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ImageView topLayoutBarBack;
	private TextView topLayoutBarTitle;
	private ImageView topLayoutBarImgSpc;
	private LinearLayout linear3;
	private LinearLayout linear9;
	private ScrollView vscroll1;
	private LinearLayout content;
	private LinearLayout blurview;
	private LinearLayout linear7;
	private LinearLayout mode;
	private LinearLayout linear8;
	private ImageView imageview1;
	private TextView textview15;
	private Switch dark_modee;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		topLayoutBar = findViewById(R.id.topLayoutBar);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		topLayoutBarBack = findViewById(R.id.topLayoutBarBack);
		topLayoutBarTitle = findViewById(R.id.topLayoutBarTitle);
		topLayoutBarImgSpc = findViewById(R.id.topLayoutBarImgSpc);
		linear3 = findViewById(R.id.linear3);
		linear9 = findViewById(R.id.linear9);
		vscroll1 = findViewById(R.id.vscroll1);
		content = findViewById(R.id.content);
		blurview = findViewById(R.id.blurview);
		linear7 = findViewById(R.id.linear7);
		mode = findViewById(R.id.mode);
		linear8 = findViewById(R.id.linear8);
		imageview1 = findViewById(R.id.imageview1);
		textview15 = findViewById(R.id.textview15);
		dark_modee = findViewById(R.id.dark_modee);
		
		topLayoutBarBack.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			    
			    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		}
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
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}