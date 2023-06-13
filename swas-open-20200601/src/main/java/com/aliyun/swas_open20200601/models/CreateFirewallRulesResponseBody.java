// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRulesResponseBody self = new CreateFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
