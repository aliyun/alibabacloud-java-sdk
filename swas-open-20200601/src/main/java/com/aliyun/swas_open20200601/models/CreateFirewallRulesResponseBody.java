// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the firewall rules that you created.</p>
     */
    @NameInMap("FirewallRuleIds")
    public java.util.List<String> firewallRuleIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRulesResponseBody self = new CreateFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRulesResponseBody setFirewallRuleIds(java.util.List<String> firewallRuleIds) {
        this.firewallRuleIds = firewallRuleIds;
        return this;
    }
    public java.util.List<String> getFirewallRuleIds() {
        return this.firewallRuleIds;
    }

    public CreateFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
