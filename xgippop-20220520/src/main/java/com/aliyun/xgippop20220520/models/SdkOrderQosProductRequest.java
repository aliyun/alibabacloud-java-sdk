// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkOrderQosProductRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CtToken")
    public String ctToken;

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

    public static SdkOrderQosProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkOrderQosProductRequest self = new SdkOrderQosProductRequest();
        return TeaModel.build(map, self);
    }

    public SdkOrderQosProductRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SdkOrderQosProductRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SdkOrderQosProductRequest setCtToken(String ctToken) {
        this.ctToken = ctToken;
        return this;
    }
    public String getCtToken() {
        return this.ctToken;
    }

    public SdkOrderQosProductRequest setIPv6(String IPv6) {
        this.IPv6 = IPv6;
        return this;
    }
    public String getIPv6() {
        return this.IPv6;
    }

    public SdkOrderQosProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SdkOrderQosProductRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public SdkOrderQosProductRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public SdkOrderQosProductRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SdkOrderQosProductRequest setPrivateIpv4(String privateIpv4) {
        this.privateIpv4 = privateIpv4;
        return this;
    }
    public String getPrivateIpv4() {
        return this.privateIpv4;
    }

    public SdkOrderQosProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SdkOrderQosProductRequest setProvice(String provice) {
        this.provice = provice;
        return this;
    }
    public String getProvice() {
        return this.provice;
    }

    public SdkOrderQosProductRequest setPublicIpv4(String publicIpv4) {
        this.publicIpv4 = publicIpv4;
        return this;
    }
    public String getPublicIpv4() {
        return this.publicIpv4;
    }

    public SdkOrderQosProductRequest setQosRequestId(String qosRequestId) {
        this.qosRequestId = qosRequestId;
        return this;
    }
    public String getQosRequestId() {
        return this.qosRequestId;
    }

    public SdkOrderQosProductRequest setTargetIpList(java.util.List<String> targetIpList) {
        this.targetIpList = targetIpList;
        return this;
    }
    public java.util.List<String> getTargetIpList() {
        return this.targetIpList;
    }

    public SdkOrderQosProductRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SdkOrderQosProductRequest setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Integer getUnitNum() {
        return this.unitNum;
    }

}
