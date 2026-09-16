// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RegisterAIDBClusterCustomModelResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the registration is newly created. A value of false indicates that an existing registration was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Created")
    public Boolean created;

    /**
     * <p>The display name and initial client-facing invocation name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-qwen3</p>
     */
    @NameInMap("DisplayModelName")
    public String displayModelName;

    /**
     * <p>The model registration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ModelId")
    public Long modelId;

    /**
     * <p>The custom model registration key.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-32B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The normalized OSS path.</p>
     * 
     * <strong>example:</strong>
     * <p>/my-model-bucket/models/qwen3</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterAIDBClusterCustomModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterAIDBClusterCustomModelResponseBody self = new RegisterAIDBClusterCustomModelResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterAIDBClusterCustomModelResponseBody setCreated(Boolean created) {
        this.created = created;
        return this;
    }
    public Boolean getCreated() {
        return this.created;
    }

    public RegisterAIDBClusterCustomModelResponseBody setDisplayModelName(String displayModelName) {
        this.displayModelName = displayModelName;
        return this;
    }
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    public RegisterAIDBClusterCustomModelResponseBody setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public RegisterAIDBClusterCustomModelResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RegisterAIDBClusterCustomModelResponseBody setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public RegisterAIDBClusterCustomModelResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public RegisterAIDBClusterCustomModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
