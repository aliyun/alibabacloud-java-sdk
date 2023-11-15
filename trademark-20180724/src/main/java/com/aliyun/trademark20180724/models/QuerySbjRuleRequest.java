// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySbjRuleRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("RuleId")
    public String ruleId;

    public static QuerySbjRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySbjRuleRequest self = new QuerySbjRuleRequest();
        return TeaModel.build(map, self);
    }

    public QuerySbjRuleRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySbjRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
