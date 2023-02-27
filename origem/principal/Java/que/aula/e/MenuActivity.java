package que.aula.e;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.view.View;
import android.widget.AdapterView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class MenuActivity extends  Activity { 
	
	private Timer _timer = new Timer();
	
	private String Horas = "";
	private String Minutos = "";
	private double time = 0;
	private String Aula = "";
	private double Hora_Number = 0;
	private double Minutos_Number = 0;
	private String prox_aula = "";
	private String date_strg = "";
	private boolean click = false;
	private double position_click = 0;
	private String hoje = "";
	private String hoje_m = "";
	private String prof1 = "";
	private String prof2 = "";
	private String h_i = "";
	private String h_f = "";
	private String aula_1 = "";
	private String aula_2 = "";
	private String aula_3 = "";
	private String aula_4 = "";
	private String aula_5 = "";
	private String aula_6 = "";
	private String aula_7 = "";
	private String aula_8 = "";
	private String aula_1_fim = "";
	private String aula_2_fim = "";
	private String aula_3_fim = "";
	private String aula_4_fim = "";
	private String aula_5_fim = "";
	private String aula_6_fim = "";
	private String aula_7_fim = "";
	private String aula_8_fim = "";
	private String titulo = "";
	private String nota = "";
	private String nomeString = "";
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> my_map = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView linear_drop;
	private LinearLayout linear3;
	private LinearLayout linear_card;
	private LinearLayout linear_menu_down;
	private ImageView b_down;
	private LinearLayout linear8;
	private LinearLayout linear_card_dentro;
	private LinearLayout linear6;
	private TextView text_date;
	private TextView textview2;
	private TextView text_aula;
	private TextView textview3;
	private TextView text_prox_aula;
	private RadioButton radio_segunda;
	private RadioButton radio_terca;
	private RadioButton radio_quarta;
	private RadioButton radio_quinta;
	private RadioButton radio_sexta;
	private LinearLayout linear10;
	private LinearLayout linear_block;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear30;
	private ListView listview2;
	private LinearLayout linear32;
	private LinearLayout linear19;
	private LinearLayout user_box;
	private LinearLayout linear20;
	private LinearLayout linear22;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear26;
	private TextView text_materia;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private ImageView imageview5;
	private TextView text_prof_1;
	private ImageView imageview6;
	private TextView text_prof_2;
	private LinearLayout line;
	private ImageView imageview2;
	private TextView text_horario;
	private ImageView imageview3;
	private TextView text_horario_fim;
	private LinearLayout linear29;
	private TextView textview4;
	private ImageView img_add;
	private ImageView img_delete_all;
	
	private Intent int_menu_2 = new Intent();
	private Calendar calender = Calendar.getInstance();
	private Intent timer = new Intent();
	private TimerTask timer_2;
	private AlertDialog.Builder msg;
	private AlertDialog.Builder dialog;
	private SharedPreferences shrd;
	private AlertDialog.Builder delee_nota;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear_drop = (ScrollView) findViewById(R.id.linear_drop);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear_card = (LinearLayout) findViewById(R.id.linear_card);
		linear_menu_down = (LinearLayout) findViewById(R.id.linear_menu_down);
		b_down = (ImageView) findViewById(R.id.b_down);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear_card_dentro = (LinearLayout) findViewById(R.id.linear_card_dentro);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		text_date = (TextView) findViewById(R.id.text_date);
		textview2 = (TextView) findViewById(R.id.textview2);
		text_aula = (TextView) findViewById(R.id.text_aula);
		textview3 = (TextView) findViewById(R.id.textview3);
		text_prox_aula = (TextView) findViewById(R.id.text_prox_aula);
		radio_segunda = (RadioButton) findViewById(R.id.radio_segunda);
		radio_terca = (RadioButton) findViewById(R.id.radio_terca);
		radio_quarta = (RadioButton) findViewById(R.id.radio_quarta);
		radio_quinta = (RadioButton) findViewById(R.id.radio_quinta);
		radio_sexta = (RadioButton) findViewById(R.id.radio_sexta);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear_block = (LinearLayout) findViewById(R.id.linear_block);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		listview2 = (ListView) findViewById(R.id.listview2);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		user_box = (LinearLayout) findViewById(R.id.user_box);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		text_materia = (TextView) findViewById(R.id.text_materia);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		text_prof_1 = (TextView) findViewById(R.id.text_prof_1);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		text_prof_2 = (TextView) findViewById(R.id.text_prof_2);
		line = (LinearLayout) findViewById(R.id.line);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		text_horario = (TextView) findViewById(R.id.text_horario);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		text_horario_fim = (TextView) findViewById(R.id.text_horario_fim);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		textview4 = (TextView) findViewById(R.id.textview4);
		img_add = (ImageView) findViewById(R.id.img_add);
		img_delete_all = (ImageView) findViewById(R.id.img_delete_all);
		msg = new AlertDialog.Builder(this);
		dialog = new AlertDialog.Builder(this);
		shrd = getSharedPreferences("shrd", Activity.MODE_PRIVATE);
		delee_nota = new AlertDialog.Builder(this);
		
		b_down.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (position_click == 0) {
					position_click--;
					linear_menu_down.setVisibility(View.VISIBLE);
					b_down.setImageResource(R.drawable.seta_cima_png);
					android.graphics.drawable.GradientDrawable JFGIAEF = new android.graphics.drawable.GradientDrawable();
					JFGIAEF.setColor(Color.parseColor("#FFFFFFFF"));
					JFGIAEF.setCornerRadii(new float[] { 27, 27, 27, 27, 0, 0, 0, 0 });
					linear_card.setBackground(JFGIAEF);
				}
				else {
					position_click++;
					linear_menu_down.setVisibility(View.GONE);
					b_down.setImageResource(R.drawable.seta_baixo_png);
					android.graphics.drawable.GradientDrawable EABAICA = new android.graphics.drawable.GradientDrawable();
					EABAICA.setColor(Color.parseColor("#FFFFFFFF"));
					EABAICA.setCornerRadius(27);
					linear_card.setBackground(EABAICA);
					if(Build.VERSION.SDK_INT >= 21) { linear_card.setElevation(15f); }
				}
			}
		});
		
		radio_segunda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (radio_segunda.isChecked()) {
					radio_terca.setChecked(false);
					radio_quarta.setChecked(false);
					radio_quinta.setChecked(false);
					radio_sexta.setChecked(false);
					_segunda();
					text_aula.setText(Aula);
					text_prox_aula.setText(prox_aula);
					text_date.setText("Segunda-feira, ".concat(date_strg));
				}
			}
		});
		
		radio_terca.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (radio_terca.isChecked()) {
					radio_segunda.setChecked(false);
					radio_quarta.setChecked(false);
					radio_quinta.setChecked(false);
					radio_sexta.setChecked(false);
					_terca();
					_intervalo_fora_aula();
					text_aula.setText(Aula);
					text_prox_aula.setText(prox_aula);
					text_date.setText("Terça-feira, ".concat(date_strg));
				}
			}
		});
		
		radio_quarta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (radio_quarta.isChecked()) {
					radio_segunda.setChecked(false);
					radio_terca.setChecked(false);
					radio_quinta.setChecked(false);
					radio_sexta.setChecked(false);
					_quarta();
					_intervalo_fora_aula();
					text_aula.setText(Aula);
					text_prox_aula.setText(prox_aula);
					text_date.setText("Quarta-feira, ".concat(date_strg));
				}
			}
		});
		
		radio_quinta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (radio_quinta.isChecked()) {
					radio_segunda.setChecked(false);
					radio_terca.setChecked(false);
					radio_quarta.setChecked(false);
					radio_sexta.setChecked(false);
					_quinta();
					_intervalo_fora_aula();
					text_aula.setText(Aula);
					text_prox_aula.setText(prox_aula);
					text_date.setText("Quinta-feira, ".concat(date_strg));
				}
			}
		});
		
		radio_sexta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (radio_sexta.isChecked()) {
					radio_segunda.setChecked(false);
					radio_terca.setChecked(false);
					radio_quarta.setChecked(false);
					radio_quinta.setChecked(false);
					_sexta();
					_intervalo_fora_aula();
					text_aula.setText(Aula);
					text_prox_aula.setText(prox_aula);
					text_date.setText("Sexta-feira, ".concat(date_strg));
				}
			}
		});
		
		listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				nomeString = my_map.get((int)_position).get("titulo").toString();
				delee_nota.setMessage("Deseja apagar a nota ".concat(nomeString.concat("?")));
				delee_nota.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						my_map.remove((int)(_position));
						shrd.edit().putString("data", new Gson().toJson(my_map)).commit();
						listview2.setAdapter(new Listview2Adapter(my_map));
						((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
					}
				});
				delee_nota.setNegativeButton("Não", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				delee_nota.create().show();
			}
		});
		
		img_add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_DialogEditText();
			}
		});
		
		img_delete_all.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_delete_all();
			}
		});
	}
	
	private void initializeLogic() {
		_style();
		_date();
		_def_horario();
		hoje = new SimpleDateFormat("EEEE").format(calender.getTime());
		Hora_Number = Double.parseDouble(new SimpleDateFormat("HH").format(calender.getTime()));
		Minutos_Number = Double.parseDouble(new SimpleDateFormat("MM").format(calender.getTime()));
		linear_menu_down.setVisibility(View.GONE);
		String hoje_m = hoje.substring(0, 1).toUpperCase() + hoje.substring(1);
		text_date.setText(hoje_m.concat(", ").concat(date_strg));
		_def_aula();
		_intervalo_fora_aula();
		if (!shrd.getString("data", "").equals("")) {
			my_map = new Gson().fromJson(shrd.getString("data", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview2.setAdapter(new Listview2Adapter(my_map));
			((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
		}
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
		msg.setTitle("Tem certeza?");
		msg.setMessage("Você deseja sair do aplicativo agora?");
		msg.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
			}
		});
		msg.setNegativeButton("Não", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		msg.create().show();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		_def_aula();
		_intervalo_fora_aula();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_def_aula();
		_intervalo_fora_aula();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		_def_aula();
		_intervalo_fora_aula();
	}
	
	@Override
	public void onStop() {
		super.onStop();
		_def_aula();
		_intervalo_fora_aula();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		_def_aula();
		_intervalo_fora_aula();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		_def_aula();
		_intervalo_fora_aula();
	}
	public void _reload () {
		int_menu_2.setClass(getApplicationContext(), MenuActivity.class);
		startActivity(int_menu_2);
		finishAffinity();
	}
	
	
	public void _style () {
		android.graphics.drawable.GradientDrawable EABAICA = new android.graphics.drawable.GradientDrawable();
		EABAICA.setColor(Color.parseColor("#FFFFFFFF"));
		EABAICA.setCornerRadius(27);
		linear_card.setBackground(EABAICA);
		if(Build.VERSION.SDK_INT >= 21) { linear_card.setElevation(15f); }
		android.graphics.drawable.GradientDrawable DHIAGEI = new android.graphics.drawable.GradientDrawable();
		DHIAGEI.setColor(Color.parseColor("#FFE0E0E0"));
		DHIAGEI.setCornerRadii(new float[] { 0, 5, 0, 5, 27, 27, 27, 27 });
		linear_menu_down.setBackground(DHIAGEI);
		if(Build.VERSION.SDK_INT >= 21) { linear_menu_down.setElevation(9f); }
		android.graphics.drawable.GradientDrawable JDDHGHG = new android.graphics.drawable.GradientDrawable();
		JDDHGHG.setColor(Color.parseColor("#FFFFFFFF"));
		JDDHGHG.setCornerRadii(new float[] { 50, 50, 50, 50, 0, 0, 0, 0 });
		linear_drop.setBackground(JDDHGHG);
	}
	
	
	public void _segunda () {
		if (((Hora_Number == 8) && (Minutos_Number < 49)) || (Minutos_Number > 50)) {
			Aula = "PAW ||";
			prox_aula = "PAW ||";
			prof1 = "DIÓGENES";
			prof2 = "BANANINHA";
			h_i = aula_1;
			h_f = aula_1_fim;
		}
		if ((Hora_Number == 9) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "PAW ||";
			prox_aula = "PW ||";
			prof1 = "DIÓGENES";
			prof2 = "BANANINHA";
			h_i = aula_2;
			h_f = aula_2_fim;
		}
		if (((Hora_Number == 10) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "PW ||";
			prox_aula = "PW ||";
			prof1 = "DIÓGENES";
			prof2 = "JOELMA";
			h_i = aula_3;
			h_f = aula_3_fim;
		}
		if ((Hora_Number == 11) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "PW ||";
			prox_aula = "INGLÊS";
			prof1 = "DIÓGENES";
			prof2 = "JOELMA";
			h_i = aula_4;
			h_f = aula_4_fim;
		}
		if ((Hora_Number == 12) && (Minutos_Number < 29)) {
			Aula = "INGLÊS";
			prox_aula = "INGLÊS";
			prof1 = "SAMUEL";
			prof2 = "NULL";
			h_i = aula_5;
			h_f = aula_5_fim;
		}
		if (((Hora_Number == 13) && (Minutos_Number < 59)) || ((Hora_Number == 12) && (Minutos_Number > 30))) {
			Aula = "INTERVALO";
			prox_aula = "INGLÊS";
			h_i = "12:30";
			h_f = "14:00";
		}
		if ((Hora_Number == 14) && ((Minutos_Number < 49) || (Minutos_Number == 49))) {
			Aula = "INGLÊS";
			prox_aula = "PDTCC";
			prof1 = "SAMUEL";
			prof2 = "NULL";
			h_i = aula_6;
			h_f = aula_6_fim;
		}
		if (((Hora_Number == 15) && ((Minutos_Number < 39) || (Minutos_Number == 39))) || (Minutos_Number > 40)) {
			Aula = "PDTCC";
			prox_aula = "PDTCC";
			prof1 = "XAMÃ";
			prof2 = "DIÓGENES";
			h_i = aula_7;
			h_f = aula_7_fim;
		}
		if ((Hora_Number == 16) && (Minutos_Number < 29)) {
			Aula = "PDTCC";
			prox_aula = "FINAL";
			prof1 = "XAMÃ";
			prof2 = "DIÓGENES";
			h_i = aula_8;
			h_f = aula_8_fim;
		}
	}
	
	
	public void _date () {
		calender = Calendar.getInstance();
		text_date.setText(new SimpleDateFormat("dd/MM/yy").format(calender.getTime()));
		date_strg = new SimpleDateFormat("dd/MM/yy").format(calender.getTime());
	}
	
	
	public void _terca () {
		if (((Hora_Number == 8) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "QUÍMICA";
			prox_aula = "QUÍMICA";
			prof1 = "MAIRLA";
			prof2 = "NULL";
			h_i = aula_1;
			h_f = aula_1_fim;
		}
		if ((Hora_Number == 9) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "QUÍMICA";
			prox_aula = "APW ||";
			prof1 = "MAIRLA";
			prof2 = "NULL";
			h_i = aula_2;
			h_f = aula_2_fim;
		}
		if (((Hora_Number == 10) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "APW ||";
			prox_aula = "APW ||";
			prof1 = "AUGUSTO";
			prof2 = "NULL";
			h_i = aula_3;
			h_f = aula_3_fim;
		}
		if ((Hora_Number == 11) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "APW ||";
			prox_aula = "MATEMÁTICA";
			prof1 = "AUGUSTO";
			prof2 = "NULL";
			h_i = aula_4;
			h_f = aula_4_fim;
		}
		if (((Hora_Number == 12) && ((Minutos_Number < 29) || (Minutos_Number == 29))) || (Minutos_Number > 30)) {
			Aula = "MATEMÁTICA";
			prox_aula = "PORTUGUÊS";
			prof1 = "AMAURI";
			prof2 = "NULL";
			h_i = aula_5;
			h_f = aula_5_fim;
		}
		if ((Hora_Number == 14) && ((Minutos_Number < 49) || (Minutos_Number == 49))) {
			Aula = "PORTUGUÊS";
			prox_aula = "PORTUGUÊS";
			prof1 = "CARLA";
			prof2 = "NULL";
			h_i = aula_6;
			h_f = aula_6_fim;
		}
		if (((Hora_Number == 15) && ((Minutos_Number < 39) || (Minutos_Number == 39))) || (Minutos_Number > 40)) {
			Aula = "PORTUGUÊS";
			prox_aula = "FINAL";
			prof1 = "CARLA";
			prof2 = "NULL";
			h_i = aula_7;
			h_f = aula_7_fim;
		}
	}
	
	
	public void _quarta () {
		if (((Hora_Number == 8) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "MATEMÁTICA";
			prox_aula = "MATEMÁTICA";
			prof1 = "AMAURI";
			prof2 = "NULL";
			h_i = aula_1;
			h_f = aula_1_fim;
		}
		if ((Hora_Number == 9) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "MATEMÁTICA";
			prox_aula = "PORTUGUÊS";
			prof1 = "AMAURI";
			prof2 = "NULL";
			h_i = aula_2;
			h_f = aula_2_fim;
		}
		if (((Hora_Number == 10) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "PORTUGUÊS";
			prox_aula = "PORTUGUÊS";
			prof1 = "CARLA";
			prof2 = "NULL";
			h_i = aula_3;
			h_f = aula_3_fim;
		}
		if ((Hora_Number == 11) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "PORTUGUÊS";
			prox_aula = "FILOSOFIA";
			prof1 = "CARLA";
			prof2 = "NULL";
			h_i = aula_4;
			h_f = aula_4_fim;
		}
		if (((Hora_Number == 12) && ((Minutos_Number < 29) || (Minutos_Number == 29))) || (Minutos_Number > 30)) {
			Aula = "FILOSOFIA";
			prox_aula = "BIOLOGIA";
			prof1 = "SAMUEL";
			prof2 = "NULL";
			h_i = aula_5;
			h_f = aula_5_fim;
		}
		if ((Hora_Number == 14) && ((Minutos_Number < 49) || (Minutos_Number == 49))) {
			Aula = "BIOLOGIA";
			prox_aula = "BIOLOGIA";
			prof1 = "THIAGO";
			prof2 = "NULL";
			h_i = aula_6;
			h_f = aula_6_fim;
		}
		if ((Hora_Number == 15) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "BIOLOGIA";
			prox_aula = "FINAL";
			prof1 = "THIAGO";
			prof2 = "NULL";
			h_i = aula_7;
			h_f = aula_7_fim;
		}
	}
	
	
	public void _quinta () {
		if (((Hora_Number == 8) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "FÍSICA";
			prox_aula = "FÍSICA";
			prof1 = "VALÉRIA";
			prof2 = "NULL";
			h_i = aula_1;
			h_f = aula_1_fim;
		}
		if ((Hora_Number == 9) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "FÍSICA";
			prox_aula = "HISTÓRIA";
			prof1 = "VALÉRIA";
			prof2 = "NULL";
			h_i = aula_2;
			h_f = aula_2_fim;
		}
		if ((Hora_Number == 10) && ((Minutos_Number < 49) || (Minutos_Number == 49))) {
			Aula = "HISTÓRIA";
			prox_aula = "HISTÓRIA";
			prof1 = "SAMUEL";
			prof2 = "NULL";
			h_i = aula_3;
			h_f = aula_3_fim;
		}
		if ((Hora_Number == 11) && (Minutos_Number < 39)) {
			Aula = "HISTÓRIA";
			prox_aula = "ED. FÍSICA";
			prof1 = "SAMUEL";
			prof2 = "NULL";
			h_i = aula_4;
			h_f = aula_4_fim;
		}
		if ((Hora_Number == 11) && (Minutos_Number > 39)) {
			Aula = "ED. FÍSICA";
			prox_aula = "ED. FÍSICA";
			prof1 = "WILLIANS";
			prof2 = "NULL";
			h_i = aula_5;
			h_f = aula_5_fim;
		}
		if ((Hora_Number == 12) && ((Minutos_Number < 29) || (Minutos_Number == 29))) {
			Aula = "ED. FÍSICA";
			prox_aula = "ED. FÍSICA";
			prof1 = "WILLIANS";
			prof2 = "NULL";
			h_i = aula_5;
			h_f = aula_5_fim;
		}
		if ((Hora_Number == 14) && ((Minutos_Number < 49) || (Minutos_Number == 49))) {
			Aula = "ED. FISICA";
			prox_aula = "FINAL";
			prof1 = "WILLIANS";
			prof2 = "NULL";
			h_i = aula_6;
			h_f = aula_6_fim;
		}
	}
	
	
	public void _sexta () {
		if (((Hora_Number == 8) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "PW ||";
			prox_aula = "PW ||";
			prof1 = "DIÓGENES";
			prof2 = "JOELMA";
			h_i = aula_1;
			h_f = aula_1_fim;
		}
		if ((Hora_Number == 9) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "PW ||";
			prox_aula = "MATEMÁTICA";
			prof1 = "DIÓGENES";
			prof2 = "JOELMA";
			h_i = aula_2;
			h_f = aula_2_fim;
		}
		if (((Hora_Number == 10) && ((Minutos_Number < 49) || (Minutos_Number == 49))) || (Minutos_Number > 50)) {
			Aula = "MATEMÁTICA";
			prox_aula = "SOCIOLOGIA";
			prof1 = "AMAURI";
			prof2 = "NULL";
			h_i = aula_3;
			h_f = aula_3_fim;
		}
		if ((Hora_Number == 11) && ((Minutos_Number < 39) || (Minutos_Number == 39))) {
			Aula = "SOCIOLOGIA";
			prox_aula = "MARKETING";
			prof1 = "SAMUEL";
			prof2 = "NULL";
			h_i = aula_4;
			h_f = aula_4_fim;
		}
		if (((Hora_Number == 12) && ((Minutos_Number < 29) || (Minutos_Number == 29))) || (Minutos_Number > 30)) {
			Aula = "MARKETING";
			prox_aula = "MARKETING";
			prof1 = "JOELMA";
			prof2 = "DIÓGENES";
			h_i = aula_5;
			h_f = aula_5_fim;
		}
		if ((Hora_Number == 14) && ((Minutos_Number < 49) || (Minutos_Number == 49))) {
			Aula = "MARKETING";
			prox_aula = "GEOGRAFIA";
			prof1 = "JOELMA";
			prof2 = "DIÓGENES";
			h_i = aula_6;
			h_f = aula_6_fim;
		}
		if (((Hora_Number == 15) && ((Minutos_Number < 39) || (Minutos_Number == 39))) || (Minutos_Number > 40)) {
			Aula = "GEOGRAFIA";
			prox_aula = "GEOGRAFIA";
			prof1 = "RODRIGO";
			prof2 = "NULL";
			h_i = aula_7;
			h_f = aula_7_fim;
		}
		if ((Hora_Number == 16) && ((Minutos_Number < 29) || (Minutos_Number == 49))) {
			Aula = "GEOGRAFIA";
			prox_aula = "FINAL";
			prof1 = "RODRIGO";
			prof2 = "NULL";
			h_i = aula_8;
			h_f = aula_8_fim;
		}
	}
	
	
	public void _intervalo_fora_aula () {
		if (((Hora_Number == 13) && (Minutos_Number < 59)) || ((Hora_Number == 12) && (Minutos_Number > 30))) {
			Aula = "INTERVALO";
			text_aula.setText(Aula);
			linear_block.setVisibility(View.VISIBLE);
			text_prof_1.setText("Professor");
			text_prof_2.setText("Professor");
			text_horario.setText("Começo");
			text_horario_fim.setText("Fim");
		}
		if ((Hora_Number < 8) || (Hora_Number > 16)) {
			Aula = "SEM AULA";
			prox_aula = "SEM AULA";
			text_aula.setText(Aula);
			text_prox_aula.setText(prox_aula);
			text_prof_1.setText("Professor");
			text_prof_2.setText("Professor");
			text_horario.setText("Começo");
			text_horario_fim.setText("Fim");
		}
	}
	
	
	public void _def_data () {
		hoje = new SimpleDateFormat("EEEE").format(calender.getTime());
		if (hoje.equals("segunda-feira")) {
			_segunda();
		}
		if (hoje.equals("terça-feira")) {
			_terca();
		}
		if (hoje.equals("quarta-feira")) {
			_quarta();
		}
		if (hoje.equals("quinta-feira")) {
			_quinta();
		}
		if (hoje.equals("sexta-feira")) {
			_sexta();
		}
	}
	
	
	public void _def_aula () {
		calender = Calendar.getInstance();
		hoje = new SimpleDateFormat("EEEE").format(calender.getTime());
		Hora_Number = Double.parseDouble(new SimpleDateFormat("HH").format(calender.getTime()));
		Minutos_Number = Double.parseDouble(new SimpleDateFormat("MM").format(calender.getTime()));
		if (hoje.equals("segunda-feira")) {
			_segunda();
			linear_block.setVisibility(View.VISIBLE);
		}
		if (hoje.equals("terça-feira")) {
			_terca();
			linear_block.setVisibility(View.VISIBLE);
		}
		if (hoje.equals("quarta-feira")) {
			_quarta();
			linear_block.setVisibility(View.VISIBLE);
		}
		if (hoje.equals("quinta-feira")) {
			_quinta();
			linear_block.setVisibility(View.VISIBLE);
		}
		if (hoje.equals("sexta-feira")) {
			_sexta();
			linear_block.setVisibility(View.VISIBLE);
		}
		if (prof2.equals("NULL")) {
			linear25.setVisibility(View.GONE);
		}
		else {
			linear25.setVisibility(View.VISIBLE);
		}
		text_aula.setText(Aula);
		text_prox_aula.setText(prox_aula);
		text_materia.setText(Aula);
		text_prof_1.setText(prof1);
		text_prof_2.setText(prof2);
		text_horario.setText(h_i);
		text_horario_fim.setText(h_f);
	}
	
	
	public void _def_horario () {
		aula_1 = "08:00";
		aula_1_fim = "08:50";
		aula_2 = "08:50";
		aula_2_fim = "09:40";
		aula_3 = "10:00";
		aula_3_fim = "10:50";
		aula_4 = "10:50";
		aula_4_fim = "11:40";
		aula_5 = "11:40";
		aula_5_fim = "12:30";
		aula_6 = "14:00";
		aula_6_fim = "14:50";
		aula_7 = "14:50";
		aula_7_fim = "15:40";
		aula_8 = "15:40";
		aula_8_fim = "16:30";
	}
	
	
	public void _DialogEditText () {
		dialog.setTitle("Adicionar Nova Anotação");
		dialog.setMessage("Digite Abaixo");
		LinearLayout layout = new LinearLayout(MenuActivity.this);
		
		layout.setOrientation (LinearLayout.VERTICAL);
		
		LinearLayout.LayoutParams Ip = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		final EditText edit1 = new EditText(MenuActivity.this);
		
		final EditText edit2 = new EditText(MenuActivity.this);
		
		edit1.setHint("Título");
		edit2.setHint("Anotação");
		
		layout.addView(edit1);
		layout.addView(edit2); dialog.setView(layout);
		dialog.setPositiveButton("Adicionar", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				titulo = edit1.getText().toString();
				nota = edit2.getText().toString();
				map = new HashMap<>();
				map.put("titulo", titulo);
				map.put("note", nota);
				map.put("date", date_strg);
				map.put("materia", Aula);
				my_map.add(map);
				shrd.edit().putString("data", new Gson().toJson(my_map)).commit();
				listview2.setAdapter(new Listview2Adapter(my_map));
				((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
				SketchwareUtil.showMessage(getApplicationContext(), "Anotação salva");
			}
		});
		dialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialog.create().show();
	}
	
	
	public void _delete_all () {
		if (shrd.getString("data", "").equals("")) {
			msg.setMessage("Não existe nenhuma anotação!");
			msg.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			msg.create().show();
		}
		else {
			msg.setTitle("Cuidado!");
			msg.setMessage("Para deletar apenas uma nota clique em cima dela.\n\nApertando no botão \"Deletar Todas as Anotações\" você irá perder todas suas anotações feitas.");
			msg.setPositiveButton("Deletar Todas as Anotações", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					shrd.edit().remove("data").commit();
					my_map.clear();
					listview2.setAdapter(new Listview2Adapter(my_map));
					((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
				}
			});
			msg.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			msg.create().show();
		}
	}
	
	
	public class Listview2Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.view_list, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			final TextView textview2 = (TextView) _view.findViewById(R.id.textview2);
			final LinearLayout linear4 = (LinearLayout) _view.findViewById(R.id.linear4);
			final TextView text_materia = (TextView) _view.findViewById(R.id.text_materia);
			final TextView text_date = (TextView) _view.findViewById(R.id.text_date);
			
			textview1.setText(my_map.get((int)_position).get("titulo").toString());
			textview2.setText(my_map.get((int)_position).get("note").toString());
			text_date.setText(" - ".concat(my_map.get((int)_position).get("date").toString()));
			text_materia.setText(my_map.get((int)_position).get("materia").toString());
			
			return _view;
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