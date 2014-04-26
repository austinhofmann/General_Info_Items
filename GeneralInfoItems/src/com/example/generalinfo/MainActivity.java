package com.example.generalinfo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	 public static String EXTRA_MESSAGE = "";
     public static int arrayValue = 0;
     
     @Override
     protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);
             
             SpellDatabase.makeSpellDatabase();

             
             final TextView display1 = (TextView)findViewById(R.id.textView1);

             
             ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                               this, R.array.item_array, android.R.layout.simple_spinner_item );
                             adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
                             final ImageView icon = (ImageView)findViewById(R.id.icon);
                             int i = 0;

                             
                             Spinner s = (Spinner) findViewById( R.id.spinner1 );
                             s.setAdapter( adapter );
                             s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                                      

                                     
                                     @Override
                                     public void onItemSelected(AdapterView adapter, View v, int i, long lng) {
                                             display1.setText(adapter.getItemAtPosition(i).toString());
                                             EXTRA_MESSAGE = adapter.getItemAtPosition(i).toString();
                                            
                                             /*
                                             if(EXTRA_MESSAGE.equals("Aatrox")){
                                                 i = 0;
                                  			}else if(EXTRA_MESSAGE.equals("Ahri")){
                                                 i = 1;
                                         	}else if(EXTRA_MESSAGE.equals("Akali")){
                                                 i = 2;
                                         	}else if(EXTRA_MESSAGE.equals("Alistar")){
                                         		i = 3;
                                         	}else if(EXTRA_MESSAGE.equals("Amumu")){
                                         		i = 4;
                                         	}else if(EXTRA_MESSAGE.equals("Anivia")){
                                         		i = 5;
                                         	}else if(EXTRA_MESSAGE.equals("Annie")){
                                         		i = 6;
                                         	}else if(EXTRA_MESSAGE.equals("Ashe")){
                                                 i = 7;
                                         	}else if(EXTRA_MESSAGE.equals("Blitzcrank")){
                                                 i = 8;
                                         	}else if(EXTRA_MESSAGE.equals("Brand")){
                                                 i = 9;
                                         	}else if(EXTRA_MESSAGE.equals("Caitlyn")){
                                         		i = 10;
                                         	}else if(EXTRA_MESSAGE.equals("Cassiopeia")){
                                         		i = 11;
                                         	}else if(EXTRA_MESSAGE.equals("Cho Gath")){
                                         		i = 12;
                                         	}else if(EXTRA_MESSAGE.equals("Corki")){
                                         		i = 13;
                                         	}else if(EXTRA_MESSAGE.equals("Darius")){
                                         		i = 14;
                                         	}else if(EXTRA_MESSAGE.equals("Diana")){
                                         		i = 15;
                                         	}else if(EXTRA_MESSAGE.equals("Dr. Mundo")){
                                         		i = 16;
                                         	}else if(EXTRA_MESSAGE.equals("Draven")){
                                         		i = 17;
                                         	}else if(EXTRA_MESSAGE.equals("Elise")){
                                         		i = 18;
                                         	}else if(EXTRA_MESSAGE.equals("Evelynn")){
                                         		i = 19;
                                         	}else if(EXTRA_MESSAGE.equals("Ezreal")){
                                         		i = 20;
                                         	}else if(EXTRA_MESSAGE.equals("Fiddlesticks")){
                                         		i = 21;
                                         	}else if(EXTRA_MESSAGE.equals("Fiora")){
                                         		i = 22;
                                         	}else if(EXTRA_MESSAGE.equals("Fizz")){
                                         		i = 23;
                                         	}else if(EXTRA_MESSAGE.equals("Galio")){
                                         		i = 24;
                                         	}else if(EXTRA_MESSAGE.equals("Gangplank")){
                                         		i = 25;
                                         	}else if(EXTRA_MESSAGE.equals("Garen")){
                                         		i = 26;
                                         	}else if(EXTRA_MESSAGE.equals("Gragas")){
                                         		i = 27;
                                         	}else if(EXTRA_MESSAGE.equals("Graves")){
                                         		i = 28;
                                         	}else if(EXTRA_MESSAGE.equals("Hecarim")){
                                         		i = 29;
                                         	}else if(EXTRA_MESSAGE.equals("Heimerdinger")){
                                         		i = 30;
                                         	}else if(EXTRA_MESSAGE.equals("Irelia")){
                                         		i = 31;
                                         	}else if(EXTRA_MESSAGE.equals("Janna")){
                                         		i = 32;
                                         	}else if(EXTRA_MESSAGE.equals("Jarvan IV")){
                                         		i = 33;
                                         	}else if(EXTRA_MESSAGE.equals("Jax")){
                                         		i = 34;
                                         	}else if(EXTRA_MESSAGE.equals("Jayce")){
                                         		i = 35;
                                         	}else if(EXTRA_MESSAGE.equals("Jinx")){
                                         		i = 36;
                                         	}else if(EXTRA_MESSAGE.equals("Karma")){
                                         		i = 37;
                                         	}else if(EXTRA_MESSAGE.equals("Karthus")){
                                         		i = 38;
                                         	}else if(EXTRA_MESSAGE.equals("Kassadin")){
                                         		i = 39;
                                         	}else if(EXTRA_MESSAGE.equals("Katarina")){
                                         		i = 40;
                                         	}else if(EXTRA_MESSAGE.equals("Kayle")){
                                         		i = 41;
                                         	}else if(EXTRA_MESSAGE.equals("Kennen")){
                                         		i = 42;
                                         	}else if(EXTRA_MESSAGE.equals("Kha Zix")){
                                         		i = 43;
                                         	}else if(EXTRA_MESSAGE.equals("Kog Maw")){
                                         		i = 44;
                                         	}else if(EXTRA_MESSAGE.equals("LeBlanc")){
                                         		i = 45;
                                         	}else if(EXTRA_MESSAGE.equals("Lee Sin")){
                                         		i = 46;
                                         	}else if(EXTRA_MESSAGE.equals("Leona")){
                                         		i = 47;
                                         	}else if(EXTRA_MESSAGE.equals("Lissandra")){
                                         		i = 48;
                                         	}else if(EXTRA_MESSAGE.equals("Lucian")){
                                         		i = 49;
                                         	}else if(EXTRA_MESSAGE.equals("Lulu")){
                                         		i = 50;
                                         	}else if(EXTRA_MESSAGE.equals("Lux")){
                                         		i = 51;
                                         	}else if(EXTRA_MESSAGE.equals("Malphite")){
                                         		i = 52;
                                         	}else if(EXTRA_MESSAGE.equals("Malzahar")){
                                         		i = 53;
                                         	}else if(EXTRA_MESSAGE.equals("Maokai")){
                                         		i = 54;
                                         	}else if(EXTRA_MESSAGE.equals("Master Yi")){
                                         		i = 55;
                                         	}else if(EXTRA_MESSAGE.equals("Miss Fortune")){
                                         		i = 56;
                                         	}else if(EXTRA_MESSAGE.equals("Mordekaiser")){
                                         		i = 57;
                                         	}else if(EXTRA_MESSAGE.equals("Morgana")){
                                         		i = 58;
                                         	}else if(EXTRA_MESSAGE.equals("Nami")){
                                         		i = 59;
                                         	}else if(EXTRA_MESSAGE.equals("Nasus")){
                                         		i = 60;
                                         	}else if(EXTRA_MESSAGE.equals("Nautilus")){
                                         		i = 61;
                                         	}else if(EXTRA_MESSAGE.equals("Nidalee")){
                                         		i = 62;
                                         	}else if(EXTRA_MESSAGE.equals("Nocturne")){
                                         		i = 63;
                                         	}else if(EXTRA_MESSAGE.equals("Nunu")){
                                         		i = 64;
                                         	}else if(EXTRA_MESSAGE.equals("Olaf")){
                                         		i = 65;
                                         	}else if(EXTRA_MESSAGE.equals("Orianna")){
                                         		i = 66;
                                         	}else if(EXTRA_MESSAGE.equals("Pantheon")){
                                         		i = 67;
                                         	}else if(EXTRA_MESSAGE.equals("Poppy")){
                                         		i = 68;
                                         	}else if(EXTRA_MESSAGE.equals("Quinn")){
                                         		i = 69;
                                         	}else if(EXTRA_MESSAGE.equals("Rammus")){
                                         		i = 70;
                                         	}else if(EXTRA_MESSAGE.equals("Renekton")){
                                         		i = 71;
                                         	}else if(EXTRA_MESSAGE.equals("Rengar")){
                                         		i = 72;
                                         	}else if(EXTRA_MESSAGE.equals("Riven")){
                                         		i = 73;
                                         	}else if(EXTRA_MESSAGE.equals("Rumble")){
                                         		i = 74;
                                         	}else if(EXTRA_MESSAGE.equals("Ryze")){
                                         		i = 75;
                                         	}else if(EXTRA_MESSAGE.equals("Sejuani")){
                                         		i = 76;
                                         	}else if(EXTRA_MESSAGE.equals("Shaco")){
                                         		i = 77;
                                         	}else if(EXTRA_MESSAGE.equals("Shen")){
                                         		i = 78;
                                         	}else if(EXTRA_MESSAGE.equals("Shyvana")){
                                         		i = 79;
                                         	}else if(EXTRA_MESSAGE.equals("Singed")){
                                         		i = 80;
                                         	}else if(EXTRA_MESSAGE.equals("Sion")){
                                         		i = 81;
                                         	}else if(EXTRA_MESSAGE.equals("Sivir")){
                                         		i = 82;
                                         	}else if(EXTRA_MESSAGE.equals("Skarner")){
                                         		i = 83;
                                         	}else if(EXTRA_MESSAGE.equals("Sona")){
                                         		i = 84;
                                         	}else if(EXTRA_MESSAGE.equals("Soraka")){
                                         		i = 85;
                                         	}else if(EXTRA_MESSAGE.equals("Swain")){
                                         		i = 86;
                                         	}else if(EXTRA_MESSAGE.equals("Syndra")){
                                         		i = 87;
                                         	}else if(EXTRA_MESSAGE.equals("Talon")){
                                         		i = 88;
                                         	}else if(EXTRA_MESSAGE.equals("Taric")){
                                         		i = 89;
                                         	}else if(EXTRA_MESSAGE.equals("Teemo")){
                                         		i = 90;
                                         	}else if(EXTRA_MESSAGE.equals("Thresh")){
                                         		i = 91;
                                         	}else if(EXTRA_MESSAGE.equals("Tristana")){
                                         		i = 92;
                                         	}else if(EXTRA_MESSAGE.equals("Trundle")){
                                         		i = 93;
                                         	}else if(EXTRA_MESSAGE.equals("Tryndamere")){
                                         		i = 94;
                                         	}else if(EXTRA_MESSAGE.equals("Twisted Fate")){
                                         		i = 95;
                                         	}else if(EXTRA_MESSAGE.equals("Twitch")){
                                         		i = 96;
                                         	}else if(EXTRA_MESSAGE.equals("Udyr")){
                                         		i = 97;
                                         	}else if(EXTRA_MESSAGE.equals("Urgot")){
                                         		i = 98;
                                         	}else if(EXTRA_MESSAGE.equals("Varus")){
                                         		i = 99;
                                         	}else if(EXTRA_MESSAGE.equals("Vayne")){
                                         		i = 100;
                                         	}else if(EXTRA_MESSAGE.equals("Veigar")){
                                         		i = 101;
                                         	}else if(EXTRA_MESSAGE.equals("Vel Koz")){
                                         		i = 102;
                                         	}else if(EXTRA_MESSAGE.equals("Vi")){
                                         		i = 103;
                                         	}else if(EXTRA_MESSAGE.equals("Viktor")){
                                         		i = 104;
                                         	}else if(EXTRA_MESSAGE.equals("Vladimir")){
                                         		i = 105;
                                         	}else if(EXTRA_MESSAGE.equals("Volibear")){
                                         		i = 106;
                                         	}else if(EXTRA_MESSAGE.equals("Warwick")){
                                         		i = 107;
                                         	}else if(EXTRA_MESSAGE.equals("Wukong")){
                                         		i = 108;
                                         	}else if(EXTRA_MESSAGE.equals("Xerath")){
                                         		i = 109;
                                         	}else if(EXTRA_MESSAGE.equals("Xin Zhao")){
                                         		i = 110;
                                         	}else if(EXTRA_MESSAGE.equals("Yasuo")){
                                         		i = 111;
                                         	}else if(EXTRA_MESSAGE.equals("Yorick")){
                                         		i = 112;
                                         	}else if(EXTRA_MESSAGE.equals("Zac")){
                                         		i = 113;
                                         	}else if(EXTRA_MESSAGE.equals("Zed")){
                                         		i = 114;
                                         	}else if(EXTRA_MESSAGE.equals("Ziggs")){
                                         		i = 115;
                                         	}else if(EXTRA_MESSAGE.equals("Zilean")){
                                         		i = 116;
                                         	}else{
                                         		i=117;
                                         	}
                             			     				
                                  			switch(i){
                                  			case 0: icon.setImageResource(R.drawable.aatrox);
                                  					break;
                                  			case 1: icon.setImageResource(R.drawable.ahri);
                             						break;
                                  			case 2: icon.setImageResource(R.drawable.akali);
                             						break;
                                  			case 3: icon.setImageResource(R.drawable.alistar);
                             						break;
                                  			case 4: icon.setImageResource(R.drawable.amumu);
                                  					break;
                                  			case 5: icon.setImageResource(R.drawable.anivia);
                                  					break;
                                  			case 6: icon.setImageResource(R.drawable.annie);
                                  					break;
                                  			case 7: icon.setImageResource(R.drawable.ashe);
                                  					break;
                                  			case 8: icon.setImageResource(R.drawable.blitzcrank);
                                  					break;
                                  			case 9: icon.setImageResource(R.drawable.brand);
                                  					break;
                                  			case 10: icon.setImageResource(R.drawable.caitlyn);
                                  					break;
                                  			case 11: icon.setImageResource(R.drawable.cassiopeia);
                                  					break;
                                  			case 12: icon.setImageResource(R.drawable.chogath);
                                  					break;
                                  			case 13: icon.setImageResource(R.drawable.corki);
                             						break;
                                  			case 14: icon.setImageResource(R.drawable.darius);
                                  					break;						
                                  			case 15: icon.setImageResource(R.drawable.diana);
                             						break;						
                                  			case 16: icon.setImageResource(R.drawable.drmundo);
                             						break;						
                                  			case 17: icon.setImageResource(R.drawable.draven);
                             						break;						
                                  			case 18: icon.setImageResource(R.drawable.elise);
                             						break;						
                                  			case 19: icon.setImageResource(R.drawable.evelynn);
                             						break;						
                                  			case 20: icon.setImageResource(R.drawable.ezreal);
                             						break;						
                                  			case 21: icon.setImageResource(R.drawable.fiddlesticks);
                             						break;						
                                  			case 22: icon.setImageResource(R.drawable.fiora);
                             						break;						
                                  			case 23: icon.setImageResource(R.drawable.fizz);
                             						break;						
                                  			case 24: icon.setImageResource(R.drawable.galio);
                             						break;						
                                  			case 25: icon.setImageResource(R.drawable.gangplank);
                             						break;						
                                  			case 26: icon.setImageResource(R.drawable.garen);
                             						break;						
                                  			case 27: icon.setImageResource(R.drawable.gragas);
                             						break;						
                                  			case 28: icon.setImageResource(R.drawable.graves);
                             						break;						
                                  			case 29: icon.setImageResource(R.drawable.hecarim);
                             						break;						
                                  			case 30: icon.setImageResource(R.drawable.heimerdinger);
                             						break;						
                                  			case 31: icon.setImageResource(R.drawable.irelia);
                             						break;						
                                  			case 32: icon.setImageResource(R.drawable.janna);
                             						break;						
                                  			case 33: icon.setImageResource(R.drawable.jarvaniv);
                             						break;						
                                  			case 34: icon.setImageResource(R.drawable.jax);
                             						break;						
                                  			case 35: icon.setImageResource(R.drawable.jayce);
                             						break;						
                                  			case 36: icon.setImageResource(R.drawable.jinx);
                             						break;						
                                  			case 37: icon.setImageResource(R.drawable.karma);
                             						break;
                                  			case 38: icon.setImageResource(R.drawable.karthus);
                             						break;
                                  			case 39: icon.setImageResource(R.drawable.kassadin);
                             						break;     	
                                  			case 40: icon.setImageResource(R.drawable.katarina);
                             						break;     	
                                  			case 41: icon.setImageResource(R.drawable.kayle);
                             						break;     	
                                  			case 42: icon.setImageResource(R.drawable.kennen);
                             						break;     	
                                  			case 43: icon.setImageResource(R.drawable.khazix);
                             						break;     	
                                  			case 44: icon.setImageResource(R.drawable.kogmaw);
                             						break;     	
                                  			case 45: icon.setImageResource(R.drawable.leblanc);
                             						break;     	
                                  			case 46: icon.setImageResource(R.drawable.leesin);
                             						break;     	
                                  			case 47: icon.setImageResource(R.drawable.leona);
                             						break;     	
                                  			case 48: icon.setImageResource(R.drawable.lissandra);
                             						break;     	
                                  			case 49: icon.setImageResource(R.drawable.lucian);
                             						break;     	
                                  			case 50: icon.setImageResource(R.drawable.lulu);
                             						break;     	
                                  			case 51: icon.setImageResource(R.drawable.lux);
                             						break;     	
                                  			case 52: icon.setImageResource(R.drawable.malphite);
                             						break;     	
                                  			case 53: icon.setImageResource(R.drawable.malzahar);
                             						break;     	
                                  			case 54: icon.setImageResource(R.drawable.maokai);
                             						break;     	
                                  			case 55: icon.setImageResource(R.drawable.masteryi);
                             						break;     	
                                  			case 56: icon.setImageResource(R.drawable.missfortune);
                             						break;     	
                                  			case 57: icon.setImageResource(R.drawable.mordekaiser);
                             						break;     	
                                  			case 58: icon.setImageResource(R.drawable.morgana);
                             						break;     	
                                  			case 59: icon.setImageResource(R.drawable.nami);
                             						break;     	
                                  			case 60: icon.setImageResource(R.drawable.nasus);
                             						break;     	
                                  			case 61: icon.setImageResource(R.drawable.nautilus);
                             						break;     	
                                  			case 62: icon.setImageResource(R.drawable.nidalee);
                             						break;     	
                                  			case 63: icon.setImageResource(R.drawable.nocturne);
                             						break;     	
                                  			case 64: icon.setImageResource(R.drawable.nunu);
                             						break;     	
                                  			case 65: icon.setImageResource(R.drawable.olaf);
                             						break;     	
                                  			case 66: icon.setImageResource(R.drawable.orianna);
                             						break;     	
                                  			case 67: icon.setImageResource(R.drawable.pantheon);
                             						break;     	
                                  			case 68: icon.setImageResource(R.drawable.poppy);
                             						break;     	
                                  			case 69: icon.setImageResource(R.drawable.quinn);
                             						break;     	
                                  			case 70: icon.setImageResource(R.drawable.rammus);
                             						break;     	
                                  			case 71: icon.setImageResource(R.drawable.renekton);
                             						break;     	
                                  			case 72: icon.setImageResource(R.drawable.rengar);
                             						break;     	
                                  			case 73: icon.setImageResource(R.drawable.riven);
                             						break;     	
                                  			case 74: icon.setImageResource(R.drawable.rumble);
                             						break;     	
                                  			case 75: icon.setImageResource(R.drawable.ryze);
                             						break;     	
                                  			case 76: icon.setImageResource(R.drawable.sejuani);
                             						break;     	
                                  			case 77: icon.setImageResource(R.drawable.shaco);
                             						break; 		             		     			
                                  			case 78: icon.setImageResource(R.drawable.shen);
                             						break;     			
                                  			case 79: icon.setImageResource(R.drawable.shyvana);
                             						break;     			
                                  			case 80: icon.setImageResource(R.drawable.singed);
                             						break;     			
                                  			case 81: icon.setImageResource(R.drawable.sion);
                             						break;     			
                                  			case 82: icon.setImageResource(R.drawable.sivir);
                             						break;     			
                                  			case 83: icon.setImageResource(R.drawable.skarner);
                             						break;     			
                                  			case 84: icon.setImageResource(R.drawable.sona);
                             						break;     			
                                  			case 85: icon.setImageResource(R.drawable.soraka);
                             						break;     			
                                  			case 86: icon.setImageResource(R.drawable.swain);
                             						break;     			
                                  			case 87: icon.setImageResource(R.drawable.syndra);
                             						break;     			
                                  			case 88: icon.setImageResource(R.drawable.talon);
                             						break;     			
                                  			case 89: icon.setImageResource(R.drawable.taric);
                             						break;     			
                                  			case 90: icon.setImageResource(R.drawable.teemo);
                             						break;     			
                                  			case 91: icon.setImageResource(R.drawable.thresh);
                             						break;     			
                                  			case 92: icon.setImageResource(R.drawable.tristana);
                             						break;     			
                                  			case 93: icon.setImageResource(R.drawable.trundle);
                             						break;     			
                                  			case 94: icon.setImageResource(R.drawable.tryndamere);
                             						break;     			
                                  			case 95: icon.setImageResource(R.drawable.twistedfate);
                             						break;     			
                                  			case 96: icon.setImageResource(R.drawable.twitch);
                             						break;     			
                                  			case 97: icon.setImageResource(R.drawable.udyr);
                             						break;     			
                                  			case 98: icon.setImageResource(R.drawable.urgot);
                             						break;     			
                                  			case 99: icon.setImageResource(R.drawable.varus);
                             						break;     			
                                  			case 100: icon.setImageResource(R.drawable.vayne);
                             						break;     			
                                  			case 101: icon.setImageResource(R.drawable.veigar);
                             						break;     			
                                  			case 102: icon.setImageResource(R.drawable.velkoz);
                             						break;     			
                                  			case 103: icon.setImageResource(R.drawable.vi);
                             						break;     			
                                  			case 104: icon.setImageResource(R.drawable.viktor);
                             						break;     			
                                  			case 105: icon.setImageResource(R.drawable.vladimir);
                             						break;     			
                                  			case 106: icon.setImageResource(R.drawable.volibear);
                             						break;     			
                                  			case 107: icon.setImageResource(R.drawable.warwick);
                             						break;     			
                                  			case 108: icon.setImageResource(R.drawable.wukong);
                             						break;     			
                                  			case 109: icon.setImageResource(R.drawable.xerath);
                             						break;     			
                                  			case 110: icon.setImageResource(R.drawable.xinzhao);
                             						break;     			
                                  			case 111: icon.setImageResource(R.drawable.yasuo);
                             						break;     			
                                  			case 112: icon.setImageResource(R.drawable.yorick);
                             						break;     			
                                  			case 113: icon.setImageResource(R.drawable.zac);
                             						break;     			
                                  			case 114: icon.setImageResource(R.drawable.zed);
                             						break;     			
                                  			case 115: icon.setImageResource(R.drawable.ziggs);
                             						break;     			
                                  			case 116: icon.setImageResource(R.drawable.zilean);
                             						break;     			
                                  			case 117: icon.setImageResource(R.drawable.zyra);
                             						break;     							
                             				default: break;
                                  			}*/
                                     }
                                      
                                     @Override
                                     public void onNothingSelected(AdapterView arg0) {
                                     //do something else
                                     }
                                     });
                             
                             
                             
                            
     
     
     
     
     
     }
     
     public void viewitems(View view) {
         Intent intent = new Intent(this, ViewItems.class);
         intent.putExtra(EXTRA_MESSAGE, EXTRA_MESSAGE);
         startActivity(intent);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
