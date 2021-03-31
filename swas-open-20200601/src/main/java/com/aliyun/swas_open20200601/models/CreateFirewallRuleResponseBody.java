// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FirewallId")
    public String firewallId;

    public static CreateFirewallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRuleResponseBody self = new CreateFirewallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFirewallRuleResponseBody setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

}
