package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements IPlotterCommand {
	
	//poprzez mozliwosc uzycia zlozonego polecia, czyli serii polecen, wystepuje tu wzorzec kompozyt
	private List<IPlotterCommand> commands;
	
	@Override
	public void execute(IPlotter plotter) {
		for (IPlotterCommand command : commands) {
			command.execute(plotter);
		}
	}
	
	public List<IPlotterCommand> getCommands() {
		return commands;
	}

	public void setCommands(List<IPlotterCommand> commands) {
		this.commands = commands;
	}
	
}
