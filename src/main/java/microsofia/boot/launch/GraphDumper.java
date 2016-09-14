package microsofia.boot.launch;

import org.eclipse.aether.resolution.DependencyResult;

import microsofia.boot.aether.ConsoleDependencyVisitor;

public class GraphDumper extends AbstractLauncher{

	public GraphDumper(){
	}
	
	public void dump() throws Throwable{
		DependencyResult result=resolve();
		result.getRoot().accept(new ConsoleDependencyVisitor());
	}
}
