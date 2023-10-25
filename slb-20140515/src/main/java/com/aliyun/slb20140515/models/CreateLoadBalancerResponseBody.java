// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>The IP address that is allocated to the CLB instance.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The IP version that is used by the CLB instance.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The CLB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The CLB instance name.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The network type of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **vpc**</p>
     * <p>*   **classic**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The order ID of the subscription CLB instance.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the CLB instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the vSwitch to which the CLB instance belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the CLB instance belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerResponseBody self = new CreateLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateLoadBalancerResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateLoadBalancerResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLoadBalancerResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLoadBalancerResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLoadBalancerResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLoadBalancerResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
