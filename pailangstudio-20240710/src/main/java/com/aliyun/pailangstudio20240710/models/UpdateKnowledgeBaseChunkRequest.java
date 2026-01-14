// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseChunkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("ChunkContent")
    public String chunkContent;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("ChunkStatus")
    public String chunkStatus;

    public static UpdateKnowledgeBaseChunkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseChunkRequest self = new UpdateKnowledgeBaseChunkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseChunkRequest setChunkContent(String chunkContent) {
        this.chunkContent = chunkContent;
        return this;
    }
    public String getChunkContent() {
        return this.chunkContent;
    }

    public UpdateKnowledgeBaseChunkRequest setChunkStatus(String chunkStatus) {
        this.chunkStatus = chunkStatus;
        return this;
    }
    public String getChunkStatus() {
        return this.chunkStatus;
    }

}
