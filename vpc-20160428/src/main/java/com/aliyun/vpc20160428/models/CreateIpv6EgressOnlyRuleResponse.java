// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6EgressOnlyRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ipv6EgressRuleId")
    @Validation(required = true)
    public String ipv6EgressRuleId;

    public static CreateIpv6EgressOnlyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6EgressOnlyRuleResponse self = new CreateIpv6EgressOnlyRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpv6EgressOnlyRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpv6EgressOnlyRuleResponse setIpv6EgressRuleId(String ipv6EgressRuleId) {
        this.ipv6EgressRuleId = ipv6EgressRuleId;
        return this;
    }
    public String getIpv6EgressRuleId() {
        return this.ipv6EgressRuleId;
    }

}
