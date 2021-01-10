// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleapplyforupdateRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectRuleapplyforupdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleapplyforupdateRequest self = new ExecHasInspectRuleapplyforupdateRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleapplyforupdateRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ExecHasInspectRuleapplyforupdateRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
