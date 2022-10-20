// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleByIdRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetRuleByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleByIdRequest self = new GetRuleByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleByIdRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
