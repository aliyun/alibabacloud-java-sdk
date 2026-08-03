// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateTaskExportTaskRequest extends TeaModel {
    /**
     * <p>The start time (inclusive) for searching by call time.</p>
     * 
     * <strong>example:</strong>
     * <p>1646496000000</p>
     */
    @NameInMap("ActualTimeGte")
    public Long actualTimeGte;

    /**
     * <p>The end time (inclusive) for searching by call time.</p>
     * 
     * <strong>example:</strong>
     * <p>1646582400000</p>
     */
    @NameInMap("ActualTimeLte")
    public Long actualTimeLte;

    /**
     * <p>The minimum call duration for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallDurationGte")
    public Long callDurationGte;

    /**
     * <p>The maximum call duration for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CallDurationLte")
    public Long callDurationLte;

    /**
     * <p>The called number.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111111</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>Specifies whether the call was answered.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAnswered")
    public Boolean hasAnswered;

    /**
     * <p>Specifies whether the call was hung up due to rejection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasHangUpByRejection")
    public Boolean hasHangUpByRejection;

    /**
     * <p>Specifies whether the conversation was completed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasReachedEndOfFlow")
    public Boolean hasReachedEndOfFlow;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1dcb09c5-d5db-4397-bf65-db854463beea</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cb731aee-0a5b-4c2b-924c-d9e82eb1d8d7</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试_20220217_160147</p>
     */
    @NameInMap("JobGroupNameQuery")
    public String jobGroupNameQuery;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82097dd5-54df-475f-beba-eec8f4b7a3e1</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job status.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusStringList")
    public String jobStatusStringList;

    /**
     * <p>The other ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64ebe700-91b4-49cb-b457-0b7c0b598a86</p>
     */
    @NameInMap("OtherId")
    public String otherId;

    /**
     * <p>The page number. Pages start from 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The minimum ringing duration for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordingDurationGte")
    public Long recordingDurationGte;

    /**
     * <p>The maximum ringing duration for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RecordingDurationLte")
    public Long recordingDurationLte;

    /**
     * <p>The scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ScriptNameQuery")
    public String scriptNameQuery;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>actualTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>asr: ascending order</li>
     * <li>desc: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time for searching by task creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1646496000000</p>
     */
    @NameInMap("TaskCreateTimeGte")
    public Long taskCreateTimeGte;

    /**
     * <p>The end time for searching by task creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1646582400000</p>
     */
    @NameInMap("TaskCreateTimeLte")
    public Long taskCreateTimeLte;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64ebe700-91b4-49cb-b457-0b7c0b598a86</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The call status.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded,Failed</p>
     */
    @NameInMap("TaskStatusStringList")
    public String taskStatusStringList;

    /**
     * <p>The user ID.</p>
     * 
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

    public CreateTaskExportTaskRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
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
