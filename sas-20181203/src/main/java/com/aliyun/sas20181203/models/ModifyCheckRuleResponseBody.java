// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCheckRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CD380235-A0B8-540D-A0D5-D6288446****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static ModifyCheckRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCheckRuleResponseBody self = new ModifyCheckRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCheckRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCheckRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
