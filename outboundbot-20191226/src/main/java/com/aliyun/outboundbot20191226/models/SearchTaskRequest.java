// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskRequest extends TeaModel {
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

    public static SearchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTaskRequest self = new SearchTaskRequest();
        return TeaModel.build(map, self);
    }

    public SearchTaskRequest setActualTimeGte(Long actualTimeGte) {
        this.actualTimeGte = actualTimeGte;
        return this;
    }
    public Long getActualTimeGte() {
        return this.actualTimeGte;
    }

    public SearchTaskRequest setActualTimeLte(Long actualTimeLte) {
        this.actualTimeLte = actualTimeLte;
        return this;
    }
    public Long getActualTimeLte() {
        return this.actualTimeLte;
    }

    public SearchTaskRequest setCallDurationGte(Long callDurationGte) {
        this.callDurationGte = callDurationGte;
        return this;
    }
    public Long getCallDurationGte() {
        return this.callDurationGte;
    }

    public SearchTaskRequest setCallDurationLte(Long callDurationLte) {
        this.callDurationLte = callDurationLte;
        return this;
    }
    public Long getCallDurationLte() {
        return this.callDurationLte;
    }

    public SearchTaskRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SearchTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchTaskRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public SearchTaskRequest setJobGroupNameQuery(String jobGroupNameQuery) {
        this.jobGroupNameQuery = jobGroupNameQuery;
        return this;
    }
    public String getJobGroupNameQuery() {
        return this.jobGroupNameQuery;
    }

    public SearchTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SearchTaskRequest setJobStatusStringList(String jobStatusStringList) {
        this.jobStatusStringList = jobStatusStringList;
        return this;
    }
    public String getJobStatusStringList() {
        return this.jobStatusStringList;
    }

    public SearchTaskRequest setOtherId(String otherId) {
        this.otherId = otherId;
        return this;
    }
    public String getOtherId() {
        return this.otherId;
    }

    public SearchTaskRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SearchTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTaskRequest setRecordingDurationGte(Long recordingDurationGte) {
        this.recordingDurationGte = recordingDurationGte;
        return this;
    }
    public Long getRecordingDurationGte() {
        return this.recordingDurationGte;
    }

    public SearchTaskRequest setRecordingDurationLte(Long recordingDurationLte) {
        this.recordingDurationLte = recordingDurationLte;
        return this;
    }
    public Long getRecordingDurationLte() {
        return this.recordingDurationLte;
    }

    public SearchTaskRequest setScriptNameQuery(String scriptNameQuery) {
        this.scriptNameQuery = scriptNameQuery;
        return this;
    }
    public String getScriptNameQuery() {
        return this.scriptNameQuery;
    }

    public SearchTaskRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchTaskRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public SearchTaskRequest setTaskCreateTimeGte(Long taskCreateTimeGte) {
        this.taskCreateTimeGte = taskCreateTimeGte;
        return this;
    }
    public Long getTaskCreateTimeGte() {
        return this.taskCreateTimeGte;
    }

    public SearchTaskRequest setTaskCreateTimeLte(Long taskCreateTimeLte) {
        this.taskCreateTimeLte = taskCreateTimeLte;
        return this;
    }
    public Long getTaskCreateTimeLte() {
        return this.taskCreateTimeLte;
    }

    public SearchTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SearchTaskRequest setTaskStatusStringList(String taskStatusStringList) {
        this.taskStatusStringList = taskStatusStringList;
        return this;
    }
    public String getTaskStatusStringList() {
        return this.taskStatusStringList;
    }

    public SearchTaskRequest setUserIdMatch(String userIdMatch) {
        this.userIdMatch = userIdMatch;
        return this;
    }
    public String getUserIdMatch() {
        return this.userIdMatch;
    }

}
