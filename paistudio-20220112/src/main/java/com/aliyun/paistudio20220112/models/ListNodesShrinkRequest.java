// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodesShrinkRequest extends TeaModel {
    /**
     * <p>The accelerator type. Valid values:</p>
     * <ul>
     * <li>CPU</li>
     * <li>GPU</li>
     * </ul>
     * <p>Default value: empty, which indicates all types.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("AvailabilityZone")
    public String availabilityZone;

    @NameInMap("CliqueID")
    public String cliqueID;

    @NameInMap("DiskPL")
    public String diskPL;

    /**
     * <p>Used together with ResourceGroupIds to display nodes in the resource groups that are bound to the specified quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("FilterByQuotaId")
    public String filterByQuotaId;

    /**
     * <p>Used together with QuotaId to display nodes in the quota that belong to the specified resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg69rj0leslwdnbe</p>
     */
    @NameInMap("FilterByResourceGroupIds")
    public String filterByResourceGroupIds;

    /**
     * <p>The GPU type. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>T4</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The number of healthy nodes.</p>
     */
    @NameInMap("HealthCount")
    public String healthCountShrink;

    /**
     * <p>The health rate of nodes (the proportion of healthy nodes).</p>
     */
    @NameInMap("HealthRate")
    public String healthRateShrink;

    @NameInMap("HyperNode")
    public String hyperNode;

    @NameInMap("HyperZone")
    public String hyperZone;

    /**
     * <p>The layout mode.</p>
     */
    @NameInMap("LayoutMode")
    public String layoutMode;

    @NameInMap("MachineGroupIds")
    public String machineGroupIds;

    /**
     * <p>The node names to display, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>lingjxxxx</p>
     */
    @NameInMap("NodeNames")
    public String nodeNames;

    /**
     * <p>The node statuses, separated by commas. If this parameter is not specified, nodes in all statuses are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("NodeStatuses")
    public String nodeStatuses;

    /**
     * <p>The resource node specifications, separated by commas. If this parameter is not configured, nodes of all node specifications are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.xlarge</p>
     */
    @NameInMap("NodeTypes")
    public String nodeTypes;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: Descending order.</li>
     * <li>asc: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The order ID information.</p>
     * 
     * <strong>example:</strong>
     * <p>260590501560397</p>
     */
    @NameInMap("OrderInstanceIds")
    public String orderInstanceIds;

    /**
     * <p>The order statuses of the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("OrderStatuses")
    public String orderStatuses;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paged query. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("PodNum")
    public Integer podNum;

    /**
     * <p>The resource quota ID to which the node belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("ReasonCodes")
    public String reasonCodes;

    /**
     * <p>The IDs of resource groups, separated by commas. Either this parameter or QuotaId is required.</p>
     * <p>Constraints:</p>
     * <ol>
     * <li>The UserId of the specified ResourceGroupId must match the UserId of the request.</li>
     * <li>The specified resource groups must be of the same type.</li>
     * <li>The specified resource groups must be associated with the same VPC at this stage.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>rg69rj0leslwdnbe</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <p>The name of the resource group.</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The field used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether to return resource usage information. This parameter takes effect only when QuotaId is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    @NameInMap("WorkloadNum")
    public Integer workloadNum;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesShrinkRequest self = new ListNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesShrinkRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListNodesShrinkRequest setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public ListNodesShrinkRequest setCliqueID(String cliqueID) {
        this.cliqueID = cliqueID;
        return this;
    }
    public String getCliqueID() {
        return this.cliqueID;
    }

    public ListNodesShrinkRequest setDiskPL(String diskPL) {
        this.diskPL = diskPL;
        return this;
    }
    public String getDiskPL() {
        return this.diskPL;
    }

    public ListNodesShrinkRequest setFilterByQuotaId(String filterByQuotaId) {
        this.filterByQuotaId = filterByQuotaId;
        return this;
    }
    public String getFilterByQuotaId() {
        return this.filterByQuotaId;
    }

    public ListNodesShrinkRequest setFilterByResourceGroupIds(String filterByResourceGroupIds) {
        this.filterByResourceGroupIds = filterByResourceGroupIds;
        return this;
    }
    public String getFilterByResourceGroupIds() {
        return this.filterByResourceGroupIds;
    }

    public ListNodesShrinkRequest setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public ListNodesShrinkRequest setHealthCountShrink(String healthCountShrink) {
        this.healthCountShrink = healthCountShrink;
        return this;
    }
    public String getHealthCountShrink() {
        return this.healthCountShrink;
    }

    public ListNodesShrinkRequest setHealthRateShrink(String healthRateShrink) {
        this.healthRateShrink = healthRateShrink;
        return this;
    }
    public String getHealthRateShrink() {
        return this.healthRateShrink;
    }

    public ListNodesShrinkRequest setHyperNode(String hyperNode) {
        this.hyperNode = hyperNode;
        return this;
    }
    public String getHyperNode() {
        return this.hyperNode;
    }

    public ListNodesShrinkRequest setHyperZone(String hyperZone) {
        this.hyperZone = hyperZone;
        return this;
    }
    public String getHyperZone() {
        return this.hyperZone;
    }

    public ListNodesShrinkRequest setLayoutMode(String layoutMode) {
        this.layoutMode = layoutMode;
        return this;
    }
    public String getLayoutMode() {
        return this.layoutMode;
    }

    public ListNodesShrinkRequest setMachineGroupIds(String machineGroupIds) {
        this.machineGroupIds = machineGroupIds;
        return this;
    }
    public String getMachineGroupIds() {
        return this.machineGroupIds;
    }

    public ListNodesShrinkRequest setNodeNames(String nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public String getNodeNames() {
        return this.nodeNames;
    }

    public ListNodesShrinkRequest setNodeStatuses(String nodeStatuses) {
        this.nodeStatuses = nodeStatuses;
        return this;
    }
    public String getNodeStatuses() {
        return this.nodeStatuses;
    }

    public ListNodesShrinkRequest setNodeTypes(String nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }
    public String getNodeTypes() {
        return this.nodeTypes;
    }

    public ListNodesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListNodesShrinkRequest setOrderInstanceIds(String orderInstanceIds) {
        this.orderInstanceIds = orderInstanceIds;
        return this;
    }
    public String getOrderInstanceIds() {
        return this.orderInstanceIds;
    }

    public ListNodesShrinkRequest setOrderStatuses(String orderStatuses) {
        this.orderStatuses = orderStatuses;
        return this;
    }
    public String getOrderStatuses() {
        return this.orderStatuses;
    }

    public ListNodesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListNodesShrinkRequest setPodNum(Integer podNum) {
        this.podNum = podNum;
        return this;
    }
    public Integer getPodNum() {
        return this.podNum;
    }

    public ListNodesShrinkRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListNodesShrinkRequest setReasonCodes(String reasonCodes) {
        this.reasonCodes = reasonCodes;
        return this;
    }
    public String getReasonCodes() {
        return this.reasonCodes;
    }

    public ListNodesShrinkRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListNodesShrinkRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListNodesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListNodesShrinkRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListNodesShrinkRequest setWorkloadNum(Integer workloadNum) {
        this.workloadNum = workloadNum;
        return this;
    }
    public Integer getWorkloadNum() {
        return this.workloadNum;
    }

    public ListNodesShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
