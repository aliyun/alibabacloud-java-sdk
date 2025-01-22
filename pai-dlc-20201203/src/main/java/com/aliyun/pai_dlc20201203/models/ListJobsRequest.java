// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>16****</p>
     */
    @NameInMap("BusinessUserId")
    public String businessUserId;

    /**
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>2020-11-09T14:45:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromAllWorkspaces")
    public Boolean fromAllWorkspaces;

    /**
     * <strong>example:</strong>
     * <p>dlc********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OversoldInfo")
    public String oversoldInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>flow-*******</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <strong>example:</strong>
     * <p>r*****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceQuotaName")
    public String resourceQuotaName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    @NameInMap("UserIdForFilter")
    public String userIdForFilter;

    @NameInMap("Username")
    public String username;

    /**
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

    public ListJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
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
