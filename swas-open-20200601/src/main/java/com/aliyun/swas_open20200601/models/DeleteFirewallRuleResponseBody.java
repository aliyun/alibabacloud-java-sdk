// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteFirewallRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFirewallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallRuleResponseBody self = new DeleteFirewallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
