package ru.kai.assistschedule.ui.model.schedule.filter;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.TreeItem;

import ru.kai.assistschedule.core.cache.ScheduleEntry;
import ru.kai.assistschedule.core.cache.Time;

public class ProfessorFilter extends ViewerFilter {
	
	private Set<String> set;
	
	public ProfessorFilter(Set<String> selected) {
		if(null == selected) {
			set = new HashSet<String>();
		}
		set = selected;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		ScheduleEntry classRow = (ScheduleEntry) element;
		
		if(null != classRow.prepodavatel && classRow.prepodavatel.contains(",")) {
			for(String p: set) {
				if(classRow.prepodavatel.contains(p)) {
					return true;
				}
			}
		} else if(set.contains(classRow.prepodavatel)) {
			return true;
		}
		return false;
	}

}
