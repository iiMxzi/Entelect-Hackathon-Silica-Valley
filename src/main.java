package Read;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class main {
	public static void main(String args[]) {
		
		try {
			readJson("1.txt");
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
	}
	
	private static void readJson(String path) throws IOException{
		Scanner in = new Scanner(new File(path));
		
		String info="";
		String line;

		
		while(in.hasNext()) {
			line = in.nextLine();
			if(line.contains("\"car\"")) {
				info="";
				line=in.nextLine();
				while(!line.contains("},")) {
					info=line+"\n";
					
					line=in.nextLine();
				}
				readCar(info);
				
				
			}else if(line.contains("\"track\"")) {
				info="";
				line=in.nextLine();
				while(!line.contains("},")) {
					info=line+"\n";
					
					line=in.nextLine();
				}
				readTrack(info);
				
			}else if(line.contains("\"race\"")) {
				info="";
				line=in.nextLine();
				while(!line.contains("},")) {
					info=line+"\n";
					
					line=in.nextLine();
				}
				readRace(info);
				
			}else if(line.contains("\"tyres\"")) {
				info="";
				line=in.nextLine();
				while(!line.contains("},")) {
					info=line+"\n";
					
					line=in.nextLine();
				}
				readTyres(info);
				
			}else if(line.contains("\"available_sets\"")) {
				info="";
				line=in.nextLine();
				while(!line.contains("},")) {
					info=line+"\n";
					
					line=in.nextLine();
				}
				readSets(info);
				
			}else if(line.contains("\"weather\"")) {
				info="";
				line=in.nextLine();
				while(!line.contains("},")) {
					info=line+"\n";
					
					line=in.nextLine();
				}
				readWeather(info);
			}
		}
	}
	
	private static void readCar(String info) {
		Scanner in = new Scanner(info);
		String line;
		double maxSpeed,brake,acc,limp,crawl,capacity,initial,consumption;
		
		line= in.nextLine()	;
		maxSpeed= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		acc= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		brake= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		limp= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		crawl= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		capacity= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		initial= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		consumption= Double.parseDouble(line.substring(line.lastIndexOf(": ")));
	}
	
	private static void readRace(String info) {
		Scanner in = new Scanner(info);
		String line,name;
		int weatherID,laps;
		double basetime,swaptime,refuel,cornerpen,exitspeed,softcap,timeref;
		
		line= in.nextLine();
		name= line.substring(line.lastIndexOf(": "), line.indexOf(','));
		line= in.nextLine()	;
		laps= Integer.parseInt(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		basetime= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		swaptime= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		refuel= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		cornerpen= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		exitspeed= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		softcap= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		weatherID= Integer.parseInt(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
		line= in.nextLine()	;
		timeref= Double.parseDouble(line.substring(line.lastIndexOf(": ")));
	}
	
	private static void readTrack(String info) {
		Scanner in = new Scanner(info);
		String line,name,type;
		ArrayList<Segment> track;
		String[] parts;
		int id,length,radius;
		
		line=in.nextLine();
		name=line.substring(line.lastIndexOf(": \""), line.indexOf("\","));
		
		line=in.nextLine();
		Segment seg;
		while(!line.contains("]")) {
			line= in.nextLine();
			parts= line.split(", \"");
			
			id=Integer.parseInt(parts[0].substring(parts[0].indexOf(": ")));
			
			if(parts[1].contains("straight")) {
				type = parts[1].substring(parts[1].lastIndexOf(": \""), parts[1].lastIndexOf("\""));
				length=Integer.parseInt(parts[2].substring(parts[2].indexOf(": "), parts[2].indexOf("},")));
				
			}else {
				type = parts[1].substring(parts[1].lastIndexOf(": \""), parts[1].lastIndexOf("\""));
				radius=Integer.parseInt(parts[2].substring(parts[2].indexOf(": ")));
				length=Integer.parseInt(parts[3].substring(parts[3].indexOf(": ")));
			}
			
			//TODO: construct segments and track
			
		}
		
	}
	
	private static void readTyres(String info) {
		Scanner in = new Scanner(info);
		String line,top;
		double life,dfm,cfm,lrfm,hrfm,dd,cd,lrd,hrd;
		
		Tyre t;
		line = in.nextLine();
		while(!line.contains("}")) {
			line = in.nextLine();
			top=line;
			
			life= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			dfm= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			cfm= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			lrfm= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			hrfm= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			dd= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			cd= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			lrd= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine()	;
			hrd= Double.parseDouble(line.substring(line.lastIndexOf(": ")));
	
			if(top.contains("\"Soft\"")) {
				t = new Tyre("Soft",life);
			}else if(top.contains("\"Medium\"")){
				t = new Tyre("Medium",life);
			}else if(top.contains("\"Hard\"")){
				t = new Tyre("Hard",life);
			}else if(top.contains("\"Intermediate\"")){
				t = new Tyre("Intermediate",life);
			}else if(top.contains("\"Wet\"")){
				t = new Tyre("Wet",life);
			}
			
			
			line= in.nextLine();
			}
				
			
	}
	
	private static void readSets(String info) {
		
	}
	
	private static void readWeather(String info) {
		Scanner in = new Scanner(info);
		String line,condition;
		ArrayList<WeatherCondition> conditions = new ArrayList<>();
		double duration,acc,dec;
		int id;
		
		line= in.nextLine();
		line= in.nextLine();
		while(!line.contains("]")) {
			line= in.nextLine();
			id= Integer.parseInt(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine();
			condition= line.substring(line.lastIndexOf(": \""), line.indexOf("\","));
			line= in.nextLine();
			duration= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine();
			acc= Double.parseDouble(line.substring(line.lastIndexOf(": "), line.indexOf(',')));
			line= in.nextLine();
			dec= Double.parseDouble(line.substring(line.lastIndexOf(": ")));
			
			//TODO: add weather
			conditions.add(new WeatherCondition(id,condition, duration, acc, dec));
			line= in.nextLine();
			line= in.nextLine();
		}
	}
}
