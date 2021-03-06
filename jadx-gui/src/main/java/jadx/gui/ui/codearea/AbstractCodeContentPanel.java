package jadx.gui.ui.codearea;

import jadx.gui.treemodel.JNode;
import jadx.gui.ui.ContentPanel;
import jadx.gui.ui.TabbedPane;

/**
 * The abstract base class for a content panel that show text based code or a.g. a resource
 */
public abstract class AbstractCodeContentPanel extends ContentPanel {

	protected AbstractCodeContentPanel(TabbedPane panel, JNode jnode) {
		super(panel, jnode);
	}

	public abstract AbstractCodeArea getCodeArea();

}
