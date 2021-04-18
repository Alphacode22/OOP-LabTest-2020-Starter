package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	ArrayList<Task> tasks = new ArrayList<Task>();
	public float leftMargin;
	public float rightMargin;
	
	public void settings()
	{
		size(800, 600);
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
            float x = map(i, 1, 30, leftMargin, width - rightMargin);
            line(x, rightMargin, x, height - rightMargin );
            text(i, x, rightMargin / 20);
        }

		//Display the tasks


    }// 30:16
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	public void setup() 
	{
		colorMode(HSB);
		loadTasks();
		printTasks();
	    leftMargin = width * 0.7f;
		rightMargin = width * 0.5f;
		
	}
	
	public void draw()
	{			
		background(0);
        displayTasks();
	}
}
