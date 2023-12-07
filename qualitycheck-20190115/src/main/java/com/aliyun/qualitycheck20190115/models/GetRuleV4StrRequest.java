// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleV4StrRequest extends TeaModel {
    @NameInMap("IsSchemeData")
    public Integer isSchemeData;

    @NameInMap("RuleId")
    public Long ruleId;

    public static GetRuleV4StrRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleV4StrRequest self = new GetRuleV4StrRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleV4StrRequest setIsSchemeData(Integer isSchemeData) {
        this.isSchemeData = isSchemeData;
        return this;
    }
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    public GetRuleV4StrRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
