package ru.kai.assistschedule.core.calendar;

import ru.kai.assistschedule.core.cache.LessonType;
import ru.kai.assistschedule.core.cache.Time;

public class Class {
	
	public int id;
	
	public Class(Time t, String lectureRoom, String disc, LessonType lessonType, String group, String prep, String kafedra){
		this.time = t;
		this.lectureRoom = lectureRoom;
		this.discipline = disc;
		this.lessonType = lessonType;
		this.group = group;
		this.professor = prep;
		this.department = kafedra;
	}
	
	public Time time;
	public LessonType lessonType;
	public String discipline, group, professor, lectureRoom, department;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureRoom == null) ? 0 : lectureRoom.hashCode());
		result = prime * result + ((discipline == null) ? 0 : discipline.hashCode());
		result = prime * result + ((lessonType == null) ? 0 : lessonType.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Class)) {
			return false;
		}
		Class other = (Class) obj;
		if (lectureRoom == null) {
			if (other.lectureRoom != null) {
				return false;
			}
		} else if (!lectureRoom.equals(other.lectureRoom)) {
			return false;
		}
		if (discipline == null) {
			if (other.discipline != null) {
				return false;
			}
		} else if (!discipline.equals(other.discipline)) {
			return false;
		}
		if (lessonType != other.lessonType) {
			return false;
		}
		if (group == null) {
			if (other.group != null) {
				return false;
			}
		} else if (!group.equals(other.group)) {
			return false;
		}
		if (department == null) {
			if (other.department != null) {
				return false;
			}
		} else if (!department.equals(other.department)) {
			return false;
		}
		if (professor == null) {
			if (other.professor != null) {
				return false;
			}
		} else if (!professor.equals(other.professor)) {
			return false;
		}
		if (time != other.time) {
			return false;
		}
		return true;
	}

	public boolean maybeStreamClass(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Class)) {
			return false;
		}
		Class other = (Class) obj;
		if (discipline == null) {
			if (other.discipline != null) {
				return false;
			}
		} else if (!discipline.equals(other.discipline)) {
			return false;
		}
		if (lessonType != other.lessonType) {
			return false;
		}
//		if (kafedra == null) {
//			if (other.kafedra != null) {
//				return false;
//			}
//		} else if (!kafedra.equals(other.kafedra)) {
//			return false;
//		}
		if (professor == null) {
			if (other.professor != null) {
				return false;
			}
		} else if (!professor.equals(other.professor) && !(professor.isEmpty() || other.professor.isEmpty()) ) {
			return false;
		}
		if (time != other.time) {
			return false;
		}
		return true;	}
	
	public boolean isStreamClass(Object obj){
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Class)) {
			return false;
		}
		Class other = (Class) obj;
		if (lectureRoom == null) {
			if (other.lectureRoom != null) {
				return false;
			}
		} else if (!lectureRoom.equals(other.lectureRoom)) {
			return false;
		}
		if (discipline == null) {
			if (other.discipline != null) {
				return false;
			}
		} else if (!discipline.equals(other.discipline)) {
			return false;
		}
		if (lessonType != other.lessonType) {
			return false;
		}
		if (department == null) {
			if (other.department != null) {
				return false;
			}
		} else if (!department.equals(other.department)) {
			return false;
		}
		if (professor == null) {
			if (other.professor != null) {
				return false;
			}
		} else if (!professor.equals(other.professor)) {
			return false;
		}
		if (time != other.time) {
			return false;
		}
		return true;
	}
	
	public boolean isTimeAndClassroomEquals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Class)) {
			return false;
		}
		Class other = (Class) obj;
		if (lectureRoom == null) {
			if (other.lectureRoom != null) {
				return false;
			}
		} else if (!lectureRoom.equals(other.lectureRoom)) {
			return false;
		}
		if (time != other.time) {
			return false;
		}
		return true;
	}

	public Class getEntryByTimeAndClassroom(Class newClass){
		if (isTimeAndClassroomEquals(newClass)){
			return this;
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", time=" + time + ", lessonType="
				+ lessonType + ", discipline=" + discipline + ", group="
				+ group + ", professor=" + professor + ", lectureRoom="
				+ lectureRoom + ", department=" + department + "]";
	}
	
}