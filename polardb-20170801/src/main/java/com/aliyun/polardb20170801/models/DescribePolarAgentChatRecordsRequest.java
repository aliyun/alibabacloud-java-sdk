// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentChatRecordsRequest extends TeaModel {
    /**
     * <p>The session ID. To obtain the SessionId, use Signature Version 3.0 to call GetPolarAgent to initiate a conversation and extract the SessionId from the returned stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>44dcdf31-04cd-4a44-9bae-834dd6657e29</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The product type source. Valid value: polardb-console.</p>
     * 
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
