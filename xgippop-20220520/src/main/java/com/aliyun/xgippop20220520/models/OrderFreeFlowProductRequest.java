// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class OrderFreeFlowProductRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    // 渠道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 客户侧生成的QoS请求ID，需要保证请求幂等性，确保不同请求间该参数值唯一
    @NameInMap("CustomerFlowRequestId")
    public String customerFlowRequestId;

    // 免流产品ID
    @NameInMap("FlowProductId")
    public String flowProductId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 是否包月，true为包月，false为不包月
    @NameInMap("Lasting")
    public String lasting;

    // C端手机号
    @NameInMap("MobileNumber")
    public String mobileNumber;

    // 客户提供的回调通知接口url
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    // 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
    @NameInMap("Operator")
    public String operator;

    // 支付订单ID
    @NameInMap("PurchaseOrderId")
    public String purchaseOrderId;

    public static OrderFreeFlowProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderFreeFlowProductRequest self = new OrderFreeFlowProductRequest();
        return TeaModel.build(map, self);
    }

    public OrderFreeFlowProductRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public OrderFreeFlowProductRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public OrderFreeFlowProductRequest setCustomerFlowRequestId(String customerFlowRequestId) {
        this.customerFlowRequestId = customerFlowRequestId;
        return this;
    }
    public String getCustomerFlowRequestId() {
        return this.customerFlowRequestId;
    }

    public OrderFreeFlowProductRequest setFlowProductId(String flowProductId) {
        this.flowProductId = flowProductId;
        return this;
    }
    public String getFlowProductId() {
        return this.flowProductId;
    }

    public OrderFreeFlowProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OrderFreeFlowProductRequest setLasting(String lasting) {
        this.lasting = lasting;
        return this;
    }
    public String getLasting() {
        return this.lasting;
    }

    public OrderFreeFlowProductRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public OrderFreeFlowProductRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public OrderFreeFlowProductRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public OrderFreeFlowProductRequest setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

}
