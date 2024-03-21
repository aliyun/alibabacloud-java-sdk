// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetAlipayUrlRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ReturnUrl")
    public String returnUrl;

    @NameInMap("Type")
    public String type;

    public static GetAlipayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlRequest self = new GetAlipayUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetAlipayUrlRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetAlipayUrlRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public GetAlipayUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
