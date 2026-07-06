// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class BindAgentStorage2VpcResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>remua-agent-test.cn-beijing.vpc.ots.aliyuncs.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.<strong>.</strong>*.34</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The request ID, which can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindAgentStorage2VpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAgentStorage2VpcResponseBody self = new BindAgentStorage2VpcResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAgentStorage2VpcResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BindAgentStorage2VpcResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public BindAgentStorage2VpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
