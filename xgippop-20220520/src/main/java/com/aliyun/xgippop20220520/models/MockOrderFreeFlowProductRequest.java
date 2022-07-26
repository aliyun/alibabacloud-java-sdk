// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class MockOrderFreeFlowProductRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CustomerFlowRequestId")
    public String customerFlowRequestId;

    @NameInMap("FlowProductId")
    public String flowProductId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lasting")
    public String lasting;

    @NameInMap("MobileNumber")
    public String mobileNumber;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PurchaseOrderId")
    public String purchaseOrderId;

    public static MockOrderFreeFlowProductRequest build(java.util.Map<String, ?> map) throws Exception {
        MockOrderFreeFlowProductRequest self = new MockOrderFreeFlowProductRequest();
        return TeaModel.build(map, self);
    }

    public MockOrderFreeFlowProductRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public MockOrderFreeFlowProductRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public MockOrderFreeFlowProductRequest setCustomerFlowRequestId(String customerFlowRequestId) {
        this.customerFlowRequestId = customerFlowRequestId;
        return this;
    }
    public String getCustomerFlowRequestId() {
        return this.customerFlowRequestId;
    }

    public MockOrderFreeFlowProductRequest setFlowProductId(String flowProductId) {
        this.flowProductId = flowProductId;
        return this;
    }
    public String getFlowProductId() {
        return this.flowProductId;
    }

    public MockOrderFreeFlowProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MockOrderFreeFlowProductRequest setLasting(String lasting) {
        this.lasting = lasting;
        return this;
    }
    public String getLasting() {
        return this.lasting;
    }

    public MockOrderFreeFlowProductRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public MockOrderFreeFlowProductRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public MockOrderFreeFlowProductRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public MockOrderFreeFlowProductRequest setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

}
