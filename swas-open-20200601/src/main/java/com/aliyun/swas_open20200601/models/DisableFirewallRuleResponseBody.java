// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DisableFirewallRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableFirewallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableFirewallRuleResponseBody self = new DisableFirewallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableFirewallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
