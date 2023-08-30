// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeSecurityAgentStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the Security Center agent. Valid values:</p>
     * <br>
     * <p>*   pause: The Security Center agent suspends protection for your server.</p>
     * <p>*   online: The Security Center agent is protecting your server.</p>
     * <p>*   offline: The Security Center agent does not protect your server.</p>
     */
    @NameInMap("ClientStatus")
    public String clientStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityAgentStatusResponseBody self = new DescribeSecurityAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityAgentStatusResponseBody setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
        return this;
    }
    public String getClientStatus() {
        return this.clientStatus;
    }

    public DescribeSecurityAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
