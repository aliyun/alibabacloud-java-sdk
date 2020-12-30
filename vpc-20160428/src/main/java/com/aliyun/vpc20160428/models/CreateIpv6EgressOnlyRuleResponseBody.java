// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6EgressOnlyRuleResponseBody extends TeaModel {
    @NameInMap("Ipv6EgressRuleId")
    public String ipv6EgressRuleId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpv6EgressOnlyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6EgressOnlyRuleResponseBody self = new CreateIpv6EgressOnlyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpv6EgressOnlyRuleResponseBody setIpv6EgressRuleId(String ipv6EgressRuleId) {
        this.ipv6EgressRuleId = ipv6EgressRuleId;
        return this;
    }
    public String getIpv6EgressRuleId() {
        return this.ipv6EgressRuleId;
    }

    public CreateIpv6EgressOnlyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
