// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("AvailabilityZone")
    public String availabilityZone;

    @NameInMap("CliqueID")
    public String cliqueID;

    /**
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("FilterByQuotaId")
    public String filterByQuotaId;

    /**
     * <strong>example:</strong>
     * <p>rg69rj0leslwdnbe</p>
     */
    @NameInMap("FilterByResourceGroupIds")
    public String filterByResourceGroupIds;

    /**
     * <strong>example:</strong>
     * <p>T4</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("HealthCount")
    public String healthCountShrink;

    @NameInMap("HealthRate")
    public String healthRateShrink;

    @NameInMap("HyperNode")
    public String hyperNode;

    @NameInMap("HyperZone")
    public String hyperZone;

    @NameInMap("LayoutMode")
    public String layoutMode;

    @NameInMap("MachineGroupIds")
    public String machineGroupIds;

    /**
     * <strong>example:</strong>
     * <p>lingjxxxx</p>
     */
    @NameInMap("NodeNames")
    public String nodeNames;

    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("NodeStatuses")
    public String nodeStatuses;

    /**
     * <strong>example:</strong>
     * <p>ecs.c6.xlarge</p>
     */
    @NameInMap("NodeTypes")
    public String nodeTypes;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>260590501560397</p>
     */
    @NameInMap("OrderInstanceIds")
    public String orderInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("OrderStatuses")
    public String orderStatuses;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("ReasonCodes")
    public String reasonCodes;

    /**
     * <strong>example:</strong>
     * <p>rg69rj0leslwdnbe</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

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

    public ListNodesShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
