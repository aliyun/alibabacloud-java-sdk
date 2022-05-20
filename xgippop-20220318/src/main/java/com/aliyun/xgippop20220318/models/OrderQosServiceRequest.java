// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class OrderQosServiceRequest extends TeaModel {
    @NameInMap("CustomerAccount")
    public String customerAccount;

    @NameInMap("CustomerQosRequestId")
    public String customerQosRequestId;

    @NameInMap("IPv6")
    public String IPv6;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PrivateIPv4")
    public String privateIPv4;

    @NameInMap("PublicIPv4")
    public String publicIPv4;

    @NameInMap("QosProductId")
    public String qosProductId;

    @NameInMap("TargetIp")
    public java.util.List<String> targetIp;

    @NameInMap("Token")
    public String token;

    public static OrderQosServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderQosServiceRequest self = new OrderQosServiceRequest();
        return TeaModel.build(map, self);
    }

    public OrderQosServiceRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public OrderQosServiceRequest setCustomerQosRequestId(String customerQosRequestId) {
        this.customerQosRequestId = customerQosRequestId;
        return this;
    }
    public String getCustomerQosRequestId() {
        return this.customerQosRequestId;
    }

    public OrderQosServiceRequest setIPv6(String IPv6) {
        this.IPv6 = IPv6;
        return this;
    }
    public String getIPv6() {
        return this.IPv6;
    }

    public OrderQosServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OrderQosServiceRequest setPrivateIPv4(String privateIPv4) {
        this.privateIPv4 = privateIPv4;
        return this;
    }
    public String getPrivateIPv4() {
        return this.privateIPv4;
    }

    public OrderQosServiceRequest setPublicIPv4(String publicIPv4) {
        this.publicIPv4 = publicIPv4;
        return this;
    }
    public String getPublicIPv4() {
        return this.publicIPv4;
    }

    public OrderQosServiceRequest setQosProductId(String qosProductId) {
        this.qosProductId = qosProductId;
        return this;
    }
    public String getQosProductId() {
        return this.qosProductId;
    }

    public OrderQosServiceRequest setTargetIp(java.util.List<String> targetIp) {
        this.targetIp = targetIp;
        return this;
    }
    public java.util.List<String> getTargetIp() {
        return this.targetIp;
    }

    public OrderQosServiceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
