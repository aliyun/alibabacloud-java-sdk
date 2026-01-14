// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseChunkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateKnowledgeBaseChunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseChunkResponseBody self = new UpdateKnowledgeBaseChunkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseChunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
