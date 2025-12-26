// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C25324E3-18E6-50D8-9026-16D74AAEEB26</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseResponseBody self = new DeleteKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
