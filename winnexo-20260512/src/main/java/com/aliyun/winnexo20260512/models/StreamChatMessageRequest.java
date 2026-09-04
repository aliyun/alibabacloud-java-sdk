// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class StreamChatMessageRequest extends TeaModel {
    /**
     * <p>The last received SSE event ID, used for resuming delivery after a disconnection. If this parameter is not specified, full replay starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>5-1683456789012</p>
     */
    @NameInMap("lastEventId")
    public String lastEventId;

    /**
     * <p>The ID of the tenant for which the subscription takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static StreamChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        StreamChatMessageRequest self = new StreamChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public StreamChatMessageRequest setLastEventId(String lastEventId) {
        this.lastEventId = lastEventId;
        return this;
    }
    public String getLastEventId() {
        return this.lastEventId;
    }

    public StreamChatMessageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
