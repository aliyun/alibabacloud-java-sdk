// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AnswerKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>R3BGbnBqcXN******.2a5a23c9-******-179970533d30</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static AnswerKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnswerKnowledgeBaseResponseBody self = new AnswerKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public AnswerKnowledgeBaseResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public AnswerKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnswerKnowledgeBaseResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
