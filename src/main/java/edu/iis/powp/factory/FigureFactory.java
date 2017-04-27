package edu.iis.powp.factory;

import java.util.ArrayList;
import java.util.List;

import edu.iis.powp.command.IPlotterCommand;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;

public class FigureFactory {
	
	public static List<IPlotterCommand> createRectangle(int sideX, int sideY, int locX, int locY) {
		List<IPlotterCommand> commands = new ArrayList();
		commands.add(new CommandSetPosition(locX, locY));
		commands.add(new CommandDrawLineToPosition(locX + sideX, locY));
		commands.add(new CommandDrawLineToPosition(locX + sideX, locY + sideY));
		commands.add(new CommandDrawLineToPosition(locX, locY + sideY));
		commands.add(new CommandDrawLineToPosition(locX, locY));
		return commands;
	}
	
	public static List<IPlotterCommand> createTriangle(int aX, int aY, int bX, int bY, int cX,int cY) {
		List<IPlotterCommand> commands = new ArrayList();
		commands.add(new CommandSetPosition(aX, aY));
		commands.add(new CommandDrawLineToPosition(bX, bY));
		commands.add(new CommandDrawLineToPosition(cX, cY));
		commands.add(new CommandDrawLineToPosition(aX, aY));
		return commands;
	}
}
