// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26E46541-7AAB-5565-801D-F14DBDC5F186</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the protection rules. Multiple IDs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>22215,23354,462165</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    public static CreateDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseRuleResponseBody self = new CreateDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefenseRuleResponseBody setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

}
