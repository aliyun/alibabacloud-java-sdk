// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class AcceptFulfillmentDecisionRequest extends TeaModel {
    @NameInMap("DecisionConclusion")
    public String decisionConclusion;

    @NameInMap("DecisionType")
    public String decisionType;

    @NameInMap("OrderId")
    public String orderId;

    public static AcceptFulfillmentDecisionRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptFulfillmentDecisionRequest self = new AcceptFulfillmentDecisionRequest();
        return TeaModel.build(map, self);
    }

    public AcceptFulfillmentDecisionRequest setDecisionConclusion(String decisionConclusion) {
        this.decisionConclusion = decisionConclusion;
        return this;
    }
    public String getDecisionConclusion() {
        return this.decisionConclusion;
    }

    public AcceptFulfillmentDecisionRequest setDecisionType(String decisionType) {
        this.decisionType = decisionType;
        return this;
    }
    public String getDecisionType() {
        return this.decisionType;
    }

    public AcceptFulfillmentDecisionRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
