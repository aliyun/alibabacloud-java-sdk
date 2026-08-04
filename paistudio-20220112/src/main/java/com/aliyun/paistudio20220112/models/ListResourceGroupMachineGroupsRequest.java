// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupMachineGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the user who created the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>1612285282502326</p>
     */
    @NameInMap("CreatorID")
    public String creatorID;

    @NameInMap("DiskPL")
    public String diskPL;

    /**
     * <p>The ECS instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The machine group IDs. Separate multiple IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>mg105ecqwfe49hwb</p>
     */
    @NameInMap("MachineGroupIDs")
    public String machineGroupIDs;

    /**
     * <p>The name of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order.</p>
     * <ul>
     * <li><p><code>Asc</code>: Sorts the results in ascending order.</p>
     * </li>
     * <li><p><code>Desc</code>: Sorts the results in descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The ID of the purchase order.</p>
     * 
     * <strong>example:</strong>
     * <p>236553689400333</p>
     */
    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The payment duration. If <code>PaymentDurationUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaymentDuration")
    public String paymentDuration;

    /**
     * <p>The billing duration unit of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The payment type.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The field to sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The instance status. <code>Creating</code>: The instance is being created. <code>Ready</code>: The instance is running. <code>Expiring</code>: The instance is expiring. <code>Expired</code>: The instance has expired. <code>Stopping</code>: The instance is being stopped. <code>Stopped</code>: The instance is stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListResourceGroupMachineGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupMachineGroupsRequest self = new ListResourceGroupMachineGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupMachineGroupsRequest setCreatorID(String creatorID) {
        this.creatorID = creatorID;
        return this;
    }
    public String getCreatorID() {
        return this.creatorID;
    }

    public ListResourceGroupMachineGroupsRequest setDiskPL(String diskPL) {
        this.diskPL = diskPL;
        return this;
    }
    public String getDiskPL() {
        return this.diskPL;
    }

    public ListResourceGroupMachineGroupsRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public ListResourceGroupMachineGroupsRequest setMachineGroupIDs(String machineGroupIDs) {
        this.machineGroupIDs = machineGroupIDs;
        return this;
    }
    public String getMachineGroupIDs() {
        return this.machineGroupIDs;
    }

    public ListResourceGroupMachineGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupMachineGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourceGroupMachineGroupsRequest setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    public ListResourceGroupMachineGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupMachineGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupMachineGroupsRequest setPaymentDuration(String paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public String getPaymentDuration() {
        return this.paymentDuration;
    }

    public ListResourceGroupMachineGroupsRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public ListResourceGroupMachineGroupsRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListResourceGroupMachineGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListResourceGroupMachineGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
