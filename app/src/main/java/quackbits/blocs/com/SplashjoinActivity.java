package quackbits.blocs.com;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.shobhitpuri.custombuttons.*;
import com.squareup.picasso.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import me.everything.*;
import org.json.*;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.Snackbar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;
import com.shobhitpuri.custombuttons.GoogleSignInButton;

public class SplashjoinActivity extends AppCompatActivity {
	
	public final int REQ_CD_GOOGLEAUTH = 101;
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private String fontName = "";
	private String typeace = "";
	private String gMAIL = "";
	private String gPASS = "";
	private double user = 0;
	private double authyTYPE = 0;
	private HashMap<String, Object> usermap = new HashMap<>();
	private boolean isEdittext1Empty = false;
	private boolean isEdittext2Empty = false;
	private boolean isEdittext3Empty = false;
	private boolean googleLOGIN = false;
	private boolean showPASS = false;
	private boolean eVERIFIED = false;
	private String user_location = "";
	private String email = "";
	private boolean allDataNotEmpty = false;
	private String aa = "";
	private double read = 0;
	private boolean satisfied = false;
	private String a = "";
	private boolean signed_in = false;
	FirebaseUser FirebaseUser;
	AuthCredential credential;
	GoogleSignInOptions options;
	GoogleSignInAccount account;
	private boolean checked = false;
	
	private LinearLayout view;
	private ScrollView vscroll2;
	private LinearLayout linear1;
	private LinearLayout linear11;
	private TextView textview2;
	private LinearLayout use;
	private LinearLayout mail;
	private LinearLayout linear3;
	private CheckBox checkbox1;
	private TextView textview5;
	private LinearLayout linear5;
	private CheckBox checkbox3;
	private LinearLayout linear7;
	private TextView textview10;
	private LinearLayout linear12;
	private TextView textview11;
	private ImageView imageview3;
	private TextView textview1;
	private EditText edittext3;
	private EditText edittext1;
	private LinearLayout pass;
	private EditText edittext2;
	private TextView textview7;
	private LinearLayout linear9;
	private TextView textview8;
	private LinearLayout linear8;
	private GoogleSignInButton button1;
	
	private RequestNetwork call;
	private RequestNetwork.RequestListener _call_request_listener;
	private TimerTask t;
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
	
	private Intent INTENT = new Intent();
	private Calendar calendar = Calendar.getInstance();
	private DatabaseReference udb = _firebase.getReference("userdb");
	private ChildEventListener _udb_child_listener;
	private TimerTask tt;
	private SharedPreferences ac;
	private TimerTask timer;
	private TimerTask timetwo;
	private TimerTask time;
	private SharedPreferences temp;
	private Intent intent = new Intent();
	private GoogleSignInClient GoogleAuth;
	private DatabaseReference utj = _firebase.getReference("timejoined");
	private ChildEventListener _utj_child_listener;
	private SharedPreferences signstats;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splashjoin);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		view = findViewById(R.id.view);
		vscroll2 = findViewById(R.id.vscroll2);
		linear1 = findViewById(R.id.linear1);
		linear11 = findViewById(R.id.linear11);
		textview2 = findViewById(R.id.textview2);
		use = findViewById(R.id.use);
		mail = findViewById(R.id.mail);
		linear3 = findViewById(R.id.linear3);
		checkbox1 = findViewById(R.id.checkbox1);
		textview5 = findViewById(R.id.textview5);
		linear5 = findViewById(R.id.linear5);
		checkbox3 = findViewById(R.id.checkbox3);
		linear7 = findViewById(R.id.linear7);
		textview10 = findViewById(R.id.textview10);
		linear12 = findViewById(R.id.linear12);
		textview11 = findViewById(R.id.textview11);
		imageview3 = findViewById(R.id.imageview3);
		textview1 = findViewById(R.id.textview1);
		edittext3 = findViewById(R.id.edittext3);
		edittext1 = findViewById(R.id.edittext1);
		pass = findViewById(R.id.pass);
		edittext2 = findViewById(R.id.edittext2);
		textview7 = findViewById(R.id.textview7);
		linear9 = findViewById(R.id.linear9);
		textview8 = findViewById(R.id.textview8);
		linear8 = findViewById(R.id.linear8);
		button1 = findViewById(R.id.button1);
		call = new RequestNetwork(this);
		authentication = FirebaseAuth.getInstance();
		ac = getSharedPreferences("status", Activity.MODE_PRIVATE);
		temp = getSharedPreferences("temp", Activity.MODE_PRIVATE);
		signstats = getSharedPreferences("signstats", Activity.MODE_PRIVATE);
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					edittext2.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
					edittext2.setHint("Password");
				}
				else {
					edittext2.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
					edittext2.setHint("••••••••");
				}
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview10.setText("Login");
				_authTYPE(2);
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				isEdittext1Empty = edittext1.getText().toString().isEmpty();
				isEdittext2Empty = edittext2.getText().toString().isEmpty();
				isEdittext3Empty = edittext3.getText().toString().isEmpty();
				if (isEdittext1Empty || (isEdittext2Empty || isEdittext3Empty)) {
					if (isEdittext1Empty) {
						((EditText)edittext1).setError("Provide a valid email address");
					}
					if (isEdittext2Empty) {
						((EditText)edittext2).setError("Provide a secured password");
					}
					if (isEdittext3Empty) {
						((EditText)edittext3).setError("Provide a username");
					}
				}
				else {
					if (satisfied || (authyTYPE == 2)) {
						if (SketchwareUtil.isConnected(getApplicationContext())) {
							if (authyTYPE == 0) {
								if (checked) {
									_loginACCOUNT(edittext1.getText().toString(), edittext2.getText().toString());
									_custom_loading(true);
								}
								else {
									_Custom_Toast("Kindly Read And Accept The Terms Of Service To Continue", "#FFFFFF", "#FFFFFF");
								}
							}
							else {
								if (authyTYPE == 1) {
									if (checked) {
										authentication.createUserWithEmailAndPassword(edittext1.getText().toString(), edittext2.getText().toString()).addOnCompleteListener(SplashjoinActivity.this, _authentication_create_user_listener);
										_custom_loading(true);
									}
									else {
										_Custom_Toast("Kindly Read And Accept The Terms Of Service To Continue", "#FFFFFF", "#FFFFFF");
									}
								}
								else {
									authentication.sendPasswordResetEmail(edittext1.getText().toString()).addOnCompleteListener(_authentication_reset_password_listener);
									_custom_loading(true);
								}
							}
						}
						else {
							_Custom_Toast("You are not connected to a network!", "#FFFFFF", "#FFFFFF");
						}
					}
					else {
						((EditText)edittext2).setError("Password must contain uppercase, lowercase, number, special character, and be 8-32 characters long");
					}
				}
			}
		});
		
		checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					final AlertDialog dialog1 = new AlertDialog.Builder(SplashjoinActivity.this).create();
							View inflate = getLayoutInflater().inflate(R.layout.paragraph,null); 
							dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
							dialog1.setView(inflate);
					LinearLayout linearBg = (LinearLayout) inflate.findViewById(R.id.linearBg);
					LinearLayout linear4 = (LinearLayout) inflate.findViewById(R.id.linear4);
					ScrollView vscroll1 = (ScrollView) inflate.findViewById(R.id.vscroll1);
					TextView textviewdesc = (TextView) inflate.findViewById(R.id.textviewdesc);
					TextView confirmed = (TextView) inflate.findViewById(R.id.confirmed);
					vscroll1.setVerticalScrollBarEnabled(false); 
					vscroll1.setHorizontalScrollBarEnabled(false);
					OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
					linearBg.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFFFF));
					textviewdesc.setText(Html.fromHtml("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n</head>\n<body>\n    <h2>Privacy Policy:</h2>\n\n    <h3>1. User Data Collection:</h3>\n    <p>1.1 We collect user email and password solely for login and authentication purposes, ensuring that this information is not visible to other users.</p>\n    <p>1.2 User's First Name, Last Name, and Other Names are collected to facilitate visibility to other users within the app.</p>\n    <p>1.3 Date of Birth is optional for users to provide, maintaining flexibility in information sharing.</p>\n    <p>1.4 User Personality Type, chosen from a predefined list, is visible to other users to enhance social interaction.</p>\n    <p>1.5 Relationship Status, Relationship Type, and Short Bio are gathered and made visible to foster meaningful connections within the app.</p>\n    <p>1.6 The Album link from Google Photos is a compulsory and visible feature to share visual content with other users.</p>\n\n    <h3>2. Social Media Links:</h3>\n    <p>2.1 Facebook Profile Link, WhatsApp Number  (which is mandatory for you to provide), Snapchat, TikTok, and Telegram details are collected and displayed to other users for increased social connectivity.</p>\n\n    <h3>3. Privacy Assurance:</h3>\n    <p>3.1 We are committed to safeguarding user data and ensuring that sensitive information such as login credentials remains confidential.</p>\n    <p>3.2 User-provided data visible to others is limited to enhance privacy while still fostering a social environment within the app.</p>\n    <p>3.3 User consent is a priority, and users have the option to share or withhold certain information, such as Date of Birth.</p>\n\n    <h2>Terms and Conditions:</h2>\n\n    <h3>1. Account Usage:</h3>\n    <p>1.1 Users are responsible for maintaining the confidentiality of their login credentials and ensuring the security of their accounts.</p>\n    <p>1.2 The app reserves the right to suspend or terminate accounts found in violation of the provided terms and conditions.</p>\n\n    <h3>2. User Content:</h3>\n    <p>2.1 Users are responsible for the accuracy and appropriateness of the information shared, including Personality Type, Relationship Status, and Bio.</p>\n    <p>2.2 The app reserves the right to moderate or remove content that violates community standards or is deemed inappropriate.</p>\n\n    <h3>3. Social Interaction:</h3>\n    <p>3.1 Users agree to respect the privacy of others and use the provided information responsibly for fostering genuine connections.</p>\n    <p>3.2 Any misuse of personal information, including social media links, will result in account suspension.</p>\n\n    <h3>4. Data Handling:</h3>\n    <p>4.1 The app adheres to stringent data protection measures to secure user information and prevent unauthorized access.</p>\n    <p>4.2 Users have the right to request the removal of their account and associated data from the app.</p>\n\n    <h3>5. Modification of Terms:</h3>\n    <p>5.1 The app reserves the right to update and modify the terms and conditions, with users being notified of any changes.</p>\n\n    <p>By using the Check-Mate app, users acknowledge and agree to the outlined Privacy Policy and Terms and Conditions. It is recommended to periodically review these documents for any updates.</p>\n</body>\n</html>"));
					textviewdesc.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
					int d = 1;
					GradientDrawable SketchUi = new GradientDrawable();
					SketchUi.setColor(0xFFB8FFE0);
					SketchUi.setCornerRadius(d*6);
					confirmed.setElevation(d*3);
					RippleDrawable SketchUi_RD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
					confirmed.setBackground(SketchUi_RD);
					
					confirmed.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
									dialog1.dismiss();
									temp.edit().putString("created", "yes").commit();
							}
					});
					
					dialog1.setCancelable(false);
					dialog1.show();
					checkbox3.setTextColor(0xFF009688);
					checked = true;
				}
				else {
					checkbox3.setTextColor(0xFF9E9E9E);
					checked = false;
				}
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (authyTYPE == 0) {
					textview10.setText("Login");
					_authTYPE(1);
				}
				else {
					if (authyTYPE == 1) {
						textview10.setText("Join The Community");
						edittext3.setText("        ");
						_authTYPE(0);
					}
					else {
						textview10.setText("Join The Community");
						_authTYPE(0);
					}
				}
				edittext2.setText("");
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				INTENT.setClass(getApplicationContext(), UploadpgActivity.class);
				startActivity(INTENT);
				finish();
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (authyTYPE == 0) {
					_CardView("#FFFFFF", 10, 0, pass);
						edittext2.setBackgroundColor(0xFFFFFFFF);
						satisfied = true;
					    ((EditText)edittext2).setError(null);
				}
				else {
					String password = _charSeq;
					String regex = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!?*£¢€¥%&<>]).{8,32})";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(password);
					
					if (matcher.matches()) {
							_CardView("#E8F5E9", 10, 0, pass);
							edittext2.setBackgroundColor(0xFFE8F5E9);
							satisfied = true;
						    ((EditText)edittext2).setError(null);
					} else {
							_CardView("#FFEBEE", 10, 0, pass);
							edittext2.setBackgroundColor(0xFFFFEBEE);
							satisfied = false;
					}
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (checked) {
					Intent signInIntent = GoogleAuth.getSignInIntent();
					
					startActivityForResult(signInIntent, REQ_CD_GOOGLEAUTH);
				}
				else {
					_Custom_Toast("Kindly Read and Accept the Terms of Service", "#FFFFFF", "#FFFFFF");
				}
			}
		});
		
		_call_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_udb_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		udb.addChildEventListener(_udb_child_listener);
		
		_utj_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		utj.addChildEventListener(_utj_child_listener);
		
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
				if (_success) {
					authentication.getCurrentUser().sendEmailVerification() .addOnCompleteListener(new OnCompleteListener<Void>() {
						@Override
						public void onComplete(Task<Void> task) {
							if (task.isSuccessful()) {
								usermap = new HashMap<>();
								usermap.put("time", new SimpleDateFormat("dd/MM/yyyy (hh:mm)").format(calendar.getTime()));
								utj.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(usermap);
								usermap.clear();
								_dialogSHOW("Email Verification", "Welcome to Blocs! To enhance your security, please verify your email before logging in. Don't forget to check your spam folder for the verification message. We're excited to have you on board!", "", "OK");
							} else {
								_dialogSHOW("Email Verification Failed!", "Unfortunately there was an error sending the verification email.", "RESEND EMAIL", "CLOSE");
							}
						} });
				}
				else {
					_dialogSHOW("Account Creation Failed!", _errorMessage, "", "CLOSE");
				}
				_custom_loading(false);
			}
		};
		
		_authentication_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				allDataNotEmpty = false;
				if (_success) {
					eVERIFIED = authentication.getCurrentUser().isEmailVerified();
					if (eVERIFIED) {
						ac.edit().putString("verify", "yes").commit();
						user_location = "userdb/".concat(FirebaseAuth.getInstance().getCurrentUser().getUid());
						udb = _firebase.getReference(user_location);
						
						ValueEventListener valuelistener2 = new ValueEventListener() {
							@Override
							public void onDataChange(DataSnapshot _param1) {
								GenericTypeIndicator <HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap< String, Object>>() {};
								try {
									HashMap <String, Object> _map= _param1.getValue(_ind);
									
									try{
										ac.edit().putString("uid", _map.get("uid").toString()).commit();
										ac.edit().putString("username", _map.get("username").toString()).commit();
										ac.edit().putString("email", _map.get("email").toString()).commit();
										ac.edit().putString("message", _map.get("message").toString()).commit();
										ac.edit().putString("time", _map.get("time").toString()).commit();
										while(!allDataNotEmpty) {
											if (!ac.getString("uid", "").isEmpty()
											&& !ac.getString("apis", "").isEmpty()
											&& !ac.getString("email", "").isEmpty()
											&& !ac.getString("username", "").isEmpty()
											&& !ac.getString("message", "").isEmpty()
											&& !ac.getString("time", "").isEmpty()) {
												allDataNotEmpty = true;
												timer = new TimerTask() {
													@Override
													public void run() {
														runOnUiThread(new Runnable() {
															@Override
															public void run() {
																_custom_loading(false);
																INTENT.setClass(getApplicationContext(), SplashjoinActivity.class);
																startActivity(INTENT);
																_Custom_Toast("Signed In Successfully!", "#FFFFFF", "#FFFFFF");
																finish();
															}
														});
													}
												};
												_timer.schedule(timer, (int)(1000));
											}
											else {
												SketchwareUtil.showMessage(getApplicationContext(), "Error!");
												_custom_loading(false);
											}
										}
									}catch(Exception e){
										SketchwareUtil.showMessage(getApplicationContext(), e.toString());
										((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", e.toString()));
										_custom_loading(false);
									}
								} catch (Exception e) {
									showMessage(e.toString()); }
							}
							
							@Override
							public void onCancelled(DatabaseError databaseError) { SketchwareUtil.showMessage(getApplicationContext(), "error");
							}
						};
						
						
						udb.addValueEventListener(valuelistener2);
						temp.edit().remove("email").commit();
						temp.edit().remove("password").commit();
					}
					else {
						_dialogSHOW("Email Not Verified", "Unfortunately you need to verify your email to prove you're not spamming or is not a robot.", "RESEND EMAIL", "CLOSE");
						_custom_loading(false);
					}
				}
				else {
					if (googleLOGIN && _errorMessage.equals("There is no user record corresponding to this identifier or this user may have been banned. Perhaps you should create a new account.")) {
						authentication.createUserWithEmailAndPassword(gMAIL, gPASS).addOnCompleteListener(SplashjoinActivity.this, _authentication_create_user_listener);
					}
					else {
						_dialogSHOW("Failed Logging In", _errorMessage, "", "CLOSE");
					}
					_custom_loading(false);
				}
			}
		};
		
		_authentication_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				if (_success) {
					_custom_loading(false);
					_dialogSHOW("Password Reset Email Sent", "The email to reset your password has been sent, don't forget to check your spam folder if you can't find it.", "", "OK");
				}
				else {
					_custom_loading(false);
					_dialogSHOW("Failed Sending Email", "There was an error while sending the email to reset your password. Please try again later.", "", "CANCEL");
				}
			}
		};
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			    
			    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		}
		textview11.setText("Sponsored by Quackbits\nA Tech Start-up\nCreated by @paren7 on telegram");
		GoogleSignInOptions options = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("638693759883-cjmenrscvbu3hl80qj7k7s41l8ap3m83.apps.googleusercontent.com").requestEmail().build();
		GoogleAuth = GoogleSignIn.getClient(this, options);
		authentication = FirebaseAuth.getInstance();
		if (!(temp.getString("email", "").equals("") || temp.getString("password", "").equals(""))) {
			if (!temp.getString("email", "").equals("")) {
				edittext1.setText(temp.getString("email", ""));
			}
			if (!temp.getString("email", "").equals("")) {
				edittext2.setText(temp.getString("password", ""));
			}
		}
		OverScrollDecoratorHelper.setUpOverScroll(vscroll2);
		read = 0;
		_changeActivityFont("font");
		_rippleRoundStroke(linear5, "#FF00816A", "#64FFDA", 6, 0, "#EEEEEE");
		edittext3.setText("bisa");
		_Ui(linear3);
		_Ui(mail);
		_Ui(use);
		use.setVisibility(View.GONE);
		_Ui_View(textview10);
		_Ui_View(textview5);
		edittext2.setHint("••••••••");
		_removeScollBar(vscroll2);
		textview11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE0FEF1));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_GOOGLEAUTH:
			if (_resultCode == Activity.RESULT_OK) {
				Task<GoogleSignInAccount> _task = GoogleSignIn.getSignedInAccountFromIntent(_data);
				
				try {
						// Google Sign In was successful, authenticate with Firebase
						GoogleSignInAccount account = _task.getResult(ApiException.class);	firebaseAuthWithGoogle(account.getIdToken());
					    _custom_loading(true);
				} catch (ApiException e) {
						//On Fiailure
						final String ErrorOnResultSign = e.getMessage();
						_Custom_Toast(ErrorOnResultSign, "#FFFFFF", "#FFFFFF");
					_custom_loading(false);
				}
				
			}
			else {
				_Custom_Toast("Account Selection Cancelled", "#FFFFFF", "#FFFFFF");
				_custom_loading(false);
			}
			break;
			default:
			break;
		}
	}
	
	
	@Override
	public void onBackPressed() {
		finish();
	}
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _CardView(final String _color, final double _radius, final double _shadow, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		try {
			if(Build.VERSION.SDK_INT >= 21) {
				_view.setElevation((int)_shadow);
			}
		} catch (Exception e) {}
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
					((TextView) v).setTypeface(typeace);
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
	
	
	public void _loginACCOUNT(final String _email, final String _password) {
		gMAIL = _email;
		gPASS = _password;
		authentication.signInWithEmailAndPassword(_email, _password).addOnCompleteListener(SplashjoinActivity.this, _authentication_sign_in_listener);
		_custom_loading(true);
	}
	
	
	public void _authTYPE(final double _no) {
		_TransitionManager(linear1, 500);
		authyTYPE = _no;
		if (_no == 0) {
			textview1.setText("Welcome Back!");
			textview2.setText("Reconnect like everyone else");
			use.setVisibility(View.GONE);
			linear3.setVisibility(View.VISIBLE);
			textview7.setText("Login");
			textview5.setVisibility(View.VISIBLE);
			checkbox1.setVisibility(View.VISIBLE);
			if (edittext3.getText().toString().equals("")) {
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								edittext3.setText("x");
							}
						});
					}
				};
				_timer.schedule(time, (int)(500));
			}
			else {
				
			}
		}
		else {
			if (_no == 1) {
				textview1.setText("Welcome to Blocs");
				textview2.setText("Connect like everyone else");
				use.setVisibility(View.VISIBLE);
				linear3.setVisibility(View.VISIBLE);
				textview7.setText("Create Account");
				textview5.setVisibility(View.VISIBLE);
				checkbox1.setVisibility(View.VISIBLE);
				edittext3.setText("");
			}
			else {
				if (_no == 2) {
					textview1.setText("Forgot Password?");
					textview2.setText("Request for email to reset password");
					linear3.setVisibility(View.GONE);
					use.setVisibility(View.GONE);
					textview7.setText("Request Email");
					textview5.setVisibility(View.GONE);
					checkbox1.setVisibility(View.INVISIBLE);
					if (edittext2.getText().toString().equals("")) {
						time = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										edittext2.setText("x");
									}
								});
							}
						};
						_timer.schedule(time, (int)(500));
					}
					else {
						
					}
					if (edittext3.getText().toString().equals("")) {
						time = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										edittext3.setText("0");
									}
								});
							}
						};
						_timer.schedule(time, (int)(500));
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _dialogSHOW(final String _title, final String _description, final String _positive, final String _negative) {
		final AlertDialog dialog = new AlertDialog.Builder(SplashjoinActivity.this).create();
		
		View inflate = getLayoutInflater().inflate(R.layout.dailog, null);
		 
		dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		
		dialog.setView(inflate);
		LinearLayout main = (LinearLayout)inflate.findViewById(R.id.linear1);
		
		TextView title = (TextView) inflate.findViewById(R.id.textview2);
		TextView description = (TextView) inflate.findViewById(R.id.textview1);
		TextView positive = (TextView) inflate.findViewById(R.id.textview3);
		TextView negative = (TextView) inflate.findViewById(R.id.textview4);
		_rippleRoundStroke(positive, "#FFE0F2F1", "#EEEEEE", 10, 0, "#EEEEEE");
		_rippleRoundStroke(negative, "#FFE0F2F1", "#EEEEEE", 10, 0, "#EEEEEE");
		_CardView("#FFFFFF", 10, 15, main);
		title.setText(_title);
		description.setText(_description);
		positive.setText(_positive);
		negative.setText(_negative);
		if (_positive.equals("")) {
			positive.setVisibility(View.GONE);
		}
		if (_negative.equals("")) {
			negative.setVisibility(View.GONE);
		}
		positive.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (_positive.equals("RESEND EMAIL")) {
					dialog.dismiss();
					authentication.getCurrentUser().sendEmailVerification() .addOnCompleteListener(new OnCompleteListener<Void>() {
						@Override
						public void onComplete(Task<Void> task) {
							if (task.isSuccessful()) {
								_dialogSHOW("Email Verification Sent", "Email to verify your email address has been sent. Don't forget to check your spam folder.", "", "OK");
							} else {
								_dialogSHOW("Failed Email Verification", "Unfortunately there was an error sending the email to verify your email address, please try again later.", "RESEND EMAIL", "CANCEL");
							}
						} });
					_custom_loading(false);
				}
				if (_title.equals("Email Verification Sent")) {
					_Custom_Toast("Open the Gmail App", "#FFFFFF", "#FFFFFF");
				}
			}
		});
		negative.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dialog.dismiss();
			}
		});
		dialog.setCancelable(false);
		dialog.show();
	}
	
	
	public void _Ui(final View _line) {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*33);
			SketchUi.setStroke(d*0,0xFF009688);
			_line.setElevation(d*9);
			_line.setBackground(SketchUi);
		}
	}
	
	
	public void _custom_loading(final boolean _visibility) {
		if (_visibility) {
			if (coreprog == null){
				coreprog = new ProgressDialog(this);
				coreprog.setCancelable(false);
				coreprog.setCanceledOnTouchOutside(false);
				
				coreprog.requestWindowFeature(Window.FEATURE_NO_TITLE);  coreprog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
				
			}
			coreprog.setMessage(null);
			coreprog.show();
			View _view = getLayoutInflater().inflate(R.layout.custom_loading, null);
			LinearLayout linear_base = (LinearLayout) _view.findViewById(R.id.linear_base);
			
			LinearLayout linear_prog = (LinearLayout)
			_view.findViewById(R.id.linear_prog);
			
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.TRANSPARENT);
			gd.setCornerRadius(25);
			linear_base.setBackground(gd);
			coreprog.setContentView(_view);
			
			linear_prog.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)1, 0xFFFFFFFF, 0xFFFFFFFF));
		}
		else {
			if (coreprog != null){
				coreprog.dismiss();
			}
		}
	}
	private ProgressDialog coreprog;
	{
	}
	
	
	public void _Ui_View(final View _view) {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*15);
			_view.setElevation(d*3);
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF9E9E9E}), SketchUi, null);
			_view.setBackground(SketchUi_RD);
			_view.setClickable(true);
		}
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _Custom_Toast(final String _text, final String _bgcolor, final String _tcolor) {
		LayoutInflater inflater = getLayoutInflater(); View toastLayout = inflater.inflate(R.layout.toast, null);
		
		TextView textview1 = (TextView) toastLayout.findViewById(R.id.textview1);
		textview1.setText(_text);
		textview1.setTextColor(Color.parseColor(_tcolor));
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		LinearLayout linear1 = (LinearLayout) toastLayout.findViewById(R.id.linear1);
		
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor("#424242"));
		gd.setCornerRadius(20);
		linear1.setBackground(gd);
		
		Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.TOP,0,0);
		toast.setView(toastLayout);
		toast.show();
	}
	
	
	public void _GoogleSignupComplete() {
	}
	private void firebaseAuthWithGoogle(String idToken) {
		AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
		authentication.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
			
			@Override
			public void onComplete(@NonNull Task<AuthResult> task) {
				if (task.isSuccessful()) {
					FirebaseUser = authentication.getCurrentUser();
					ac.edit().putString("username", FirebaseUser.getDisplayName()).commit();
					ac.edit().putString("email", FirebaseUser.getEmail()).commit();
					ac.edit().putString("url", FirebaseUser.getPhotoUrl().toString()).commit();
					if (task.getResult().getAdditionalUserInfo().isNewUser()) {
							_Custom_Toast("New User Created", "#FFFFFF", "#FFFFFF");
						_custom_loading(false);
					}
					else {
							_Custom_Toast("Log In Successful", "#FFFFFF", "#FFFFFF");
						_custom_loading(false);
					}
					intent.setClass(getApplicationContext(), HomeActivity.class);
					startActivity(intent);
					finish();
				} else {
					_Custom_Toast("An unknown error occured during the process", "#FFFFFF", "#FFFFFF");
					_custom_loading(false);
				}
			}
		});
	}
	//[END auth_with_google]
	{
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