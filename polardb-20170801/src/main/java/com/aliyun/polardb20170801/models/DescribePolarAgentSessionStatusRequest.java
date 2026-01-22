// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentSessionStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1e28530a0da2c4755f165b1b8b9a73c9</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
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
