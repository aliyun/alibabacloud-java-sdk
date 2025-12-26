// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>48E6392E-C3C9-5212-9FAD-13256ABD9AF6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKnowledgeBaseJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseJobResponseBody self = new DeleteKnowledgeBaseJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
