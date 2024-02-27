// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public String ruleId;

    public static CreateExpressConnectTrafficQosRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosRuleResponseBody self = new CreateExpressConnectTrafficQosRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosRuleResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateExpressConnectTrafficQosRuleResponseBody setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public CreateExpressConnectTrafficQosRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExpressConnectTrafficQosRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
