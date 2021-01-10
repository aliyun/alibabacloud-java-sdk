// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleistestedRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectRuleistestedRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleistestedRequest self = new ExecHasInspectRuleistestedRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleistestedRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ExecHasInspectRuleistestedRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
