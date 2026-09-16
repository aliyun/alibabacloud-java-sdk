// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RegisterAIDBClusterCustomModelRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-model-bucket</p>
     */
    @NameInMap("CustomOssBucketName")
    public String customOssBucketName;

    /**
     * <p>The model path within the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>models/qwen3</p>
     */
    @NameInMap("CustomOssBucketPath")
    public String customOssBucketPath;

    /**
     * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2ze4x2mwo81knj08a</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The display name shown in the candidate list and the initial client-facing invocation name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-qwen3</p>
     */
    @NameInMap("DisplayModelName")
    public String displayModelName;

    /**
     * <p>The custom model registration key and model directory name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-32B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RegisterAIDBClusterCustomModelRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAIDBClusterCustomModelRequest self = new RegisterAIDBClusterCustomModelRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAIDBClusterCustomModelRequest setCustomOssBucketName(String customOssBucketName) {
        this.customOssBucketName = customOssBucketName;
        return this;
    }
    public String getCustomOssBucketName() {
        return this.customOssBucketName;
    }

    public RegisterAIDBClusterCustomModelRequest setCustomOssBucketPath(String customOssBucketPath) {
        this.customOssBucketPath = customOssBucketPath;
        return this;
    }
    public String getCustomOssBucketPath() {
        return this.customOssBucketPath;
    }

    public RegisterAIDBClusterCustomModelRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RegisterAIDBClusterCustomModelRequest setDisplayModelName(String displayModelName) {
        this.displayModelName = displayModelName;
        return this;
    }
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    public RegisterAIDBClusterCustomModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RegisterAIDBClusterCustomModelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
