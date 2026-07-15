// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsShrinkRequest extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Visible to all members in the workspace.</li>
     * <li>PRIVATE (default): Visible only to you and administrators in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The user ID associated with the job.</p>
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

    @NameInMap("Description")
    public String description;

    /**
     * <p>The job name. Supports fuzzy match and is case-insensitive. Wildcards are not supported.
     * For example, entering test matches test-job1, job-test, job-test2, or job-Test, but does not match job-t1.
     * Default value: empty, which indicates all job names.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The search mode for DisplayName. Default value: wildcard match.</p>
     * 
     * <strong>example:</strong>
     * <p>wildcard</p>
     */
    @NameInMap("DisplayNameSearchMode")
    public String displayNameSearchMode;

    /**
     * <p>Filters jobs based on whether running on specified nodes is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAssignNode")
    public String enableAssignNode;

    /**
     * <p>The end time of the query range. Jobs are filtered by creation time. Default value: the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-16T07:26:41Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to retrieve jobs across all workspaces. This parameter must be used together with <code>ShowOwn=true</code> to query jobs recently submitted by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromAllWorkspaces")
    public Boolean fromAllWorkspaces;

    /**
     * <p>Retrieves nodes by performing a full-text index on the images field. Supports Chinese and English tokenization.</p>
     * 
     * <strong>example:</strong>
     * <p>pytorch</p>
     */
    @NameInMap("ImageSearch")
    public String imageSearch;

    /**
     * <p>The job ID. Fuzzy match is not supported. Case-insensitive. Wildcards are not supported.
     * Default value: empty, which indicates all job IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>A list of job IDs separated by commas. If both JobIds and JobId are specified, JobId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc123abc</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The job type. Default value: empty, which indicates all types. Valid values:</p>
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

    /**
     * <p>The field name for numeric range filtering. Must be used together with NumericRangeMin or NumericRangeMax.</p>
     * 
     * <strong>example:</strong>
     * <p>RequestGPU</p>
     */
    @NameInMap("NumericRangeField")
    public String numericRangeField;

    /**
     * <p>The maximum value (inclusive) for numeric range filtering. Must be used together with NumericRangeField.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NumericRangeMax")
    public Long numericRangeMax;

    /**
     * <p>The minimum value (inclusive) for numeric range filtering. Must be used together with NumericRangeField.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NumericRangeMin")
    public Long numericRangeMin;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: Descending order. This is the default value.</li>
     * <li>asc: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The off-peak resource information. Valid values:</p>
     * <ul>
     * <li>ForbiddenQuotaOverSold</li>
     * <li>ForceQuotaOverSold</li>
     * <li>AcceptQuotaOverSold-true (true indicates the job actually used off-peak resources)</li>
     * <li>AcceptQuotaOverSold-false (false indicates the job actually used guaranteed resources)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ForbiddenQuotaOverSold</p>
     */
    @NameInMap("OversoldInfo")
    public String oversoldInfo;

    /**
     * <p>The page number to return in a paged query. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of jobs to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>PrePaid: resource quota</li>
     * <li>Spot: preemptible resources</li>
     * <li>PostPaid: public resources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>Filters jobs created by the specified workflow ID.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-*******</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>Retrieves nodes by performing a full-text index on the node failed reason field. Supports Chinese and English tokenization.</p>
     * 
     * <strong>example:</strong>
     * <p>OOM</p>
     */
    @NameInMap("ReasonSearch")
    public String reasonSearch;

    /**
     * <p>The resource group ID. For information about how to query the dedicated resource group ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>r*****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>Filters the job list by the resource quota name. Supports fuzzy match. Wildcards are not supported. Default value: empty, which indicates no filtering by resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>quota***</p>
     */
    @NameInMap("ResourceQuotaName")
    public String resourceQuotaName;

    /**
     * <p>Specifies whether to return only jobs submitted by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <p>The field by which to sort results. Valid values:</p>
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
     * <p>The start time of the query range. Jobs are filtered by creation time. Default value: the current time minus 7 days. If neither StartTime nor EndTime is specified, jobs created in the last 7 days are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-16T07:25:34Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>Queuing</li>
     * <li>Bidding (currently only for Lingjun Spot jobs)</li>
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
     * <p>The tags used for filtering.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The template ID. Filters jobs created from the specified template.</p>
     * 
     * <strong>example:</strong>
     * <p>tmlabc123</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The time field used for StartTime/EndTime filtering. Default value: creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtFinishTime</p>
     */
    @NameInMap("TimeRangeField")
    public String timeRangeField;

    /**
     * <p>Retrieves nodes by performing a full-text index on the user_command field. Supports Chinese and English tokenization.</p>
     * 
     * <strong>example:</strong>
     * <p>python train.py</p>
     */
    @NameInMap("UserCommandSearch")
    public String userCommandSearch;

    /**
     * <p>Filters the job list by the user ID of the job submitter.</p>
     * 
     * <strong>example:</strong>
     * <p>20**************</p>
     */
    @NameInMap("UserIdForFilter")
    public String userIdForFilter;

    /**
     * <p>Filters the job list by the username of the job submitter. Supports fuzzy match. Wildcards are not supported. Default value: empty, which indicates no filtering by username.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsShrinkRequest self = new ListJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListJobsShrinkRequest setBusinessUserId(String businessUserId) {
        this.businessUserId = businessUserId;
        return this;
    }
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    public ListJobsShrinkRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListJobsShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListJobsShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListJobsShrinkRequest setDisplayNameSearchMode(String displayNameSearchMode) {
        this.displayNameSearchMode = displayNameSearchMode;
        return this;
    }
    public String getDisplayNameSearchMode() {
        return this.displayNameSearchMode;
    }

    public ListJobsShrinkRequest setEnableAssignNode(String enableAssignNode) {
        this.enableAssignNode = enableAssignNode;
        return this;
    }
    public String getEnableAssignNode() {
        return this.enableAssignNode;
    }

    public ListJobsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListJobsShrinkRequest setFromAllWorkspaces(Boolean fromAllWorkspaces) {
        this.fromAllWorkspaces = fromAllWorkspaces;
        return this;
    }
    public Boolean getFromAllWorkspaces() {
        return this.fromAllWorkspaces;
    }

    public ListJobsShrinkRequest setImageSearch(String imageSearch) {
        this.imageSearch = imageSearch;
        return this;
    }
    public String getImageSearch() {
        return this.imageSearch;
    }

    public ListJobsShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListJobsShrinkRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public ListJobsShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobsShrinkRequest setNumericRangeField(String numericRangeField) {
        this.numericRangeField = numericRangeField;
        return this;
    }
    public String getNumericRangeField() {
        return this.numericRangeField;
    }

    public ListJobsShrinkRequest setNumericRangeMax(Long numericRangeMax) {
        this.numericRangeMax = numericRangeMax;
        return this;
    }
    public Long getNumericRangeMax() {
        return this.numericRangeMax;
    }

    public ListJobsShrinkRequest setNumericRangeMin(Long numericRangeMin) {
        this.numericRangeMin = numericRangeMin;
        return this;
    }
    public Long getNumericRangeMin() {
        return this.numericRangeMin;
    }

    public ListJobsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobsShrinkRequest setOversoldInfo(String oversoldInfo) {
        this.oversoldInfo = oversoldInfo;
        return this;
    }
    public String getOversoldInfo() {
        return this.oversoldInfo;
    }

    public ListJobsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListJobsShrinkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListJobsShrinkRequest setReasonSearch(String reasonSearch) {
        this.reasonSearch = reasonSearch;
        return this;
    }
    public String getReasonSearch() {
        return this.reasonSearch;
    }

    public ListJobsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListJobsShrinkRequest setResourceQuotaName(String resourceQuotaName) {
        this.resourceQuotaName = resourceQuotaName;
        return this;
    }
    public String getResourceQuotaName() {
        return this.resourceQuotaName;
    }

    public ListJobsShrinkRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListJobsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListJobsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListJobsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListJobsShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListJobsShrinkRequest setTimeRangeField(String timeRangeField) {
        this.timeRangeField = timeRangeField;
        return this;
    }
    public String getTimeRangeField() {
        return this.timeRangeField;
    }

    public ListJobsShrinkRequest setUserCommandSearch(String userCommandSearch) {
        this.userCommandSearch = userCommandSearch;
        return this;
    }
    public String getUserCommandSearch() {
        return this.userCommandSearch;
    }

    public ListJobsShrinkRequest setUserIdForFilter(String userIdForFilter) {
        this.userIdForFilter = userIdForFilter;
        return this;
    }
    public String getUserIdForFilter() {
        return this.userIdForFilter;
    }

    public ListJobsShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListJobsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
