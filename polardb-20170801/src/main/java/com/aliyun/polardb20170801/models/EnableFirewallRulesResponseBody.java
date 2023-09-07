// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableFirewallRulesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableFirewallRulesResponseBody self = new EnableFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableFirewallRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableFirewallRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
