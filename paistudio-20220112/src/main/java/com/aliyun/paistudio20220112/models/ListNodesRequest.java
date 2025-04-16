// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

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

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListNodesRequest setFilterByQuotaId(String filterByQuotaId) {
        this.filterByQuotaId = filterByQuotaId;
        return this;
    }
    public String getFilterByQuotaId() {
        return this.filterByQuotaId;
    }

    public ListNodesRequest setFilterByResourceGroupIds(String filterByResourceGroupIds) {
        this.filterByResourceGroupIds = filterByResourceGroupIds;
        return this;
    }
    public String getFilterByResourceGroupIds() {
        return this.filterByResourceGroupIds;
    }

    public ListNodesRequest setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public ListNodesRequest setMachineGroupIds(String machineGroupIds) {
        this.machineGroupIds = machineGroupIds;
        return this;
    }
    public String getMachineGroupIds() {
        return this.machineGroupIds;
    }

    public ListNodesRequest setNodeNames(String nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public String getNodeNames() {
        return this.nodeNames;
    }

    public ListNodesRequest setNodeStatuses(String nodeStatuses) {
        this.nodeStatuses = nodeStatuses;
        return this;
    }
    public String getNodeStatuses() {
        return this.nodeStatuses;
    }

    public ListNodesRequest setNodeTypes(String nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }
    public String getNodeTypes() {
        return this.nodeTypes;
    }

    public ListNodesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListNodesRequest setOrderStatuses(String orderStatuses) {
        this.orderStatuses = orderStatuses;
        return this;
    }
    public String getOrderStatuses() {
        return this.orderStatuses;
    }

    public ListNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListNodesRequest setReasonCodes(String reasonCodes) {
        this.reasonCodes = reasonCodes;
        return this;
    }
    public String getReasonCodes() {
        return this.reasonCodes;
    }

    public ListNodesRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListNodesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListNodesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
