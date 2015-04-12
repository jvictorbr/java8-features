package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

	private enum Status { 
		OPEN, CLOSED;
	}
	
	private static final class Task { 
		private final Status status;
		private final Integer points;
		
		public Task(Status status, Integer points) { 
			this.status = status;
			this.points = points;
		}

		public Status getStatus() {
			return status;
		}

		public Integer getPoints() {
			return points;
		}
		
		public String toString() { 
			return String.format("Task: { status: %s, points: %s }", status, points);
		}
		
	}
	
	public static void main(String[] args) { 
		
		List<Task> tasks = Arrays.asList(new Task(Status.OPEN, 5), new Task(Status.OPEN, 13), new Task(Status.CLOSED, 8));
		
		int totalPoints = tasks
				.stream()
				.mapToInt(Task::getPoints)
				.sum();
		
		System.out.println("Total Points: " + totalPoints);
		
		int totalOpenPoints = tasks
				.stream()
				.filter(task -> task.getStatus().equals(Status.OPEN))
				.mapToInt(Task::getPoints)
				.sum();
		
		System.out.println("Total Open Points: " + totalOpenPoints);
		
		Map<Status, List<Task>> grouped =	tasks
			.stream()
			.collect(Collectors.groupingBy(Task::getStatus));
		
		System.out.println("Grouped: " + grouped);
		
	}
	
	

}
