// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentChatRecordsRequest extends TeaModel {
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

    public static DescribePolarAgentChatRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentChatRecordsRequest self = new DescribePolarAgentChatRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentChatRecordsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribePolarAgentChatRecordsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
