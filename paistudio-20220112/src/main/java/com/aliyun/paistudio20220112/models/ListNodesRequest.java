// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The accelerator type. Valid values:</p>
     * <ul>
     * <li>CPU</li>
     * <li>GPU</li>
     * </ul>
     * <p>If this parameter is left empty, all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The zone where the nodes reside.</p>
     * 
     * <strong>example:</strong>
     * <p>C0</p>
     */
    @NameInMap("AvailabilityZone")
    public String availabilityZone;

    /**
     * <p>The clique ID.</p>
     */
    @NameInMap("CliqueID")
    public String cliqueID;

    /**
     * <p>The performance level (PL) of the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>PL2</p>
     */
    @NameInMap("DiskPL")
    public String diskPL;

    /**
     * <p>Used together with ResourceGroupIds to display nodes in the resource group that are bound to specific quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("FilterByQuotaId")
    public String filterByQuotaId;

    /**
     * <p>Used together with QuotaId to display nodes in the quota that belong to specific resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg69rj0leslwdnbe</p>
     */
    @NameInMap("FilterByResourceGroupIds")
    public String filterByResourceGroupIds;

    /**
     * <p>The GPU card type. Fuzzy match is supported.</p>
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
    public ListNodesRequestHealthCount healthCount;

    /**
     * <p>The health rate of the nodes, which is the proportion of healthy nodes.</p>
     */
    @NameInMap("HealthRate")
    public ListNodesRequestHealthRate healthRate;

    /**
     * <p>The name of the hypernode.</p>
     */
    @NameInMap("HyperNode")
    public String hyperNode;

    /**
     * <p>The hyperzone where the nodes reside.</p>
     * 
     * <strong>example:</strong>
     * <p>A0</p>
     */
    @NameInMap("HyperZone")
    public String hyperZone;

    /**
     * <p>The layout mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Tree</p>
     */
    @NameInMap("LayoutMode")
    public String layoutMode;

    /**
     * <p>The IDs of the machine groups to which the nodes belong.</p>
     * 
     * <strong>example:</strong>
     * <p>mg124</p>
     */
    @NameInMap("MachineGroupIds")
    public String machineGroupIds;

    /**
     * <p>The names of the nodes to display. Separate multiple names with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>lingjxxxx</p>
     */
    @NameInMap("NodeNames")
    public String nodeNames;

    /**
     * <p>The status of the node. Separate multiple statuses with commas. If you do not specify this parameter, the system returns a list of nodes in all statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("NodeStatuses")
    public String nodeStatuses;

    /**
     * <p>The list of resource node specifications. Separate multiple specifications with commas. If you do not specify this parameter, the system returns a list of machines of all resource node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.xlarge</p>
     */
    @NameInMap("NodeTypes")
    public String nodeTypes;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
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
     * <p>The order status of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("OrderStatuses")
    public String orderStatuses;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page in a paged query. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the node order.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The number of pods on the node.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PodNum")
    public Integer podNum;

    /**
     * <p>The ID of the resource quota to which the node belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The reason codes for the current status of the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>CordonByUser</p>
     */
    @NameInMap("ReasonCodes")
    public String reasonCodes;

    /**
     * <p>The list of resource group IDs. Separate multiple IDs with commas. You must specify either this parameter or QuotaId.
     * Constraints:</p>
     * <ol>
     * <li>The user ID of the specified resource group must match the user ID of the request.</li>
     * <li>The resource groups in the list must be of the same type.</li>
     * <li>The VPCs associated with the resource groups in the list must be the same.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>rg69rj0leslwdnbe</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-dlc</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The field based on which the results are sorted.</p>
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

    /**
     * <p>The number of workloads on the node.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkloadNum")
    public Integer workloadNum;

    /**
     * <p>The ID of the workspace to which the nodes belong.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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

    public ListNodesRequest setDiskPL(String diskPL) {
        this.diskPL = diskPL;
        return this;
    }
    public String getDiskPL() {
        return this.diskPL;
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

    public ListNodesRequest setPodNum(Integer podNum) {
        this.podNum = podNum;
        return this;
    }
    public Integer getPodNum() {
        return this.podNum;
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

    public ListNodesRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
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

    public ListNodesRequest setWorkloadNum(Integer workloadNum) {
        this.workloadNum = workloadNum;
        return this;
    }
    public Integer getWorkloadNum() {
        return this.workloadNum;
    }

    public ListNodesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListNodesRequestHealthCount extends TeaModel {
        /**
         * <p>The comparison operator. Valid values: ge, gte, eq, lte, and lt.</p>
         * 
         * <strong>example:</strong>
         * <p>le</p>
         */
        @NameInMap("operation")
        public String operation;

        /**
         * <p>The threshold for the number of healthy nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
        /**
         * <p>The comparison operator. Valid values: ge, gte, eq, lte, and lt.</p>
         * 
         * <strong>example:</strong>
         * <p>ge</p>
         */
        @NameInMap("operation")
        public String operation;

        /**
         * <p>The health rate threshold. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
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
