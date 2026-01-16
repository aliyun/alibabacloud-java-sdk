// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>The job visibility. Valid values:</p>
     * <ul>
     * <li>PUBLIC: The job is visible to all members in the workspace.</li>
     * <li>PRIVATE: The job is visible only to you and the administrator of the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The ID of the user associated with the job.</p>
     * 
     * <strong>example:</strong>
     * <p>16****</p>
     */
    @NameInMap("BusinessUserId")
    public String businessUserId;

    /**
     * <p>The caller.</p>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>The job name. Fuzzy query is supported. The name is case-insensitive. Wildcards are not supported. For example, if you enter test, test-job1, job-test, job-test2, or job-test can be matched, and job-t1 cannot be matched. The default value null indicates any job name.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("DisplayNameSearchMode")
    public String displayNameSearchMode;

    @NameInMap("EnableAssignNode")
    public String enableAssignNode;

    /**
     * <p>The end time of the query. Use the job creation time to filter data. The default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T14:45:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to query a list of jobs across workspaces. This parameter must be used together with <code>ShowOwn=true</code>. You can use this parameter to query a list of jobs recently submitted by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromAllWorkspaces")
    public Boolean fromAllWorkspaces;

    @NameInMap("ImageSearch")
    public String imageSearch;

    /**
     * <p>The job ID. Fuzzy query is supported. The name is case-insensitive. Wildcards are not supported. The default value null indicates any job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The job type. The default value null indicates any type. Valid values:</p>
     * <ul>
     * <li>TFJob</li>
     * <li>PyTorchJob</li>
     * <li>XGBoostJob</li>
     * <li>OneFlowJob</li>
     * <li>ElasticBatchJob</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    @NameInMap("NumericRangeField")
    public String numericRangeField;

    @NameInMap("NumericRangeMax")
    public Long numericRangeMax;

    @NameInMap("NumericRangeMin")
    public Long numericRangeMin;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li>desc (default)</li>
     * <li>asc</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The Idle resource information. Valid values:</p>
     * <ul>
     * <li>ForbiddenQuotaOverSold</li>
     * <li>ForceQuotaOverSold</li>
     * <li>AcceptQuotaOverSold-true (true indicates that the job uses idle resources.)</li>
     * <li>AcceptQuotaOverSold-false (false indicates that the job uses guaranteed resources.)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ForbiddenQuotaOverSold</p>
     */
    @NameInMap("OversoldInfo")
    public String oversoldInfo;

    /**
     * <p>The number of the page to return for the current query. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of jobs per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>PrePaid: Resource quota</li>
     * <li>Spot: Preemptible resources</li>
     * <li>PostPaid: Public resources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The specific pipeline ID used to filter jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-*******</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ReasonSearch")
    public String reasonSearch;

    /**
     * <p>The resource group ID. For information about how to obtain the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quota</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>r*****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource quota name used to filter jobs. Fuzzy search is supported. Wildcards are not supported. The default value null indicates that jobs are not filtered by resource quota name.</p>
     * 
     * <strong>example:</strong>
     * <p>quota***</p>
     */
    @NameInMap("ResourceQuotaName")
    public String resourceQuotaName;

    /**
     * <p>Specifies whether to query only the jobs submitted by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <p>The sorting field. Valid values:</p>
     * <ul>
     * <li>DisplayName</li>
     * <li>JobType</li>
     * <li>Status</li>
     * <li>GmtCreateTime</li>
     * <li>GmtFinishTime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the query. Use the job creation time to filter data. The default value is the current time minus seven days. In other words, if you do not configure the StartTime and EndTime parameters, the system queries the job list in the last seven days.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>Queuing</li>
     * <li>Bidding (only available for spot jobs that use Lingjun resources)</li>
     * <li>EnvPreparing</li>
     * <li>SanityChecking</li>
     * <li>Running</li>
     * <li>Restarting</li>
     * <li>Stopping</li>
     * <li>SucceededReserving</li>
     * <li>FailedReserving</li>
     * <li>Succeeded</li>
     * <li>Failed</li>
     * <li>Stopped</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    @NameInMap("TimeRangeField")
    public String timeRangeField;

    @NameInMap("UserCommandSearch")
    public String userCommandSearch;

    /**
     * <p>The user ID used to filter jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>20**************</p>
     */
    @NameInMap("UserIdForFilter")
    public String userIdForFilter;

    /**
     * <p>The username used to filter jobs. Fuzzy search is supported. Wildcards are not supported. The default value null indicates that jobs are not filtered by username.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListJobsRequest setBusinessUserId(String businessUserId) {
        this.businessUserId = businessUserId;
        return this;
    }
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    public ListJobsRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListJobsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListJobsRequest setDisplayNameSearchMode(String displayNameSearchMode) {
        this.displayNameSearchMode = displayNameSearchMode;
        return this;
    }
    public String getDisplayNameSearchMode() {
        return this.displayNameSearchMode;
    }

    public ListJobsRequest setEnableAssignNode(String enableAssignNode) {
        this.enableAssignNode = enableAssignNode;
        return this;
    }
    public String getEnableAssignNode() {
        return this.enableAssignNode;
    }

    public ListJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListJobsRequest setFromAllWorkspaces(Boolean fromAllWorkspaces) {
        this.fromAllWorkspaces = fromAllWorkspaces;
        return this;
    }
    public Boolean getFromAllWorkspaces() {
        return this.fromAllWorkspaces;
    }

    public ListJobsRequest setImageSearch(String imageSearch) {
        this.imageSearch = imageSearch;
        return this;
    }
    public String getImageSearch() {
        return this.imageSearch;
    }

    public ListJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListJobsRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public ListJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobsRequest setNumericRangeField(String numericRangeField) {
        this.numericRangeField = numericRangeField;
        return this;
    }
    public String getNumericRangeField() {
        return this.numericRangeField;
    }

    public ListJobsRequest setNumericRangeMax(Long numericRangeMax) {
        this.numericRangeMax = numericRangeMax;
        return this;
    }
    public Long getNumericRangeMax() {
        return this.numericRangeMax;
    }

    public ListJobsRequest setNumericRangeMin(Long numericRangeMin) {
        this.numericRangeMin = numericRangeMin;
        return this;
    }
    public Long getNumericRangeMin() {
        return this.numericRangeMin;
    }

    public ListJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobsRequest setOversoldInfo(String oversoldInfo) {
        this.oversoldInfo = oversoldInfo;
        return this;
    }
    public String getOversoldInfo() {
        return this.oversoldInfo;
    }

    public ListJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListJobsRequest setReasonSearch(String reasonSearch) {
        this.reasonSearch = reasonSearch;
        return this;
    }
    public String getReasonSearch() {
        return this.reasonSearch;
    }

    public ListJobsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListJobsRequest setResourceQuotaName(String resourceQuotaName) {
        this.resourceQuotaName = resourceQuotaName;
        return this;
    }
    public String getResourceQuotaName() {
        return this.resourceQuotaName;
    }

    public ListJobsRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListJobsRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public ListJobsRequest setTimeRangeField(String timeRangeField) {
        this.timeRangeField = timeRangeField;
        return this;
    }
    public String getTimeRangeField() {
        return this.timeRangeField;
    }

    public ListJobsRequest setUserCommandSearch(String userCommandSearch) {
        this.userCommandSearch = userCommandSearch;
        return this;
    }
    public String getUserCommandSearch() {
        return this.userCommandSearch;
    }

    public ListJobsRequest setUserIdForFilter(String userIdForFilter) {
        this.userIdForFilter = userIdForFilter;
        return this;
    }
    public String getUserIdForFilter() {
        return this.userIdForFilter;
    }

    public ListJobsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListJobsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
