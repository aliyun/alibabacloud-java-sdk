// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskRequest extends TeaModel {
    /**
     * <p>Call start time</p>
     * 
     * <strong>example:</strong>
     * <p>1646582400000</p>
     */
    @NameInMap("ActualTimeGte")
    public Long actualTimeGte;

    /**
     * <p>Call end time</p>
     * 
     * <strong>example:</strong>
     * <p>1643126399000</p>
     */
    @NameInMap("ActualTimeLte")
    public Long actualTimeLte;

    /**
     * <p>Minimum call duration, in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>12341155</p>
     */
    @NameInMap("CallDurationGte")
    public Long callDurationGte;

    /**
     * <p>Maximum call duration, in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>12341155</p>
     */
    @NameInMap("CallDurationLte")
    public Long callDurationLte;

    /**
     * <p>Called number</p>
     * 
     * <strong>example:</strong>
     * <p>15126426342</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>Calling number</p>
     * 
     * <strong>example:</strong>
     * <p>051085500215</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d481cebe-0bb6-4d13-9649-42ce5074fb75</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Job group ID</p>
     * 
     * <strong>example:</strong>
     * <p>3a30ae7c-27b2-4305-9444-7185ced9d51f</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>Job group name</p>
     * 
     * <strong>example:</strong>
     * <p>国寿财住院保续保_20220301_134130</p>
     */
    @NameInMap("JobGroupNameQuery")
    public String jobGroupNameQuery;

    /**
     * <p>Job ID</p>
     * 
     * <strong>example:</strong>
     * <p>11994321-e6bc-47bb-8b1c-8eef8f2f768b</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Job status. Separate multiple statuses with commas. If you specify this parameter, it overrides jobStatusList.</p>
     * <ul>
     * <li><p>Scheduling: The job is being scheduled.</p>
     * </li>
     * <li><p>Executing: The job is running.</p>
     * </li>
     * <li><p>Succeeded: The job completed successfully.</p>
     * </li>
     * <li><p>Paused: The job was paused.</p>
     * </li>
     * <li><p>Failed: The job failed.</p>
     * </li>
     * <li><p>Cancelled: The job was cancelled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusStringList")
    public String jobStatusStringList;

    /**
     * <p>Label-based filter condition for calls</p>
     * <blockquote>
     * <p>You can only use labels that have specific enumeration values. For example, labels configured with specific values in Large Language Model (LLM) scenarios.</p>
     * </blockquote>
     */
    @NameInMap("LabelsJson")
    public java.util.List<String> labelsJson;

    /**
     * <p>Other ID</p>
     * <p><strong>Valid values include the following:</strong></p>
     * <ul>
     * <li><p>sessionID</p>
     * </li>
     * <li><p>taskid</p>
     * </li>
     * <li><p>jobid</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVD-2021-39685</p>
     */
    @NameInMap("OtherId")
    public String otherId;

    /**
     * <p>Page number</p>
     * <blockquote>
     * <p>The first page is 0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>Number of items per page</p>
     * <blockquote>
     * <p>If you omit this parameter, the default value is 10.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Minimum ring duration, in seconds</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordingDurationGte")
    public Long recordingDurationGte;

    /**
     * <p>The minimum ringing duration for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RecordingDurationLte")
    public Long recordingDurationLte;

    /**
     * <p>Scenario name</p>
     * 
     * <strong>example:</strong>
     * <p>国寿财</p>
     */
    @NameInMap("ScriptNameQuery")
    public String scriptNameQuery;

    /**
     * <p>Sort field. Default value: actualTime</p>
     * 
     * <strong>example:</strong>
     * <p>actualTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Sort order. Valid values:</p>
     * <ul>
     * <li><p>asc (ascending)</p>
     * </li>
     * <li><p>desc (descending). Default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Start time of the task</p>
     * <blockquote>
     * <p>You must specify both TaskCreateTimeGte and TaskCreateTimeLte. If you omit either, the filter does not work.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1646792941</p>
     */
    @NameInMap("TaskCreateTimeGte")
    public Long taskCreateTimeGte;

    /**
     * <p>End time of the task</p>
     * <blockquote>
     * <p>You must specify both TaskCreateTimeGte and TaskCreateTimeLte. If you omit either, the filter does not work.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1646792941</p>
     */
    @NameInMap("TaskCreateTimeLte")
    public Long taskCreateTimeLte;

    /**
     * <p>Task ID</p>
     * 
     * <strong>example:</strong>
     * <p>744b27f3-437f-4a8c-a181-f668e492fd24</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Call status. Separate multiple statuses with commas.</p>
     * <ul>
     * <li><p><strong>Executing</strong>: 0 (Calling).</p>
     * </li>
     * <li><p><strong>Succeeded</strong>: 1 (Connected).</p>
     * </li>
     * <li><p><strong>NoAnswer</strong>: 2 (No answer).</p>
     * </li>
     * <li><p><strong>NotExist</strong>: 3 (Nonexistent number).</p>
     * </li>
     * <li><p><strong>Busy</strong>: 4 (Line busy).</p>
     * </li>
     * <li><p><strong>Cancelled</strong>: 5 (Call canceled due to job stop).</p>
     * </li>
     * <li><p><strong>Failed</strong>: 6 (Call failed).</p>
     * </li>
     * <li><p><strong>NotConnected</strong>: 7 (Cannot connect).</p>
     * </li>
     * <li><p><strong>PoweredOff</strong>: 8 (Phone powered off).</p>
     * </li>
     * <li><p><strong>OutOfService</strong>: 9 (Called number out of service).</p>
     * </li>
     * <li><p><strong>InArrears</strong>: 10 (Called number overdue payment).</p>
     * </li>
     * <li><p><strong>EmptyNumber</strong>: 11 (Empty number, no outbound call).</p>
     * </li>
     * <li><p><strong>PerDayCallCountLimit</strong>: 12 (Daily call limit exceeded).</p>
     * </li>
     * <li><p><strong>ContactBlockList</strong>: 13 (Blacklisted).</p>
     * </li>
     * <li><p><strong>CallerNotRegistered</strong>: 14 (Caller number not registered).</p>
     * </li>
     * <li><p><strong>Terminated</strong>: 15 (Call terminated).</p>
     * </li>
     * <li><p><strong>VerificationCancelled</strong>: 16 (Call canceled due to pre-call validation failure).</p>
     * </li>
     * <li><p><strong>OutOfServiceNoCall</strong>: 17 (Called number out of service, no outbound call).</p>
     * </li>
     * <li><p><strong>InArrearsNoCall</strong>: 18 (Called number overdue payment, no outbound call).</p>
     * </li>
     * <li><p><strong>CallingNumberNotExist</strong>: 19 (Caller number does not exist).</p>
     * </li>
     * <li><p><strong>SucceededFinish</strong>: 20 (Connected and ended normally).</p>
     * </li>
     * <li><p><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected and robot hung up after rejection).</p>
     * </li>
     * <li><p><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected and robot hung up after silence timeout).</p>
     * </li>
     * <li><p><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected and client hung up after rejection).</p>
     * </li>
     * <li><p><strong>SucceededClientHangUp</strong>: 24 (Connected and client hung up without reason).</p>
     * </li>
     * <li><p><strong>SucceededTransferByIntent</strong>: 25 (Connected and transferred to agent based on intent match).</p>
     * </li>
     * <li><p><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected and transferred to agent after rejection).</p>
     * </li>
     * <li><p><strong>SucceededInoInterAction</strong>: 27 (Connected and no interaction from client side).</p>
     * </li>
     * <li><p><strong>SucceededError</strong>: 28 (Connected but system error interrupted).</p>
     * </li>
     * <li><p><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected but intercepted by voice assistant).</p>
     * </li>
     * <li><p><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected but intercepted by extension transfer).</p>
     * </li>
     * <li><p><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected but intercepted by custom rule).</p>
     * </li>
     * <li><p><strong>HighRiskSipCode</strong>: 32 (High-risk SIP code, no outbound call).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("TaskStatusStringList")
    public String taskStatusStringList;

    /**
     * <p>User ID. A unique identifier for a user.</p>
     * <blockquote>
     * <p>This field is passed when you upload an outbound call list.</p>
     * <ul>
     * <li><p>If you upload the list in JSON format, the user ID is the value of referenceId.</p>
     * </li>
     * <li><p>If you upload the list as an Excel file, the user ID is the value of contactId.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C01</p>
     */
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

    public SearchTaskRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
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

    public SearchTaskRequest setLabelsJson(java.util.List<String> labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public java.util.List<String> getLabelsJson() {
        return this.labelsJson;
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
