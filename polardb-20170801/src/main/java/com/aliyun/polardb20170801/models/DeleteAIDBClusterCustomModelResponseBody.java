// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterCustomModelResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the deletion was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Deleted")
    public Boolean deleted;

    /**
     * <p>The ID of the deleted model registration.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ModelId")
    public Long modelId;

    /**
     * <p>The key of the deleted custom model registration.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-32B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIDBClusterCustomModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterCustomModelResponseBody self = new DeleteAIDBClusterCustomModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterCustomModelResponseBody setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteAIDBClusterCustomModelResponseBody setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public DeleteAIDBClusterCustomModelResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DeleteAIDBClusterCustomModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
