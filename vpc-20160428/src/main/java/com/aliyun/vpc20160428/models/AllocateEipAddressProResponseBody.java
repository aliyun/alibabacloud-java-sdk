// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProResponseBody extends TeaModel {
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The IP address of the requested EIP.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the specified EIP.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AllocateEipAddressProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressProResponseBody self = new AllocateEipAddressProResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressProResponseBody setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public AllocateEipAddressProResponseBody setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public AllocateEipAddressProResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public AllocateEipAddressProResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateEipAddressProResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
