// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class OrderQosProductRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("IPv6")
    public String IPv6;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("MobileNumber")
    public String mobileNumber;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PrivateIpv4")
    public String privateIpv4;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Provice")
    public String provice;

    @NameInMap("PublicIpv4")
    public String publicIpv4;

    @NameInMap("QosRequestId")
    public String qosRequestId;

    @NameInMap("TargetIpList")
    public java.util.List<String> targetIpList;

    @NameInMap("Token")
    public String token;

    @NameInMap("UnitNum")
    public Integer unitNum;

    public static OrderQosProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderQosProductRequest self = new OrderQosProductRequest();
        return TeaModel.build(map, self);
    }

    public OrderQosProductRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public OrderQosProductRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public OrderQosProductRequest setIPv6(String IPv6) {
        this.IPv6 = IPv6;
        return this;
    }
    public String getIPv6() {
        return this.IPv6;
    }

    public OrderQosProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OrderQosProductRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public OrderQosProductRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public OrderQosProductRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public OrderQosProductRequest setPrivateIpv4(String privateIpv4) {
        this.privateIpv4 = privateIpv4;
        return this;
    }
    public String getPrivateIpv4() {
        return this.privateIpv4;
    }

    public OrderQosProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderQosProductRequest setProvice(String provice) {
        this.provice = provice;
        return this;
    }
    public String getProvice() {
        return this.provice;
    }

    public OrderQosProductRequest setPublicIpv4(String publicIpv4) {
        this.publicIpv4 = publicIpv4;
        return this;
    }
    public String getPublicIpv4() {
        return this.publicIpv4;
    }

    public OrderQosProductRequest setQosRequestId(String qosRequestId) {
        this.qosRequestId = qosRequestId;
        return this;
    }
    public String getQosRequestId() {
        return this.qosRequestId;
    }

    public OrderQosProductRequest setTargetIpList(java.util.List<String> targetIpList) {
        this.targetIpList = targetIpList;
        return this;
    }
    public java.util.List<String> getTargetIpList() {
        return this.targetIpList;
    }

    public OrderQosProductRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public OrderQosProductRequest setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Integer getUnitNum() {
        return this.unitNum;
    }

}
