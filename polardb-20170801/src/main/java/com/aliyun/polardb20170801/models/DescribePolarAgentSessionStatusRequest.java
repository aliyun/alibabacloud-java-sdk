// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentSessionStatusRequest extends TeaModel {
    /**
     * <p>The session ID, which is used to identify a visitor\&quot;s session and maintain context information. Usage notes: You can obtain this ID by calling the GetPolarAgent API and retrieving the SessionId field from the response. Note that GetPolarAgent requires Signature Version 3.0 and the SSE protocol. The ID must be in the standard UUID format, such as 1e28530a-0da2-c475-5f16-5b1b8b9a73c9.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1e28530a-0da2-c475-5f16-5b1b8b9a73c9</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The product source. Valid values: polardb-console.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb-console</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribePolarAgentSessionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentSessionStatusRequest self = new DescribePolarAgentSessionStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentSessionStatusRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribePolarAgentSessionStatusRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
