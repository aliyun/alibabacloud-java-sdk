// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsWithResultRequest extends TeaModel {
    /**
     * <p>Filters for calls that ended on or before the specified time. Specify the time as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1579055783000</p>
     */
    @NameInMap("EndActualTimeFilter")
    public Long endActualTimeFilter;

    /**
     * <p>Filters jobs by whether the call was answered.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAnsweredFilter")
    public Boolean hasAnsweredFilter;

    /**
     * <p>Filters jobs by whether the call was disconnected due to a rejection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasHangUpByRejectionFilter")
    public Boolean hasHangUpByRejectionFilter;

    /**
     * <p>Filters jobs by whether the call flow was completed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasReachedEndOfFlowFilter")
    public Boolean hasReachedEndOfFlowFilter;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9d53cd72-4050-4419-8c17-acc0bf158147</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job failure reasons to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("JobFailureReasonsFilter")
    public String jobFailureReasonsFilter;

    /**
     * <p>The ID of the job group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ad16fc35-d824-4102-a606-2be51c1aa6dd</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>The job status to filter by. Valid values:</p>
     * <ul>
     * <li><p><code>Scheduling</code>: The job is scheduled and awaiting execution.</p>
     * </li>
     * <li><p><code>Executing</code>: The job is in progress.</p>
     * </li>
     * <li><p><code>Succeeded</code>: The job is completed and the contact was reached.</p>
     * </li>
     * <li><p><code>Paused</code>: The job is paused.</p>
     * </li>
     * <li><p><code>Failed</code>: The job completed but failed to reach the contact.</p>
     * </li>
     * <li><p><code>Cancelled</code>: The job was canceled by a user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusFilter")
    public String jobStatusFilter;

    /**
     * <p>The filter conditions for calls, based on their labels.</p>
     * <blockquote>
     * <p>This filter applies only to labels that are configured with a predefined set of values (enumerated values). These labels are typically used in large model scenarios.</p>
     * </blockquote>
     */
    @NameInMap("LabelsJson")
    public java.util.List<String> labelsJson;

    /**
     * <p>The page number.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * <blockquote>
     * <p>Notice: This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search query for a specific job, such as the contact\&quot;s phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>1882020****</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>Filters for calls that started on or after the specified time. Specify the time as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1579055782000</p>
     */
    @NameInMap("StartActualTimeFilter")
    public Long startActualTimeFilter;

    /**
     * <p>The call statuses to filter by. You can specify multiple statuses as a JSON array of strings, such as <code>[&quot;Executing&quot;, &quot;Succeeded&quot;]</code>.
     * Valid values:
     * (Note: The <strong>Succeeded</strong> status is subdivided into more specific reasons. The general <strong>Succeeded</strong> (1: Connected) status is no longer returned. Instead, one of the more specific sub-statuses is returned.)</p>
     * <ul>
     * <li><p><strong>Executing</strong> (0): The call is being placed.</p>
     * </li>
     * <li><p><strong>Succeeded</strong> (1): The call was connected.</p>
     * </li>
     * <li><p><strong>NoAnswer</strong> (2): Not connected - No answer.</p>
     * </li>
     * <li><p><strong>NotExist</strong> (3): Not connected - The dialed number does not exist.</p>
     * </li>
     * <li><p><strong>Busy</strong> (4): Not connected - The line was busy.</p>
     * </li>
     * <li><p><strong>Cancelled</strong> (5): Not placed - The job was stopped before the call could be dialed.</p>
     * </li>
     * <li><p><strong>Failed</strong> (6): The call failed.</p>
     * </li>
     * <li><p><strong>NotConnected</strong> (7): Not connected - The call could not be connected.</p>
     * </li>
     * <li><p><strong>PoweredOff</strong> (8): Not connected - The recipient\&quot;s phone was powered off.</p>
     * </li>
     * <li><p><strong>OutOfService</strong> (9): Not connected - The recipient\&quot;s number is out of service.</p>
     * </li>
     * <li><p><strong>InArrears</strong> (10): Not connected - The recipient\&quot;s account is in arrears.</p>
     * </li>
     * <li><p><strong>EmptyNumber</strong> (11): Not placed - The number was identified as an empty number and was not dialed.</p>
     * </li>
     * <li><p><strong>PerDayCallCountLimit</strong> (12): Not placed - The daily call limit was reached.</p>
     * </li>
     * <li><p><strong>ContactBlockList</strong> (13): Not placed - The number is on a blocklist.</p>
     * </li>
     * <li><p><strong>CallerNotRegistered</strong> (14): Not placed - The calling number is not registered.</p>
     * </li>
     * <li><p><strong>Terminated</strong> (15): Not placed - The call was terminated.</p>
     * </li>
     * <li><p><strong>VerificationCancelled</strong> (16): Not placed - Canceled after failing a pre-call verification.</p>
     * </li>
     * <li><p><strong>OutOfServiceNoCall</strong> (17): Not placed - The number is out of service and was not dialed.</p>
     * </li>
     * <li><p><strong>InArrearsNoCall</strong> (18): Not placed - The recipient is in arrears and was not dialed.</p>
     * </li>
     * <li><p><strong>CallingNumberNotExist</strong> (19): Not placed - The calling number does not exist.</p>
     * </li>
     * <li><p><strong>SucceededFinish</strong> (20): Connected - The call completed normally.</p>
     * </li>
     * <li><p><strong>SucceededChatbotHangUpAfterNoAnswer</strong> (21): Connected - The chatbot hung up after a rejection.</p>
     * </li>
     * <li><p><strong>SucceededChatbotHangUpAfterSilence</strong> (22): Connected - The chatbot hung up due to a silence timeout.</p>
     * </li>
     * <li><p><strong>SucceededClientHangUpAfterNoAnswer</strong> (23): Connected - The user hung up after a rejection.</p>
     * </li>
     * <li><p><strong>SucceededClientHangUp</strong> (24): Connected - The user hung up for no specific reason.</p>
     * </li>
     * <li><p><strong>SucceededTransferByIntent</strong> (25): Connected - The call was transferred to an agent based on user intent.</p>
     * </li>
     * <li><p><strong>SucceededTransferAfterNoAnswer</strong> (26): Connected - The call was transferred to an agent after a rejection.</p>
     * </li>
     * <li><p><strong>SucceededInoInterAction</strong> (27): Connected - No interaction from the user.</p>
     * </li>
     * <li><p><strong>SucceededError</strong> (28): Connected - The call was interrupted by a system error.</p>
     * </li>
     * <li><p><strong>SucceededSpecialInterceptVoiceAssistant</strong> (29): Connected - Intercepted by a voice assistant.</p>
     * </li>
     * <li><p><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong> (30): Connected - Intercepted for an extension number transfer.</p>
     * </li>
     * <li><p><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong> (31): Connected - Intercepted by a custom rule.</p>
     * </li>
     * <li><p><strong>HighRiskSipCode</strong> (32): Not placed - High-risk SIP code.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Executing&quot;]</p>
     */
    @NameInMap("TaskStatusFilter")
    public String taskStatusFilter;

    public static QueryJobsWithResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsWithResultRequest self = new QueryJobsWithResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobsWithResultRequest setEndActualTimeFilter(Long endActualTimeFilter) {
        this.endActualTimeFilter = endActualTimeFilter;
        return this;
    }
    public Long getEndActualTimeFilter() {
        return this.endActualTimeFilter;
    }

    public QueryJobsWithResultRequest setHasAnsweredFilter(Boolean hasAnsweredFilter) {
        this.hasAnsweredFilter = hasAnsweredFilter;
        return this;
    }
    public Boolean getHasAnsweredFilter() {
        return this.hasAnsweredFilter;
    }

    public QueryJobsWithResultRequest setHasHangUpByRejectionFilter(Boolean hasHangUpByRejectionFilter) {
        this.hasHangUpByRejectionFilter = hasHangUpByRejectionFilter;
        return this;
    }
    public Boolean getHasHangUpByRejectionFilter() {
        return this.hasHangUpByRejectionFilter;
    }

    public QueryJobsWithResultRequest setHasReachedEndOfFlowFilter(Boolean hasReachedEndOfFlowFilter) {
        this.hasReachedEndOfFlowFilter = hasReachedEndOfFlowFilter;
        return this;
    }
    public Boolean getHasReachedEndOfFlowFilter() {
        return this.hasReachedEndOfFlowFilter;
    }

    public QueryJobsWithResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryJobsWithResultRequest setJobFailureReasonsFilter(String jobFailureReasonsFilter) {
        this.jobFailureReasonsFilter = jobFailureReasonsFilter;
        return this;
    }
    public String getJobFailureReasonsFilter() {
        return this.jobFailureReasonsFilter;
    }

    public QueryJobsWithResultRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public QueryJobsWithResultRequest setJobStatusFilter(String jobStatusFilter) {
        this.jobStatusFilter = jobStatusFilter;
        return this;
    }
    public String getJobStatusFilter() {
        return this.jobStatusFilter;
    }

    public QueryJobsWithResultRequest setLabelsJson(java.util.List<String> labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public java.util.List<String> getLabelsJson() {
        return this.labelsJson;
    }

    public QueryJobsWithResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryJobsWithResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryJobsWithResultRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public QueryJobsWithResultRequest setStartActualTimeFilter(Long startActualTimeFilter) {
        this.startActualTimeFilter = startActualTimeFilter;
        return this;
    }
    public Long getStartActualTimeFilter() {
        return this.startActualTimeFilter;
    }

    public QueryJobsWithResultRequest setTaskStatusFilter(String taskStatusFilter) {
        this.taskStatusFilter = taskStatusFilter;
        return this;
    }
    public String getTaskStatusFilter() {
        return this.taskStatusFilter;
    }

}
