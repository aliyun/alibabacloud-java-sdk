// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class EnableFirewallRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableFirewallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableFirewallRuleResponseBody self = new EnableFirewallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableFirewallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
