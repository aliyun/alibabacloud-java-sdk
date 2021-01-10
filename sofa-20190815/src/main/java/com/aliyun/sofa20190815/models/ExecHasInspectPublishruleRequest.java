// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPublishruleRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectPublishruleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPublishruleRequest self = new ExecHasInspectPublishruleRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPublishruleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ExecHasInspectPublishruleRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
