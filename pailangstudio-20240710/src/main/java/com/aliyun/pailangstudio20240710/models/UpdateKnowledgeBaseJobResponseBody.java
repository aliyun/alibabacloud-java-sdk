// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>35686626-8D83-5ADE-B400-08A6613A6057</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateKnowledgeBaseJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseJobResponseBody self = new UpdateKnowledgeBaseJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
