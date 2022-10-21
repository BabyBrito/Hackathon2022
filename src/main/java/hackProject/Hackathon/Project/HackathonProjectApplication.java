package hackProject.Hackathon.Project;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class HackathonProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HackathonProjectApplication.class, args);
		Scanner userInput = new Scanner(System.in);

		ArrayList<Note> noteArrayList = new ArrayList<Note>();
		ArrayList<Activity> activityArrayList = new ArrayList<Activity>();
		ArrayList<Record> recordArrayList = new ArrayList<Record>();

		int ECN;
		int desiredData;
		int filterData;
		String fetchData = "";
		String startDay, startMonth, startYear;
		String endDay, endMonth, endYear;

		System.out.print("Enter an ECN: ");
		ECN = userInput.nextInt();


		//consume excess buffer so nextLine isn't skipped
		//userInput.nextLine();

		System.out.println("Would you like to see all results for this client?");
		System.out.println("\t1 - Yes");
		System.out.println("\t2 - No");
		filterData = userInput.nextInt();

		if (filterData == 1) {
			System.out.println("What type of data would you like to fetch?");
			System.out.println("\t1 - Notes");
			System.out.println("\t2 - Activities");
			System.out.println("\t3 - Records");
			desiredData = userInput.nextInt();

			//create an ArrayList based on the object being fetched
			switch (desiredData) {
				case 1:
					fetchData = "Notes";
					break;
				case 2:
					fetchData = "Activities";
					break;
				case 3:
					fetchData = "Records";
					break;
				default:
					System.out.println("Input error");
			}
		}

		//consume excess nextLine()
		userInput.nextLine();

		System.out.print("Enter the starting date(dd/mm/yyyy): ");
		String startDate = userInput.nextLine();

		System.out.print("Enter the ending date(dd/mm/yyyy): ");
		String endDate = userInput.nextLine();

		//hard coded objects for testing
		noteArrayList.add(new Note(
				"12345",
				"Mr. Moneybags",
				"10/20/2022",
				"Lottery winnings",
				"Sir Brito has won big and wishes to invest."
		));

		noteArrayList.add(new Note(
				"54321",
				"Ms. Moneysacks",
				"09/19/2021",
				"Inflation Plan",
				"Sir Brito has lost big and needs to create a plan to cope with inflation."
		));

		activityArrayList.add(new Activity(
				"12345",
				"Investor Lady",
				"04/24/1997",
				true,
				"Baseball game"
		));

		recordArrayList.add(new Record(
				"61414",
				"12/25/2020",
				false,
				true,
				"Defcon 1"
		));

		System.out.println("\nFetching " + fetchData + " for customer: " + ECN);
		System.out.println();

		if (filterData == 1) {
			switch (fetchData) {
				case "Notes":
					for (int i = 0; i < noteArrayList.size(); i++) {
						System.out.println("\tNote ID: " + noteArrayList.get(i).getNoteID());
						System.out.println("\tCreated by: " + noteArrayList.get(i).getCreatedBy());
						System.out.println("\tDate created: " + noteArrayList.get(i).getDateCreated());
						System.out.println("\tNote header: " + noteArrayList.get(i).getNoteHeader());
						System.out.println("\tNote body: " + noteArrayList.get(i).getNoteBody());
						System.out.println();
					}
					break;
				case "Activities":
					for (int i = 0; i < activityArrayList.size(); i++) {
						System.out.println("\tActivity ID: " + activityArrayList.get(i).getActivityID());
						System.out.println("\tCreated by: " + activityArrayList.get(i).getCreatedBy());
						System.out.println("\tDate created: " + activityArrayList.get(i).getDateCreated());
						System.out.println("\tIn-person: " + activityArrayList.get(i).isInPerson());
						System.out.println("\tInteraction type: " + activityArrayList.get(i).getInteractionType());
						System.out.println();
					}
					break;
				case "Records":
					for (int i = 0; i < recordArrayList.size(); i++) {
						System.out.println("\tRecord ID: " + recordArrayList.get(i).getRecordID());
						System.out.println("\tDate created: " + recordArrayList.get(i).getDateCreated());
						System.out.println("\tMoney involved: " + recordArrayList.get(i).isMonetary());
						System.out.println("\tAuthenticated: " + recordArrayList.get(i).isAuthenticated());
						System.out.println("\tUrgency: " + recordArrayList.get(i).getUrgency());
						System.out.println();
					}
					break;
			}
		}
		if (filterData == 2) {
			if (noteArrayList.size() > 0) {
				for (int i = 0; i < noteArrayList.size(); i++) {
					System.out.println("\tNote ID: " + noteArrayList.get(i).getNoteID());
					System.out.println("\tCreated by: " + noteArrayList.get(i).getCreatedBy());
					System.out.println("\tDate created: " + noteArrayList.get(i).getDateCreated());
					System.out.println("\tNote header: " + noteArrayList.get(i).getNoteHeader());
					System.out.println("\tNote body: " + noteArrayList.get(i).getNoteBody());
					System.out.println();
				}
			}
			if (activityArrayList.size() > 0) {
				for (int i = 0; i < activityArrayList.size(); i++) {
					System.out.println("\tActivity ID: " + activityArrayList.get(i).getActivityID());
					System.out.println("\tCreated by: " + activityArrayList.get(i).getCreatedBy());
					System.out.println("\tDate created: " + activityArrayList.get(i).getDateCreated());
					System.out.println("\tIn-person: " + activityArrayList.get(i).isInPerson());
					System.out.println("\tInteraction type: " + activityArrayList.get(i).getInteractionType());
					System.out.println();
				}
			}
			if (recordArrayList.size() > 0) {
				for (int i = 0; i < recordArrayList.size(); i++) {
					System.out.println("\tRecord ID: " + recordArrayList.get(i).getRecordID());
					System.out.println("\tDate created: " + recordArrayList.get(i).getDateCreated());
					System.out.println("\tMoney involved: " + recordArrayList.get(i).isMonetary());
					System.out.println("\tAuthenticated: " + recordArrayList.get(i).isAuthenticated());
					System.out.println("\tUrgency: " + recordArrayList.get(i).getUrgency());
					System.out.println();
				}
			}
		}
	}
}
