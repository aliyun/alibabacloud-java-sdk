// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TriggerKnowledgeBaseSyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerKnowledgeBaseSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerKnowledgeBaseSyncResponseBody self = new TriggerKnowledgeBaseSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerKnowledgeBaseSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
