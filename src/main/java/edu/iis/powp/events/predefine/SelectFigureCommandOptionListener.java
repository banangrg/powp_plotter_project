package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.IPlotterCommand;
import edu.iis.powp.factory.FigureFactory;

public class SelectFigureCommandOptionListener implements ActionListener
{
	private String figureScriptName;
	
	public SelectFigureCommandOptionListener(String figureName) {
		figureScriptName = figureName;
	}
	
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	switch (figureScriptName) {
    		case "Rectangle": {
    			List<IPlotterCommand> commands = FigureFactory.createRectangle(150, 100, 0, 0);
    			ComplexCommand complexCommand = new ComplexCommand();
    			complexCommand.setCommands(commands);
    			complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    			}
    			break;
    		case "Triangle": {
    			List<IPlotterCommand> commands = FigureFactory.createTriangle(-50, 0, 0, -50, 50, 0);
				ComplexCommand complexCommand = new ComplexCommand();
				complexCommand.setCommands(commands);
				complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    			}
				break;
			default:
				break;
    	
    	}
        
    }
}
