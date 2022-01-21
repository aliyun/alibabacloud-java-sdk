// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class PayResultCallbackRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PayStatus")
    public String payStatus;

    @NameInMap("PayTime")
    public String payTime;

    @NameInMap("Uid")
    public Long uid;

    public static PayResultCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PayResultCallbackRequest self = new PayResultCallbackRequest();
        return TeaModel.build(map, self);
    }

    public PayResultCallbackRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PayResultCallbackRequest setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public PayResultCallbackRequest setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public PayResultCallbackRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
