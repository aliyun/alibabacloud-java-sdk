// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateTaskExportTaskRequest extends TeaModel {
    @NameInMap("ActualTimeGte")
    public Long actualTimeGte;

    @NameInMap("ActualTimeLte")
    public Long actualTimeLte;

    @NameInMap("CallDurationGte")
    public Long callDurationGte;

    @NameInMap("CallDurationLte")
    public Long callDurationLte;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("HasAnswered")
    public Boolean hasAnswered;

    @NameInMap("HasHangUpByRejection")
    public Boolean hasHangUpByRejection;

    @NameInMap("HasReachedEndOfFlow")
    public Boolean hasReachedEndOfFlow;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobGroupNameQuery")
    public String jobGroupNameQuery;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobStatusStringList")
    public String jobStatusStringList;

    @NameInMap("OtherId")
    public String otherId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordingDurationGte")
    public Long recordingDurationGte;

    @NameInMap("RecordingDurationLte")
    public Long recordingDurationLte;

    @NameInMap("ScriptNameQuery")
    public String scriptNameQuery;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("TaskCreateTimeGte")
    public Long taskCreateTimeGte;

    @NameInMap("TaskCreateTimeLte")
    public Long taskCreateTimeLte;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskStatusStringList")
    public String taskStatusStringList;

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
