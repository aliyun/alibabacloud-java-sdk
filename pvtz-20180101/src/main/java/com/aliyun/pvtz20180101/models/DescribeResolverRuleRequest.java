// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RuleId")
    public String ruleId;

    public static DescribeResolverRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRuleRequest self = new DescribeResolverRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeResolverRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
