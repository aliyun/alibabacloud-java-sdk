// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateAutoGroupingRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7701451-340B-5CB3-AEA7-7D831F7F38C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-acfo******hy6a</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static CreateAutoGroupingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoGroupingRuleResponseBody self = new CreateAutoGroupingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoGroupingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoGroupingRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
