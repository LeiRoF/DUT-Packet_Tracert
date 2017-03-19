import machines.*;
import machines.Switch;
import machines.Router;

public class ConsoleMain {
	public static void main(String[] args){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.main("MENU PRINCIPAL >");
			System.out.println("");
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("add")){
//				addMachines();
			}else if(select.toLowerCase().equals("remove")){
				removeMachines();
			}else if(select.toLowerCase().equals("edit")){
//				editMachines();
			}else if(select.toLowerCase().equals("list")){
				listMachines();
			}
		}
	}
	
/*	public static void addMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > AJOUTER UNE MACHINE >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				Add.PC();
			}else if(select.toLowerCase().equals("router")){
				Add.Router();
			}else if(select.toLowerCase().equals("switch")){
				Add.Switch();
			}else if(select.toLowerCase().equals("ap")){
				Add.AP();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
		}
	}*/
	
	public static void removeMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > RETIRER UNE MACHINE >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				DelMachine.Ordi();
			}else if(select.toLowerCase().equals("router")){
				DelMachine.Router();
			}else if(select.toLowerCase().equals("switch")){
				DelMachine.Switch();
			}else if(select.toLowerCase().equals("ap")){
				DelMachine.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
	
	public static void listMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > LISTER LES MACHINES >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				System.out.println(PC.listToString());
			}else if(select.toLowerCase().equals("router")){
				System.out.println(Router.listToString());
			}else if(select.toLowerCase().equals("router")){
				System.out.println(Switch.listToString());
			}else if(select.toLowerCase().equals("ap")){
				System.out.println(AP.listToString());
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
	
/*	public static void editMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > EDITER UNE MACHINE >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				Edit.PC();
			}else if(select.toLowerCase().equals("router")){
				//Edit.Router();
			}else if(select.toLowerCase().equals("switch")){
				//Edit.Switch();
			}else if(select.toLowerCase().equals("ap")){
				//Edit.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}*/
}
