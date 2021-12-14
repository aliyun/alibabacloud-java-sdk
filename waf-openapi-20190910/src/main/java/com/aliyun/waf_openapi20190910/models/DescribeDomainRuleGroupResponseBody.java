// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainRuleGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleGroupId")
    public Long ruleGroupId;

    public static DescribeDomainRuleGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRuleGroupResponseBody self = new DescribeDomainRuleGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRuleGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRuleGroupResponseBody setRuleGroupId(Long ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

}
