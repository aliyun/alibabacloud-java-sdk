// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerResponseBody extends TeaModel {
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Address")
    public String address;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OrderId")
    public Long orderId;

    public static CreateLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerResponseBody self = new CreateLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
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

    public CreateLoadBalancerResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateLoadBalancerResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLoadBalancerResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateLoadBalancerResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLoadBalancerResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
