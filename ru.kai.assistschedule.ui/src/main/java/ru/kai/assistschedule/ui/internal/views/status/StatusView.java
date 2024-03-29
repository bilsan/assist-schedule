package ru.kai.assistschedule.ui.internal.views.status;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class StatusView extends ViewPart {

    public static final String ID = "ru.kai.assistantschedule.status.view";

    public static StyledText t2;

    // private TableViewer viewer;

    /**
     * The content provider class is responsible for providing objects to the
     * view. It can wrap existing objects in adapters or simply return objects
     * as-is. These objects may be sensitive to the current input of the view,
     * or ignore it and always show the same content (like Task List, for
     * example).
     */
    // class ViewContentProvider implements IStructuredContentProvider {
    //
    // public void inputChanged(Viewer v, Object oldInput, Object newInput) {}
    //
    // public void dispose() {}
    //
    // public Object[] getElements(Object parent) {
    // if (parent instanceof Object[]) {
    // return (Object[]) parent;
    // }
    // return new Object[0];
    // }
    // }

    // class ViewLabelProvider extends LabelProvider implements
    // ITableLabelProvider {
    //
    // public String getColumnText(Object obj, int index) {
    // return getText(obj);
    // }
    //
    // public Image getColumnImage(Object obj, int index) {
    // return getImage(obj);
    // }
    //
    // public Image getImage(Object obj) {
    // return PlatformUI.getWorkbench().getSharedImages()
    // .getImage(ISharedImages.IMG_OBJ_ELEMENT);
    // }
    // }

    /**
     * This is a callback that will allow us to create the viewer and initialize
     * it.
     */
    public void createPartControl(Composite parent) {
    	t2 = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
//        t2 = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
        t2.setEditable(false);
        t2.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        t2.setLayoutData(new GridData(GridData.FILL_BOTH));

        // viewer =
        // new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        // viewer.setContentProvider(new ViewContentProvider());
        // viewer.setLabelProvider(new ViewLabelProvider());
        // // Provide the input to the ContentProvider
        // viewer.setInput(new String[] {"One", "Two", "Three"});
    }
    
    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {

        // viewer.getControl().setFocus();
    }
    
    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        if (null != t2) {
            t2.dispose();
        }
        super.dispose();
    }

}