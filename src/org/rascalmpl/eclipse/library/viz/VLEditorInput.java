package org.rascalmpl.eclipse.library.viz;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.rascalmpl.library.experiments.VL.FigurePApplet;

public class VLEditorInput implements IEditorInput {
	private final FigurePApplet vlpapplet;

	public VLEditorInput(FigurePApplet vlpapplet) {
		this.vlpapplet = vlpapplet;
	}
	
	public boolean exists() {
		return vlpapplet != null;
	}

	public FigurePApplet getVLPApplet() {
		return vlpapplet;
	}
	
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return "XXX"; //vlapplet.getTitle().getText();
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return "XXX"; //vlapplet.getTitle().getText();
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {
		return null;
	}

}
