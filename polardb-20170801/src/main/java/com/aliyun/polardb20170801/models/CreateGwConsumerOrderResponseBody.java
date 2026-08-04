// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGwConsumerOrderResponseBody extends TeaModel {
    /**
     * <p>The redemption code used for subsequent activation.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;9&quot;</p>
     */
    @NameInMap("CreditToken")
    public String creditToken;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The ID of the AI gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-2ze24rr575j5b18cg</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The order ID returned after the order is placed.</p>
     * 
     * <strong>example:</strong>
     * <p>2035638*******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGwConsumerOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGwConsumerOrderResponseBody self = new CreateGwConsumerOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGwConsumerOrderResponseBody setCreditToken(String creditToken) {
        this.creditToken = creditToken;
        return this;
    }
    public String getCreditToken() {
        return this.creditToken;
    }

    public CreateGwConsumerOrderResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateGwConsumerOrderResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGwConsumerOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateGwConsumerOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
