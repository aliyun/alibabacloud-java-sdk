// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProResponseBody extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The IP address assigned to the specified EIP. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The order ID.
     * &lt;props=&quot;china&quot;&gt;This parameter is returned when InstanceChargeType (the billing method of the EIP) is set to PrePaid (subscription). If AutoPay is set to false, which means automatic payment is not enabled, go to the <a href="https://usercenter2.aliyun.com/order/list">Order Center</a> to complete the payment.
     * &lt;props=&quot;intl&quot;&gt;This parameter is returned when InstanceChargeType (the billing method of the EIP) is set to PrePaid (subscription). If AutoPay is set to false, which means automatic payment is not enabled, go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Order Center</a> to complete the payment.</p>
     * 
     * <strong>example:</strong>
     * <p>20190000</p>
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
     * <p>The resource group ID. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-resourcegroup****</p>
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
