// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectRuleRequest extends TeaModel {
    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("RuleId")
    public String ruleId;

    public static UpdateHasInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectRuleRequest self = new UpdateHasInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectRuleRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasInspectRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
