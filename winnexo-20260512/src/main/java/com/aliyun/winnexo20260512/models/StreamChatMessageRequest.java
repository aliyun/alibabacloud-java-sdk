// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class StreamChatMessageRequest extends TeaModel {
    /**
     * <p>上次接收到的 SSE event id，用于断线续推；不传则从头全量回放</p>
     * 
     * <strong>example:</strong>
     * <p>5-1683456789012</p>
     */
    @NameInMap("lastEventId")
    public String lastEventId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
