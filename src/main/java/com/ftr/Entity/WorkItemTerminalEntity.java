package com.ftr.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WorkItemTerminal")
public class WorkItemTerminalEntity {
	
	@Id
	private String workItemId;
	private String terminalId;
	
	
	public String getWorkItemId() {
		return workItemId;
	}
	public void setWorkItemId(String workItemId) {
		this.workItemId = workItemId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	
	@Override
	public String toString() {
		return "WorkItemTerminalEntity [workItemId=" + workItemId + ", terminalId=" + terminalId + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(terminalId, workItemId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkItemTerminalEntity other = (WorkItemTerminalEntity) obj;
		return Objects.equals(terminalId, other.terminalId) && Objects.equals(workItemId, other.workItemId);
	}

}
