// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the firewall rule.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFirewallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRuleResponseBody self = new CreateFirewallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRuleResponseBody setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public CreateFirewallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
