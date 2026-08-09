// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsWithResultRequest extends TeaModel {
    /**
     * <p>The filter condition for the call end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1579055783000</p>
     */
    @NameInMap("EndActualTimeFilter")
    public Long endActualTimeFilter;

    /**
     * <p>Specifies whether the call is answered.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAnsweredFilter")
    public Boolean hasAnsweredFilter;

    /**
     * <p>Specifies whether the call is hung up due to rejection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasHangUpByRejectionFilter")
    public Boolean hasHangUpByRejectionFilter;

    /**
     * <p>Specifies whether the call has reached the end of the flow.</p>
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
     * <p>The list of job failure reasons.</p>
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
     * <p>The job status filter. Valid values:</p>
     * <ul>
     * <li>Scheduling: Scheduling in progress.</li>
     * <li>Executing: Executing in progress.</li>
     * <li>Succeeded: Ended - Reached.</li>
     * <li>Paused: Paused.</li>
     * <li>Failed: Ended - Not reached.</li>
     * <li>Cancelled: Cancelled - Manual intervention.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusFilter")
    public String jobStatusFilter;

    /**
     * <p>The label-based filter condition for calls.</p>
     * <blockquote>
     * <p>This condition supports filtering only by labels that have specific enumerated label values configured, that is, labels with specific label values configured in large language model scenarios.</p>
     * </blockquote>
     */
    @NameInMap("LabelsJson")
    public java.util.List<String> labelsJson;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search content. You can search by phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>1882020****</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>The filter condition for the call start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1579055782000</p>
     */
    @NameInMap("StartActualTimeFilter")
    public Long startActualTimeFilter;

    /**
     * <p>The call status. Example: [&quot;Executing&quot;,&quot;Succeeded&quot;]. Separate multiple values with commas.</p>
     * <p>Valid values:</p>
     * <p>(Note: The <strong>Succeeded</strong> status has been subdivided into specific reasons. The general <strong>Succeeded</strong>: 1 (Connected) status is no longer returned. Instead, specific sub-reason types are returned.)</p>
     * <ul>
     * <li><strong>Executing</strong>: 0 (Calling).</li>
     * <li><strong>Succeeded</strong>: 1 (Connected).</li>
     * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
     * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
     * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
     * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
     * <li><strong>Failed</strong>: 6 (Failed).</li>
     * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
     * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
     * <li><strong>OutOfService</strong>: 9 (Not connected - Callee out of service).</li>
     * <li><strong>InArrears</strong>: 10 (Not connected - Callee has overdue payment).</li>
     * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, no outbound call).</li>
     * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
     * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
     * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
     * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
     * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Pre-call verification failed, cancelled).</li>
     * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee out of service, no outbound call).</li>
     * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, no outbound call).</li>
     * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
     * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
     * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after no recognition).</li>
     * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
     * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after no recognition).</li>
     * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
     * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent by intent match).</li>
     * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after no recognition).</li>
     * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction from user).</li>
     * <li><strong>SucceededError</strong>: 28 (Connected - System exception interruption).</li>
     * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special intercept - Voice assistant).</li>
     * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special intercept - Extension number transfer).</li>
     * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected - Special intercept - Custom intercept).</li>
     * <li><strong>HighRiskSipCode</strong>: 32 (Not dialed - High risk, no outbound call).</li>
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
