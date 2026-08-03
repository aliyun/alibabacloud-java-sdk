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
     * <p>Specifies whether the call was answered.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAnsweredFilter")
    public Boolean hasAnsweredFilter;

    /**
     * <p>Specifies whether the call was hung up due to rejection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasHangUpByRejectionFilter")
    public Boolean hasHangUpByRejectionFilter;

    /**
     * <p>Specifies whether the call reached the end of the flow.</p>
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
     * <li>Scheduling: scheduling.</li>
     * <li>Executing: executing.</li>
     * <li>Succeeded: ended - reached.</li>
     * <li>Paused: paused.</li>
     * <li>Failed: ended - not reached.</li>
     * <li>Cancelled: cancelled - manual intervention.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusFilter")
    public String jobStatusFilter;

    /**
     * <p>The filter condition for labels associated with calls.</p>
     * <blockquote>
     * <p>This condition only supports filtering by labels that have specific enumerated label values configured, that is, labels with specific label values configured in large language model scenarios.</p>
     * </blockquote>
     */
    @NameInMap("LabelsJson")
    public java.util.List<String> labelsJson;

    /**
     * <p>The page number.</p>
     * <blockquote>
     * <p>Notice: This parameter is required.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * <blockquote>
     * <p>Notice: This parameter is required.</notice></p>
     * </blockquote>
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
     * <p>The call status, such as [&quot;Executing&quot;,&quot;Succeeded&quot;]. Separate multiple values with commas (,).</p>
     * <p>Valid values:</p>
     * <p>(Note: The <strong>Succeeded</strong> status has been subdivided into specific reasons. The <strong>Succeeded</strong>: 1 (answered) status is no longer returned. Instead, specific sub-reason types are returned.)</p>
     * <ul>
     * <li><strong>Executing</strong>: 0 (dialing).</li>
     * <li><strong>Succeeded</strong>: 1 (answered).</li>
     * <li><strong>NoAnswer</strong>: 2 (not answered - no one picked up).</li>
     * <li><strong>NotExist</strong>: 3 (not answered - nonexistent number).</li>
     * <li><strong>Busy</strong>: 4 (not answered - busy).</li>
     * <li><strong>Cancelled</strong>: 5 (not dialed - task stopped).</li>
     * <li><strong>Failed</strong>: 6 (failed).</li>
     * <li><strong>NotConnected</strong>: 7 (not answered - unreachable).</li>
     * <li><strong>PoweredOff</strong>: 8 (not answered - powered off).</li>
     * <li><strong>OutOfService</strong>: 9 (not answered - callee out of service).</li>
     * <li><strong>InArrears</strong>: 10 (not answered - callee has overdue payment).</li>
     * <li><strong>EmptyNumber</strong>: 11 (not dialed - nonexistent number, no outbound call).</li>
     * <li><strong>PerDayCallCountLimit</strong>: 12 (not dialed - daily limit exceeded).</li>
     * <li><strong>ContactBlockList</strong>: 13 (not dialed - blacklisted).</li>
     * <li><strong>CallerNotRegistered</strong>: 14 (not dialed - caller number not registered).</li>
     * <li><strong>Terminated</strong>: 15 (not dialed - terminated).</li>
     * <li><strong>VerificationCancelled</strong>: 16 (not dialed - cancelled due to pre-call verification failure).</li>
     * <li><strong>OutOfServiceNoCall</strong>: 17 (not dialed - callee out of service, no outbound call).</li>
     * <li><strong>InArrearsNoCall</strong>: 18 (not dialed - callee has overdue payment, no outbound call).</li>
     * <li><strong>CallingNumberNotExist</strong>: 19 (not dialed - caller number does not exist).</li>
     * <li><strong>SucceededFinish</strong>: 20 (answered - completed normally).</li>
     * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (answered - robot hung up after rejection).</li>
     * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (answered - hung up due to silence timeout).</li>
     * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (answered - user hung up after rejection).</li>
     * <li><strong>SucceededClientHangUp</strong>: 24 (answered - user hung up without reason).</li>
     * <li><strong>SucceededTransferByIntent</strong>: 25 (answered - transferred to agent by intent).</li>
     * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (answered - transferred to agent after rejection).</li>
     * <li><strong>SucceededInoInterAction</strong>: 27 (answered - no interaction from user side).</li>
     * <li><strong>SucceededError</strong>: 28 (answered - interrupted by system error).</li>
     * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (answered - special interception - voice assistant).</li>
     * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (answered - special interception - extension number transfer).</li>
     * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (answered - special interception - custom interception).</li>
     * <li><strong>HighRiskSipCode</strong>: 32 (not dialed - high risk, no outbound call).</li>
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
