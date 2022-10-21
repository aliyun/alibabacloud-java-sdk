// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleV4Request extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetRuleV4Request build(java.util.Map<String, ?> map) throws Exception {
        GetRuleV4Request self = new GetRuleV4Request();
        return TeaModel.build(map, self);
    }

    public GetRuleV4Request setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
