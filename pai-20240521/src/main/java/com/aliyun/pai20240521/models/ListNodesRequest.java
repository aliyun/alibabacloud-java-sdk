// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("AvailabilityZone")
    public String availabilityZone;

    @NameInMap("CliqueID")
    public String cliqueID;

    @NameInMap("FilterByQuotaId")
    public String filterByQuotaId;

    @NameInMap("FilterByResourceGroupIds")
    public String filterByResourceGroupIds;

    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("HealthCount")
    public ListNodesRequestHealthCount healthCount;

    @NameInMap("HealthRate")
    public ListNodesRequestHealthRate healthRate;

    @NameInMap("HyperNode")
    public String hyperNode;

    @NameInMap("HyperZone")
    public String hyperZone;

    @NameInMap("LayoutMode")
    public String layoutMode;

    @NameInMap("MachineGroupIds")
    public String machineGroupIds;

    @NameInMap("NodeNames")
    public String nodeNames;

    @NameInMap("NodeStatuses")
    public String nodeStatuses;

    @NameInMap("NodeTypes")
    public String nodeTypes;

    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>260590501560397</p>
     */
    @NameInMap("OrderInstanceIds")
    public String orderInstanceIds;

    @NameInMap("OrderStatuses")
    public String orderStatuses;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("ReasonCodes")
    public String reasonCodes;

    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Verbose")
    public Boolean verbose;

    @NameInMap("WorkspaceId")
    public String workspaceId;

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

    public ListNodesRequest setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public ListNodesRequest setCliqueID(String cliqueID) {
        this.cliqueID = cliqueID;
        return this;
    }
    public String getCliqueID() {
        return this.cliqueID;
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

    public ListNodesRequest setHealthCount(ListNodesRequestHealthCount healthCount) {
        this.healthCount = healthCount;
        return this;
    }
    public ListNodesRequestHealthCount getHealthCount() {
        return this.healthCount;
    }

    public ListNodesRequest setHealthRate(ListNodesRequestHealthRate healthRate) {
        this.healthRate = healthRate;
        return this;
    }
    public ListNodesRequestHealthRate getHealthRate() {
        return this.healthRate;
    }

    public ListNodesRequest setHyperNode(String hyperNode) {
        this.hyperNode = hyperNode;
        return this;
    }
    public String getHyperNode() {
        return this.hyperNode;
    }

    public ListNodesRequest setHyperZone(String hyperZone) {
        this.hyperZone = hyperZone;
        return this;
    }
    public String getHyperZone() {
        return this.hyperZone;
    }

    public ListNodesRequest setLayoutMode(String layoutMode) {
        this.layoutMode = layoutMode;
        return this;
    }
    public String getLayoutMode() {
        return this.layoutMode;
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

    public ListNodesRequest setOrderInstanceIds(String orderInstanceIds) {
        this.orderInstanceIds = orderInstanceIds;
        return this;
    }
    public String getOrderInstanceIds() {
        return this.orderInstanceIds;
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

    public ListNodesRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
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

    public ListNodesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListNodesRequestHealthCount extends TeaModel {
        @NameInMap("operation")
        public String operation;

        @NameInMap("value")
        public Integer value;

        public static ListNodesRequestHealthCount build(java.util.Map<String, ?> map) throws Exception {
            ListNodesRequestHealthCount self = new ListNodesRequestHealthCount();
            return TeaModel.build(map, self);
        }

        public ListNodesRequestHealthCount setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListNodesRequestHealthCount setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class ListNodesRequestHealthRate extends TeaModel {
        @NameInMap("operation")
        public String operation;

        @NameInMap("value")
        public Integer value;

        public static ListNodesRequestHealthRate build(java.util.Map<String, ?> map) throws Exception {
            ListNodesRequestHealthRate self = new ListNodesRequestHealthRate();
            return TeaModel.build(map, self);
        }

        public ListNodesRequestHealthRate setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListNodesRequestHealthRate setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

}
