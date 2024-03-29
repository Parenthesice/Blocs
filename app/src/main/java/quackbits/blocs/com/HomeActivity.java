package quackbits.blocs.com;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.*;
import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.shobhitpuri.custombuttons.*;
import com.squareup.picasso.*;
import de.hdodenhof.circleimageview.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import me.everything.*;
import org.json.*;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class HomeActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private String fontName = "";
	private String typeace = "";
	private double num = 0;
	
	private LinearLayout top;
	private LinearLayout linear1;
	private LinearLayout linear4;
	private ImageView circleimageview1;
	private TextView title;
	private ImageView spc;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear2;
	private LinearLayout one;
	private LinearLayout two;
	private LinearLayout three;
	private LinearLayout four;
	private ImageView imageview1;
	private TextView textview2;
	private ImageView imageview2;
	private TextView textview3;
	private ImageView imageview3;
	private TextView textview4;
	private ImageView imageview4;
	private TextView textview6;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LottieAnimationView lottie1;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear_premium;
	private ScrollView _drawer_vscroll1;
	private CircleImageView _drawer_circleimageview1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear14;
	private TextView _drawer_textview2;
	private TextView _drawer_textview1;
	private ImageView _drawer_imageview11;
	private LinearLayout _drawer_linear_support;
	private LinearLayout _drawer_linear_profile;
	private LinearLayout _drawer_linear_contactar;
	private LinearLayout _drawer_addbutton;
	private LinearLayout _drawer_linear_cs1;
	private LinearLayout _drawer_creators;
	private LinearLayout _drawer_cubes;
	private LinearLayout _drawer_downloads;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview6;
	private LinearLayout _drawer_privacypolicy;
	private LinearLayout _drawer_notifications;
	private LinearLayout _drawer_settingsbutton;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview7;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview9;
	private TextView _drawer_textview11;
	
	private Intent l1 = new Intent();
	private SharedPreferences ac;
	private FirebaseAuth authentication;
	private OnCompleteListener<AuthResult> _authentication_create_user_listener;
	private OnCompleteListener<AuthResult> _authentication_sign_in_listener;
	private OnCompleteListener<Void> _authentication_reset_password_listener;
	private OnCompleteListener<Void> authentication_updateEmailListener;
	private OnCompleteListener<Void> authentication_updatePasswordListener;
	private OnCompleteListener<Void> authentication_emailVerificationSentListener;
	private OnCompleteListener<Void> authentication_deleteUserListener;
	private OnCompleteListener<Void> authentication_updateProfileListener;
	private OnCompleteListener<AuthResult> authentication_phoneAuthListener;
	private OnCompleteListener<AuthResult> authentication_googleSignInListener;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_fab = findViewById(R.id._fab);
		
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		top = findViewById(R.id.top);
		linear1 = findViewById(R.id.linear1);
		linear4 = findViewById(R.id.linear4);
		circleimageview1 = findViewById(R.id.circleimageview1);
		title = findViewById(R.id.title);
		spc = findViewById(R.id.spc);
		hscroll1 = findViewById(R.id.hscroll1);
		linear2 = findViewById(R.id.linear2);
		one = findViewById(R.id.one);
		two = findViewById(R.id.two);
		three = findViewById(R.id.three);
		four = findViewById(R.id.four);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		imageview2 = findViewById(R.id.imageview2);
		textview3 = findViewById(R.id.textview3);
		imageview3 = findViewById(R.id.imageview3);
		textview4 = findViewById(R.id.textview4);
		imageview4 = findViewById(R.id.imageview4);
		textview6 = findViewById(R.id.textview6);
		vscroll1 = findViewById(R.id.vscroll1);
		linear5 = findViewById(R.id.linear5);
		lottie1 = findViewById(R.id.lottie1);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear_premium = _nav_view.findViewById(R.id.linear_premium);
		_drawer_vscroll1 = _nav_view.findViewById(R.id.vscroll1);
		_drawer_circleimageview1 = _nav_view.findViewById(R.id.circleimageview1);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear14 = _nav_view.findViewById(R.id.linear14);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_imageview11 = _nav_view.findViewById(R.id.imageview11);
		_drawer_linear_support = _nav_view.findViewById(R.id.linear_support);
		_drawer_linear_profile = _nav_view.findViewById(R.id.linear_profile);
		_drawer_linear_contactar = _nav_view.findViewById(R.id.linear_contactar);
		_drawer_addbutton = _nav_view.findViewById(R.id.addbutton);
		_drawer_linear_cs1 = _nav_view.findViewById(R.id.linear_cs1);
		_drawer_creators = _nav_view.findViewById(R.id.creators);
		_drawer_cubes = _nav_view.findViewById(R.id.cubes);
		_drawer_downloads = _nav_view.findViewById(R.id.downloads);
		_drawer_imageview3 = _nav_view.findViewById(R.id.imageview3);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_imageview4 = _nav_view.findViewById(R.id.imageview4);
		_drawer_textview5 = _nav_view.findViewById(R.id.textview5);
		_drawer_imageview5 = _nav_view.findViewById(R.id.imageview5);
		_drawer_textview6 = _nav_view.findViewById(R.id.textview6);
		_drawer_privacypolicy = _nav_view.findViewById(R.id.privacypolicy);
		_drawer_notifications = _nav_view.findViewById(R.id.notifications);
		_drawer_settingsbutton = _nav_view.findViewById(R.id.settingsbutton);
		_drawer_imageview6 = _nav_view.findViewById(R.id.imageview6);
		_drawer_textview7 = _nav_view.findViewById(R.id.textview7);
		_drawer_imageview7 = _nav_view.findViewById(R.id.imageview7);
		_drawer_textview8 = _nav_view.findViewById(R.id.textview8);
		_drawer_imageview8 = _nav_view.findViewById(R.id.imageview8);
		_drawer_textview9 = _nav_view.findViewById(R.id.textview9);
		_drawer_textview11 = _nav_view.findViewById(R.id.textview11);
		ac = getSharedPreferences("status", Activity.MODE_PRIVATE);
		authentication = FirebaseAuth.getInstance();
		
		circleimageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		one.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview1.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
				imageview2.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview3.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview4.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				_fab.setImageResource(R.drawable.ic_search);
				num = 1;
				one.setElevation((float)15);
				two.setElevation((float)0);
				four.setElevation((float)0);
				three.setElevation((float)0);
				_TransitionManager(linear2, 500);
			}
		});
		
		two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview2.setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
				imageview3.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview4.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				_fab.setImageResource(R.drawable.ic_group_add);
				num = 2;
				one.setElevation((float)0);
				two.setElevation((float)15);
				four.setElevation((float)0);
				three.setElevation((float)0);
				_TransitionManager(linear2, 500);
			}
		});
		
		three.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview2.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview3.setColorFilter(0xFFFF5722, PorterDuff.Mode.MULTIPLY);
				imageview4.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				_fab.setImageResource(R.drawable.ic_bookmark_outline_white);
				num = 3;
				one.setElevation((float)0);
				two.setElevation((float)0);
				four.setElevation((float)0);
				three.setElevation((float)15);
				_TransitionManager(linear2, 500);
			}
		});
		
		four.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview2.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview3.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				imageview4.setColorFilter(0xFFFFC107, PorterDuff.Mode.MULTIPLY);
				_fab.setImageResource(R.drawable.ic_create_white);
				num = 4;
				one.setElevation((float)0);
				two.setElevation((float)0);
				four.setElevation((float)15);
				three.setElevation((float)0);
				_TransitionManager(linear2, 500);
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (num == 1) {
					intent.setClass(getApplicationContext(), QueryActivity.class);
					startActivity(intent);
				}
				if (num == 2) {
					intent.setClass(getApplicationContext(), CreatorsActivity.class);
					startActivity(intent);
				}
				if (num == 3) {
					intent.setClass(getApplicationContext(), BookmarkActivity.class);
					startActivity(intent);
				}
				if (num == 4) {
					intent.setClass(getApplicationContext(), QuoteaddActivity.class);
					startActivity(intent);
				}
			}
		});
		
		authentication_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		authentication_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		authentication_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		authentication_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		authentication_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		authentication_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		authentication_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_authentication_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_authentication_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_authentication_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		num = 1;
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			    
			    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		}
		_changeActivityFont("font");
		final LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view); _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		
		_drawer_textview1.setText(ac.getString("username", ""));
		Glide.with(getApplicationContext()).load(Uri.parse(ac.getString("url", ""))).into(_drawer_circleimageview1);
		getSupportActionBar().hide();
		OverScrollDecoratorHelper.setUpOverScroll(hscroll1);
		OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
		int d = 1;
		GradientDrawable SketchUi = new GradientDrawable();
		SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadii(new float[]{
			d*0,d*0,d*9 ,d*9,d*9,d*9 ,d*0,d*0});
		_drawer_linear1.setElevation(d*6);
		_drawer_linear1.setBackground(SketchUi);
		{
			android.graphics.drawable.GradientDrawable ProsperUI = new android.graphics.drawable.GradientDrawable();
			int ntim = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			ProsperUI.setColor(0xFF009688);
			ProsperUI.setCornerRadius(d*88);
			_drawer_addbutton.setElevation(d*5);
			android.graphics.drawable.RippleDrawable ProsperUI_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), ProsperUI, null);
			_drawer_addbutton.setBackground(ProsperUI_RD);
			_drawer_addbutton.setClickable(true);
		}
		_ui(one);
		_ui(four);
		_ui(two);
		_ui(three);
		_removeScollBar(hscroll1);
		_removeScollBar(vscroll1);
		_parent(_drawer_linear_contactar);
		_parent(_drawer_linear_profile);
		_rippleview(_drawer_creators);
		_rippleview(_drawer_cubes);
		_rippleview(_drawer_downloads);
		_rippleview(_drawer_privacypolicy);
		_rippleview(_drawer_notifications);
		_rippleview(_drawer_settingsbutton);
		_rippleview(_drawer_linear_cs1);
		_drawer_addbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
				intent.setClass(getApplicationContext(), BlocsAddActivity.class);
				startActivity(intent);
			}
		});
		_drawer_settingsbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
				intent.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(intent);
			}
		});
		_drawer_creators.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
				intent.setClass(getApplicationContext(), CreatorsActivity.class);
				startActivity(intent);
			}
		});
		_drawer_cubes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
				intent.setClass(getApplicationContext(), CubesActivity.class);
				startActivity(intent);
			}
		});
		_drawer_downloads.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
				intent.setClass(getApplicationContext(), SavedActivity.class);
				startActivity(intent);
			}
		});
		_drawer_privacypolicy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
				intent.setClass(getApplicationContext(), PrivacypolicyActivity.class);
				startActivity(intent);
			}
		});
		_drawer_notifications.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), NotificationsActivity.class);
				startActivity(intent);
			}
		});
		_drawer_linear_premium.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)6, 0xFFE0F2F1));
	}
	
	@Override
	public void onStart() {
		super.onStart();
		overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
	}
	
	
	@Override
	public void onBackPressed() {
		finishAffinity();
	}
	public void _Extra() {
		
	}
	
	
	public void _ui(final View _linear) {
		GradientDrawable SketchUi = new GradientDrawable();
		int d = 1;
		SketchUi.setColor(0xFFB2DFDB);
		SketchUi.setCornerRadius(d*54);
		_linear.setElevation(d*5);
		RippleDrawable SketchUi_RD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
		_linear.setBackground(SketchUi_RD);
	}
	
	
	public void _rippleview(final View _ui) {
		android.graphics.drawable.GradientDrawable Abui = new android.graphics.drawable.GradientDrawable();
		int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
		Abui.setColor(0xFFFFFFFF);
		Abui.setCornerRadius(d*49);
		android.graphics.drawable.RippleDrawable Abui_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), Abui, null);
		_ui.setBackground(Abui_RD);
		_ui.setClickable(true);
	}
	
	
	public void _parent(final View _line) {
		_line.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)12, 0xFFFFFFFF));
		_line.setElevation((float)7);
	}
	
	
	public void _changeActivityFont(final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace, 1);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
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