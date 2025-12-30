// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteMultimodalEmbeddingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar4ai_multimodal_embedding_****</p>
     */
    @NameInMap("Embedding")
    public String embedding;

    public static DeleteMultimodalEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultimodalEmbeddingRequest self = new DeleteMultimodalEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultimodalEmbeddingRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteMultimodalEmbeddingRequest setEmbedding(String embedding) {
        this.embedding = embedding;
        return this;
    }
    public String getEmbedding() {
        return this.embedding;
    }

}
