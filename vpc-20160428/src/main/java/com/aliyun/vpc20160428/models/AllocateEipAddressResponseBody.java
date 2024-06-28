// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponseBody extends TeaModel {
    /**
     * <p>The EIP ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The EIP that is allocated. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The order ID. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazfdgdg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AllocateEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponseBody self = new AllocateEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressResponseBody setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public AllocateEipAddressResponseBody setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public AllocateEipAddressResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public AllocateEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateEipAddressResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
