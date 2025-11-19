// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateOrderShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DynamicProductParams")
    public String dynamicProductParamsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OrderFrom")
    public String orderFrom;

    @NameInMap("SessionId")
    public String sessionId;

    public static CreateOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderShrinkRequest self = new CreateOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateOrderShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateOrderShrinkRequest setDynamicProductParamsShrink(String dynamicProductParamsShrink) {
        this.dynamicProductParamsShrink = dynamicProductParamsShrink;
        return this;
    }
    public String getDynamicProductParamsShrink() {
        return this.dynamicProductParamsShrink;
    }

    public CreateOrderShrinkRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CreateOrderShrinkRequest setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
        return this;
    }
    public String getOrderFrom() {
        return this.orderFrom;
    }

    public CreateOrderShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
