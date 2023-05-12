// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteResolverRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverRuleRequest self = new DeleteResolverRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResolverRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteResolverRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
