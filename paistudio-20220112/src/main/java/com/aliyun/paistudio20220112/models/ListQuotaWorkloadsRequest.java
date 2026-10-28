// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaWorkloadsRequest extends TeaModel {
    /**
     * <p>The ID of the workload before which to query the queue information of instances in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw654433**</p>
     */
    @NameInMap("BeforeWorkloadId")
    public String beforeWorkloadId;

    /**
     * <p>The time range used for a range search on the time when the workloads were dequeued.</p>
     */
    @NameInMap("GmtDequeuedTimeRange")
    public TimeRangeFilter gmtDequeuedTimeRange;

    /**
     * <p>The time range used for a range search on the time when the workloads entered the queue.</p>
     */
    @NameInMap("GmtEnqueuedTimeRange")
    public TimeRangeFilter gmtEnqueuedTimeRange;

    /**
     * <p>The time range used for a range search on the time when the queue positions of the workloads changed.</p>
     */
    @NameInMap("GmtPositionModifiedTimeRange")
    public TimeRangeFilter gmtPositionModifiedTimeRange;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>train129f212o89d-master-0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the node on which to search for workloads.</p>
     * 
     * <strong>example:</strong>
     * <p>lrn482781276**</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The position in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Position")
    public Integer position;

    /**
     * <p>The priority of the workload.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>Specifies whether to display only the workloads corresponding to this resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <p>The field by which to sort the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the workload in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>Enqueued</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of sub-resource quota IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>quota123446**,quota644322**</p>
     */
    @NameInMap("SubQuotaIds")
    public String subQuotaIds;

    /**
     * <p>Specifies whether the workload uses oversold resources.</p>
     */
    @NameInMap("UseOversoldResource")
    public Boolean useOversoldResource;

    /**
     * <p>The IDs of the users.</p>
     * 
     * <strong>example:</strong>
     * <p>290438938**,238290930**</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    /**
     * <p>Specifies whether to include historical data.</p>
     */
    @NameInMap("WithHistoricalData")
    public Boolean withHistoricalData;

    /**
     * <p>The time range used for a range search on the workload creation time.</p>
     */
    @NameInMap("WorkloadCreatedTimeRange")
    public TimeRangeFilter workloadCreatedTimeRange;

    /**
     * <p>The IDs of the workloads to query for queue information.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc123445**</p>
     */
    @NameInMap("WorkloadIds")
    public String workloadIds;

    /**
     * <p>The names of the workloads.</p>
     * 
     * <strong>example:</strong>
     * <p>dlcxxxx</p>
     */
    @NameInMap("WorkloadNames")
    public String workloadNames;

    /**
     * <p>The workload statuses used to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("WorkloadStatuses")
    public String workloadStatuses;

    /**
     * <p>The workload type used to query the queue information of instances for the specified sub-product.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    /**
     * <p>The IDs of the workspaces for which to query the workload queue information.</p>
     * 
     * <strong>example:</strong>
     * <p>1866**</p>
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

    public ListQuotaWorkloadsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public ListQuotaWorkloadsRequest setPosition(Integer position) {
        this.position = position;
        return this;
    }
    public Integer getPosition() {
        return this.position;
    }

    public ListQuotaWorkloadsRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
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

    public ListQuotaWorkloadsRequest setUseOversoldResource(Boolean useOversoldResource) {
        this.useOversoldResource = useOversoldResource;
        return this;
    }
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

    public ListQuotaWorkloadsRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public ListQuotaWorkloadsRequest setWithHistoricalData(Boolean withHistoricalData) {
        this.withHistoricalData = withHistoricalData;
        return this;
    }
    public Boolean getWithHistoricalData() {
        return this.withHistoricalData;
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

    public ListQuotaWorkloadsRequest setWorkloadNames(String workloadNames) {
        this.workloadNames = workloadNames;
        return this;
    }
    public String getWorkloadNames() {
        return this.workloadNames;
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
