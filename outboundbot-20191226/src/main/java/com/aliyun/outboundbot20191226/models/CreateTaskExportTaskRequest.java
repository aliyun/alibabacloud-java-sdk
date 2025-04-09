// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateTaskExportTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1646496000000</p>
     */
    @NameInMap("ActualTimeGte")
    public Long actualTimeGte;

    /**
     * <strong>example:</strong>
     * <p>1646582400000</p>
     */
    @NameInMap("ActualTimeLte")
    public Long actualTimeLte;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallDurationGte")
    public Long callDurationGte;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CallDurationLte")
    public Long callDurationLte;

    /**
     * <strong>example:</strong>
     * <p>11111111111</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAnswered")
    public Boolean hasAnswered;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasHangUpByRejection")
    public Boolean hasHangUpByRejection;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasReachedEndOfFlow")
    public Boolean hasReachedEndOfFlow;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1dcb09c5-d5db-4397-bf65-db854463beea</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cb731aee-0a5b-4c2b-924c-d9e82eb1d8d7</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobGroupNameQuery")
    public String jobGroupNameQuery;

    /**
     * <strong>example:</strong>
     * <p>82097dd5-54df-475f-beba-eec8f4b7a3e1</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusStringList")
    public String jobStatusStringList;

    /**
     * <strong>example:</strong>
     * <p>64ebe700-91b4-49cb-b457-0b7c0b598a86</p>
     */
    @NameInMap("OtherId")
    public String otherId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordingDurationGte")
    public Long recordingDurationGte;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RecordingDurationLte")
    public Long recordingDurationLte;

    @NameInMap("ScriptNameQuery")
    public String scriptNameQuery;

    /**
     * <strong>example:</strong>
     * <p>actualTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <strong>example:</strong>
     * <p>1646496000000</p>
     */
    @NameInMap("TaskCreateTimeGte")
    public Long taskCreateTimeGte;

    /**
     * <strong>example:</strong>
     * <p>1646582400000</p>
     */
    @NameInMap("TaskCreateTimeLte")
    public Long taskCreateTimeLte;

    /**
     * <strong>example:</strong>
     * <p>64ebe700-91b4-49cb-b457-0b7c0b598a86</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded,Failed</p>
     */
    @NameInMap("TaskStatusStringList")
    public String taskStatusStringList;

    /**
     * <strong>example:</strong>
     * <p>82097dd5-54df-475f-beba-eec8f4b7a3e1</p>
     */
    @NameInMap("UserIdMatch")
    public String userIdMatch;

    public static CreateTaskExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskExportTaskRequest self = new CreateTaskExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskExportTaskRequest setActualTimeGte(Long actualTimeGte) {
        this.actualTimeGte = actualTimeGte;
        return this;
    }
    public Long getActualTimeGte() {
        return this.actualTimeGte;
    }

    public CreateTaskExportTaskRequest setActualTimeLte(Long actualTimeLte) {
        this.actualTimeLte = actualTimeLte;
        return this;
    }
    public Long getActualTimeLte() {
        return this.actualTimeLte;
    }

    public CreateTaskExportTaskRequest setCallDurationGte(Long callDurationGte) {
        this.callDurationGte = callDurationGte;
        return this;
    }
    public Long getCallDurationGte() {
        return this.callDurationGte;
    }

    public CreateTaskExportTaskRequest setCallDurationLte(Long callDurationLte) {
        this.callDurationLte = callDurationLte;
        return this;
    }
    public Long getCallDurationLte() {
        return this.callDurationLte;
    }

    public CreateTaskExportTaskRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public CreateTaskExportTaskRequest setHasAnswered(Boolean hasAnswered) {
        this.hasAnswered = hasAnswered;
        return this;
    }
    public Boolean getHasAnswered() {
        return this.hasAnswered;
    }

    public CreateTaskExportTaskRequest setHasHangUpByRejection(Boolean hasHangUpByRejection) {
        this.hasHangUpByRejection = hasHangUpByRejection;
        return this;
    }
    public Boolean getHasHangUpByRejection() {
        return this.hasHangUpByRejection;
    }

    public CreateTaskExportTaskRequest setHasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
        this.hasReachedEndOfFlow = hasReachedEndOfFlow;
        return this;
    }
    public Boolean getHasReachedEndOfFlow() {
        return this.hasReachedEndOfFlow;
    }

    public CreateTaskExportTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTaskExportTaskRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public CreateTaskExportTaskRequest setJobGroupNameQuery(String jobGroupNameQuery) {
        this.jobGroupNameQuery = jobGroupNameQuery;
        return this;
    }
    public String getJobGroupNameQuery() {
        return this.jobGroupNameQuery;
    }

    public CreateTaskExportTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateTaskExportTaskRequest setJobStatusStringList(String jobStatusStringList) {
        this.jobStatusStringList = jobStatusStringList;
        return this;
    }
    public String getJobStatusStringList() {
        return this.jobStatusStringList;
    }

    public CreateTaskExportTaskRequest setOtherId(String otherId) {
        this.otherId = otherId;
        return this;
    }
    public String getOtherId() {
        return this.otherId;
    }

    public CreateTaskExportTaskRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public CreateTaskExportTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateTaskExportTaskRequest setRecordingDurationGte(Long recordingDurationGte) {
        this.recordingDurationGte = recordingDurationGte;
        return this;
    }
    public Long getRecordingDurationGte() {
        return this.recordingDurationGte;
    }

    public CreateTaskExportTaskRequest setRecordingDurationLte(Long recordingDurationLte) {
        this.recordingDurationLte = recordingDurationLte;
        return this;
    }
    public Long getRecordingDurationLte() {
        return this.recordingDurationLte;
    }

    public CreateTaskExportTaskRequest setScriptNameQuery(String scriptNameQuery) {
        this.scriptNameQuery = scriptNameQuery;
        return this;
    }
    public String getScriptNameQuery() {
        return this.scriptNameQuery;
    }

    public CreateTaskExportTaskRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public CreateTaskExportTaskRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public CreateTaskExportTaskRequest setTaskCreateTimeGte(Long taskCreateTimeGte) {
        this.taskCreateTimeGte = taskCreateTimeGte;
        return this;
    }
    public Long getTaskCreateTimeGte() {
        return this.taskCreateTimeGte;
    }

    public CreateTaskExportTaskRequest setTaskCreateTimeLte(Long taskCreateTimeLte) {
        this.taskCreateTimeLte = taskCreateTimeLte;
        return this;
    }
    public Long getTaskCreateTimeLte() {
        return this.taskCreateTimeLte;
    }

    public CreateTaskExportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateTaskExportTaskRequest setTaskStatusStringList(String taskStatusStringList) {
        this.taskStatusStringList = taskStatusStringList;
        return this;
    }
    public String getTaskStatusStringList() {
        return this.taskStatusStringList;
    }

    public CreateTaskExportTaskRequest setUserIdMatch(String userIdMatch) {
        this.userIdMatch = userIdMatch;
        return this;
    }
    public String getUserIdMatch() {
        return this.userIdMatch;
    }

}
