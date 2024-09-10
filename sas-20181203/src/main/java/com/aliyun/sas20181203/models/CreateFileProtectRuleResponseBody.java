// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileProtectRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC7C8984-D108-516F-9D36-3DF1D1228CCA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static CreateFileProtectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileProtectRuleResponseBody self = new CreateFileProtectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileProtectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileProtectRuleResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
