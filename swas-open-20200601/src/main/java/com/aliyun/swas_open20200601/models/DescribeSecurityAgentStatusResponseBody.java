// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeSecurityAgentStatusResponseBody extends TeaModel {
    @NameInMap("ClientStatus")
    public String clientStatus;

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
