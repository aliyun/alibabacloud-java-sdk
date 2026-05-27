// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class FetchRemoteMcpToolsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;jsonrpc&quot;:&quot;2.0&quot;,&quot;id&quot;:1,&quot;result&quot;:{&quot;tools&quot;:[]}}</p>
     */
    @NameInMap("tools")
    public String tools;

    public static FetchRemoteMcpToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchRemoteMcpToolsResponseBody self = new FetchRemoteMcpToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchRemoteMcpToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchRemoteMcpToolsResponseBody setTools(String tools) {
        this.tools = tools;
        return this;
    }
    public String getTools() {
        return this.tools;
    }

}
