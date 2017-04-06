package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class LinePlotterSimulatorAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private DrawPanelController controller;
	private ILine line;
	
    public LinePlotterSimulatorAdapter(ILine line) {
    	controller = ApplicationWithDrawer.getDrawPanelController();
    	this.line = line;
	}
    
	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

		controller.drawLine(line);
		
        this.startX = x;
        this.startY = y;
    }

    @Override
    public String toString()
    {
        return " Custom Line Plotter Simulator Adapter";
    }
}
