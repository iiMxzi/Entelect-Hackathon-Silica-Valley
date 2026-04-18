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
		
	}
	
	private static void readSets(String info) {
		
	}
	
	private static void readWeather(String info) {
		
	}
}
