// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeSecurityAgentStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the Security Center agent. Valid values:</p>
     * <ul>
     * <li>pause: The Security Center agent suspends protection for your server.</li>
     * <li>online: The Security Center agent is protecting your server.</li>
     * <li>offline: The Security Center agent does not protect your server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("ClientStatus")
    public String clientStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
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
