// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class SetDomainRuleGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDomainRuleGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRuleGroupResponseBody self = new SetDomainRuleGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainRuleGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
