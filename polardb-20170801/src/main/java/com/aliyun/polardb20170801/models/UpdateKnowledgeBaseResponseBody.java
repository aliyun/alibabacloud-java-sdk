// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the asynchronous configuration task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static UpdateKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseResponseBody self = new UpdateKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseResponseBody setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKnowledgeBaseResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
