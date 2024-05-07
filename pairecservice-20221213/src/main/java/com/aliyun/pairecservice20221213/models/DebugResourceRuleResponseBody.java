// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DebugResourceRuleResponseBody extends TeaModel {
    @NameInMap("CurrentValues")
    public java.util.Map<String, ?> currentValues;

    @NameInMap("OutputValues")
    public java.util.Map<String, ?> outputValues;

    @NameInMap("RequestId")
    public String requestId;

    public static DebugResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugResourceRuleResponseBody self = new DebugResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugResourceRuleResponseBody setCurrentValues(java.util.Map<String, ?> currentValues) {
        this.currentValues = currentValues;
        return this;
    }
    public java.util.Map<String, ?> getCurrentValues() {
        return this.currentValues;
    }

    public DebugResourceRuleResponseBody setOutputValues(java.util.Map<String, ?> outputValues) {
        this.outputValues = outputValues;
        return this;
    }
    public java.util.Map<String, ?> getOutputValues() {
        return this.outputValues;
    }

    public DebugResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
