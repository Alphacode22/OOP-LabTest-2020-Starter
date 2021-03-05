package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void settings()
	{
		size(800, 600);
	}

	// void drawGrid()
    // {
    //     float border = 0.1f * width;
    //     textAlign(CENTER, CENTER);
    //     //float drawable = width - (border * 2.0f);
    //     // /float gap = drawable / 10.0f;
    //     for(int i = -5 ; i <=5 ; i ++)
    //     {
    //         float x = map(i, -5, 5, border, width - border);
    //         float y = map(i, -5, 5, border, height - border);
    //         //float x = border + ((i + 5) * gap);
    //         //float y = border + ((i + 5) * gap);
    //         stroke(0, 0, 255);
    //         line(x, border,x, height - border);
    //         line(border, y, width - border, y);
    //         fill(255);
    //         text(i, x, border / 2);
    //         text(i, border / 2, y);
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
		colorMode(RGB);
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
	}
}
