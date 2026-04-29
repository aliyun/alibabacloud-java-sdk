// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawMCPServersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;dev-mcp-server&quot;: &quot;{\&quot;args\&quot;:[\&quot;-y\&quot;,\&quot;@polarclaw/mcp-dev\&quot;],\&quot;command\&quot;:\&quot;node\&quot;}&quot;
     * }</p>
     */
    @NameInMap("Servers")
    public java.util.Map<String, ?> servers;

    public static DescribePolarClawMCPServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawMCPServersResponseBody self = new DescribePolarClawMCPServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawMCPServersResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawMCPServersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawMCPServersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawMCPServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawMCPServersResponseBody setServers(java.util.Map<String, ?> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.Map<String, ?> getServers() {
        return this.servers;
    }

}
