package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	ArrayList<Task> tasks = new ArrayList<Task>();
	public float leftMargin;
	public float margin;

	int whichTask = -1;
	boolean isEnd = false;
	
	public void settings()
	{
		size(800, 600);
	}

	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		//println("Mouse dragged");
		for(int i =0; i < tasks.size(); i ++){

			//Not sure
			// float y1 = (margin + margin + 40 * i) - 15;
			// float y2 = (margin + margin + 40 * i) + 20;

			//float x1 = map(tasks.get(i).getStart(), 1, )

		}
	}

	
	// void drawGrid()
    // {
    //     float border = 0.1f * width;
    //     textAlign(CENTER, CENTER);
    //     for(int i = -5 ; i <=5 ; i ++)
    //     {
    //         float x = map(i, -5, 5, border, width - border);
    //         float y = map(i, -5, 5, border, height - border);
    //     }
    // }

	public void loadTasks()
	{
		Table table = loadTable("tasks.csv", "header");
        for(TableRow row:table.rows())
        {
            Task t = new Task(row);
            tasks.add(t);
        }
	}

	public void printTasks()
	{
		for(Task t: tasks)
        {
            println(t);
        }
	}

    public void displayTasks(){
        
        stroke(255);
        fill(255);
        textAlign(CENTER, CENTER);

		//Displays the grid
        for(int i = 1; i <= 30; i++){
            float x = map(i, 1, 30, leftMargin, width - margin);
            line(x, margin, x, height - margin );
            text(i, x, margin / 20);
        }

		//Display the tasks
		for(int i = 0; i < tasks.size(); i++){
			//Displaying the task name
			float y = map(i, 0, tasks.size(), margin + 50, height - margin - 50);
			Task t = tasks.get(i);

			//Displaying the start and end of the task
			float x1 = map(t.getStart(), 1, 30, leftMargin, width - margin);
			float x2 = map(t.getEnd(), 1, 30, leftMargin, width - margin);
			int c = (int) map(i, 0, tasks.size(), 0, 255);
			noStroke();
			fill(c, 255, 255);
			rect(x1, y - 20, x2 - x1, 40);
			fill(255);
			textAlign(LEFT, CENTER);
			text(t.getTask(), 20, y);

		}


    }// 30:16
	


	public void setup() 
	{
		colorMode(HSB);
		loadTasks();
		printTasks();
	    leftMargin = width * 0.2f;
		margin = width * 0.05f;
		
	}
	
	public void draw()
	{			
		background(0);
        displayTasks();
	}
}
