// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaWorkloadsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dsw65443322</p>
     */
    @NameInMap("BeforeWorkloadId")
    public String beforeWorkloadId;

    @NameInMap("GmtDequeuedTimeRange")
    public TimeRangeFilter gmtDequeuedTimeRange;

    @NameInMap("GmtEnqueuedTimeRange")
    public TimeRangeFilter gmtEnqueuedTimeRange;

    @NameInMap("GmtPositionModifiedTimeRange")
    public TimeRangeFilter gmtPositionModifiedTimeRange;

    /**
     * <strong>example:</strong>
     * <p>lrn48278127617</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <strong>example:</strong>
     * <p>GmtCreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>Enqueued</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>quota12344666,quota64432233</p>
     */
    @NameInMap("SubQuotaIds")
    public String subQuotaIds;

    /**
     * <strong>example:</strong>
     * <p>29043893812,23829093093</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    @NameInMap("WorkloadCreatedTimeRange")
    public TimeRangeFilter workloadCreatedTimeRange;

    /**
     * <strong>example:</strong>
     * <p>dlc12344556</p>
     */
    @NameInMap("WorkloadIds")
    public String workloadIds;

    /**
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("WorkloadStatuses")
    public String workloadStatuses;

    /**
     * <strong>example:</strong>
     * <p>dlc</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    /**
     * <strong>example:</strong>
     * <p>186692</p>
     */
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static ListQuotaWorkloadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaWorkloadsRequest self = new ListQuotaWorkloadsRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaWorkloadsRequest setBeforeWorkloadId(String beforeWorkloadId) {
        this.beforeWorkloadId = beforeWorkloadId;
        return this;
    }
    public String getBeforeWorkloadId() {
        return this.beforeWorkloadId;
    }

    public ListQuotaWorkloadsRequest setGmtDequeuedTimeRange(TimeRangeFilter gmtDequeuedTimeRange) {
        this.gmtDequeuedTimeRange = gmtDequeuedTimeRange;
        return this;
    }
    public TimeRangeFilter getGmtDequeuedTimeRange() {
        return this.gmtDequeuedTimeRange;
    }

    public ListQuotaWorkloadsRequest setGmtEnqueuedTimeRange(TimeRangeFilter gmtEnqueuedTimeRange) {
        this.gmtEnqueuedTimeRange = gmtEnqueuedTimeRange;
        return this;
    }
    public TimeRangeFilter getGmtEnqueuedTimeRange() {
        return this.gmtEnqueuedTimeRange;
    }

    public ListQuotaWorkloadsRequest setGmtPositionModifiedTimeRange(TimeRangeFilter gmtPositionModifiedTimeRange) {
        this.gmtPositionModifiedTimeRange = gmtPositionModifiedTimeRange;
        return this;
    }
    public TimeRangeFilter getGmtPositionModifiedTimeRange() {
        return this.gmtPositionModifiedTimeRange;
    }

    public ListQuotaWorkloadsRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListQuotaWorkloadsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListQuotaWorkloadsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQuotaWorkloadsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQuotaWorkloadsRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListQuotaWorkloadsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListQuotaWorkloadsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListQuotaWorkloadsRequest setSubQuotaIds(String subQuotaIds) {
        this.subQuotaIds = subQuotaIds;
        return this;
    }
    public String getSubQuotaIds() {
        return this.subQuotaIds;
    }

    public ListQuotaWorkloadsRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public ListQuotaWorkloadsRequest setWorkloadCreatedTimeRange(TimeRangeFilter workloadCreatedTimeRange) {
        this.workloadCreatedTimeRange = workloadCreatedTimeRange;
        return this;
    }
    public TimeRangeFilter getWorkloadCreatedTimeRange() {
        return this.workloadCreatedTimeRange;
    }

    public ListQuotaWorkloadsRequest setWorkloadIds(String workloadIds) {
        this.workloadIds = workloadIds;
        return this;
    }
    public String getWorkloadIds() {
        return this.workloadIds;
    }

    public ListQuotaWorkloadsRequest setWorkloadStatuses(String workloadStatuses) {
        this.workloadStatuses = workloadStatuses;
        return this;
    }
    public String getWorkloadStatuses() {
        return this.workloadStatuses;
    }

    public ListQuotaWorkloadsRequest setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

    public ListQuotaWorkloadsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
