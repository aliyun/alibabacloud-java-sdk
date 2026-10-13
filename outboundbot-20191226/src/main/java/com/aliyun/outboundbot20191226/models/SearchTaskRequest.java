// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskRequest extends TeaModel {
    /**
     * <p>The start time of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>1646582400000</p>
     */
    @NameInMap("ActualTimeGte")
    public Long actualTimeGte;

    /**
     * <p>The end time of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>1643126399000</p>
     */
    @NameInMap("ActualTimeLte")
    public Long actualTimeLte;

    /**
     * <p>The minimum call duration for the search, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>12341155</p>
     */
    @NameInMap("CallDurationGte")
    public Long callDurationGte;

    /**
     * <p>The maximum call duration for the search, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>12341155</p>
     */
    @NameInMap("CallDurationLte")
    public Long callDurationLte;

    /**
     * <p>The called number.</p>
     * 
     * <strong>example:</strong>
     * <p>15126426342</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The calling number.</p>
     * 
     * <strong>example:</strong>
     * <p>051085500215</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d481cebe-0bb6-4d13-9649-42ce5074fb75</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3a30ae7c-27b2-4305-9444-7185ced9d51f</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>The name of the job group.</p>
     * 
     * <strong>example:</strong>
     * <p>ChinaLifePCHospitalizationInsuranceRenewal_20220301_134130</p>
     */
    @NameInMap("JobGroupNameQuery")
    public String jobGroupNameQuery;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11994321-e6bc-47bb-8b1c-8eef8f2f768b</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job statuses. Separate multiple statuses with commas (,). If this field is not empty, it overwrites jobStatusList. Valid values:</p>
     * <ul>
     * <li>Scheduling: The job is being scheduled.</li>
     * <li>Executing: The job is being executed.</li>
     * <li>Succeeded: The job is finished and the called party is reached.</li>
     * <li>Paused: The job is stopped.</li>
     * <li>Failed: The job is finished but the called party is not reached.</li>
     * <li>Cancelled: The job is canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusStringList")
    public String jobStatusStringList;

    /**
     * <p>The filter conditions for call labels.</p>
     * <blockquote>
     * <p>You can only filter by labels that are configured with specific enumerated label values, which means labels configured with specific values in large language model scenarios.</p>
     * </blockquote>
     */
    @NameInMap("LabelsJson")
    public java.util.List<String> labelsJson;

    /**
     * <p>The other IDs.</p>
     * <p><strong>This includes the following IDs:</strong></p>
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
     * <p>The page number.</p>
     * <blockquote>
     * <p>Page numbers for this API operation start from 0 by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the default value is 10.</p>
     * </blockquote>
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
     * <p>The minimum ringing duration for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RecordingDurationLte")
    public Long recordingDurationLte;

    /**
     * <p>The scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>China Life P&amp;C</p>
     */
    @NameInMap("ScriptNameQuery")
    public String scriptNameQuery;

    /**
     * <p>The sort field. Default value: actualTime.</p>
     * 
     * <strong>example:</strong>
     * <p>actualTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>asc: Ascending order.</p>
     * </li>
     * <li><p>desc: Descending order. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time of the task.</p>
     * <blockquote>
     * <p>This parameter must be specified together with the TaskCreateTimeLte parameter. Otherwise, it does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1646792941</p>
     */
    @NameInMap("TaskCreateTimeGte")
    public Long taskCreateTimeGte;

    /**
     * <p>The end time of the task.</p>
     * <blockquote>
     * <p>This parameter must be specified together with the TaskCreateTimeGte parameter. Otherwise, it does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1646792941</p>
     */
    @NameInMap("TaskCreateTimeLte")
    public Long taskCreateTimeLte;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>744b27f3-437f-4a8c-a181-f668e492fd24</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The call statuses. Separate multiple statuses with commas (,). Valid values:
     * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The <strong>Succeeded</strong>: 1 (Connected) status is not displayed. All subsequent returned values are specific subdivided cause types.)</p>
     * <ul>
     * <li><strong>Executing</strong>: 0 (Dialing).</li>
     * <li><strong>Succeeded</strong>: 1 (Connected).</li>
     * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
     * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
     * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
     * <li><strong>Cancelled</strong>: 5 (Not called - Task stopped).</li>
     * <li><strong>Failed</strong>: 6 (Failed).</li>
     * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
     * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
     * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
     * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
     * <li><strong>EmptyNumber</strong>: 11 (Not called - Nonexistent number, no call).</li>
     * <li><strong>PerDayCallCountLimit</strong>: 12 (Not called - Daily limit exceeded).</li>
     * <li><strong>ContactBlockList</strong>: 13 (Not called - Blacklisted).</li>
     * <li><strong>CallerNotRegistered</strong>: 14 (Not called - Calling number not registered).</li>
     * <li><strong>Terminated</strong>: 15 (Not called - Terminated).</li>
     * <li><strong>VerificationCancelled</strong>: 16 (Not called - Canceled due to pre-call verification failure).</li>
     * <li><strong>OutOfServiceNoCall</strong>: 17 (Not called - Suspended, no call).</li>
     * <li><strong>InArrearsNoCall</strong>: 18 (Not called - Overdue payment, no call).</li>
     * <li><strong>CallingNumberNotExist</strong>: 19 (Not called - Calling number does not exist).</li>
     * <li><strong>SucceededFinish</strong>: 20 (Connected - Finished normally).</li>
     * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Bot hung up after unrecognized intent).</li>
     * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
     * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
     * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
     * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
     * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
     * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on the user side).</li>
     * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted due to system exception).</li>
     * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
     * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
     * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected - Special interception - Custom interception).</li>
     * <li><strong>HighRiskSipCode</strong>: 32 (Not called - High risk, no call).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("TaskStatusStringList")
    public String taskStatusStringList;

    /**
     * <p>The user ID, which is the unique identifier of the user.</p>
     * <blockquote>
     * <p>This field is passed when you upload an outbound call list.</p>
     * <ul>
     * <li>If the list is uploaded in JSON format, the user ID is the value of referenceId.</li>
     * <li>If the list is uploaded in an Excel file, the user ID is the value of contactId.</li>
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
