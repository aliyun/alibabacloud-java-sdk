// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgeBaseResponseBody extends TeaModel {
    @NameInMap("KnowledgeBaseFileChunks")
    public java.util.List<KnowledgeBaseFileChunk> knowledgeBaseFileChunks;

    public static RetrieveKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgeBaseResponseBody self = new RetrieveKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgeBaseResponseBody setKnowledgeBaseFileChunks(java.util.List<KnowledgeBaseFileChunk> knowledgeBaseFileChunks) {
        this.knowledgeBaseFileChunks = knowledgeBaseFileChunks;
        return this;
    }
    public java.util.List<KnowledgeBaseFileChunk> getKnowledgeBaseFileChunks() {
        return this.knowledgeBaseFileChunks;
    }

}
