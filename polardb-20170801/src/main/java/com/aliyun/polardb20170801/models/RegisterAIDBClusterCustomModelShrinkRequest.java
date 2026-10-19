// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RegisterAIDBClusterCustomModelShrinkRequest extends TeaModel {
    /**
     * <p>The container startup environment variables. Variable names cannot be empty or contain whitespace. Variable values can be empty strings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HF_HOME&quot;:&quot;/cache/hf&quot;,&quot;EMPTY_VALUE&quot;:&quot;&quot;}</p>
     */
    @NameInMap("ContainerEnv")
    public String containerEnvShrink;

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
     * <p>The model path in the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>models/qwen3</p>
     */
    @NameInMap("CustomOssBucketPath")
    public String customOssBucketPath;

    /**
     * <p>The GPU instance type used for model deployment. Required when configuring deployment parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb.gpu.gn8is.4xlarge</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The direct startup command for the model container.</p>
     * 
     * <strong>example:</strong>
     * <p>python -m vllm.entrypoints.openai.api_server</p>
     */
    @NameInMap("DirectCommand")
    public String directCommand;

    /**
     * <p>The display name in the candidate list and the initial invocation name for clients.</p>
     * 
     * <strong>example:</strong>
     * <p>my-qwen3</p>
     */
    @NameInMap("DisplayModelName")
    public String displayModelName;

    /**
     * <p>The full reference of the customer-owned inference image, in the format of registry/repository:tag.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/customer/model:v1</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The inference engine. Required when configuring deployment parameters. Valid values: vllm and sglang.</p>
     * 
     * <strong>example:</strong>
     * <p>vllm</p>
     */
    @NameInMap("InferenceEngine")
    public String inferenceEngine;

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
     * <p>The model startup parameters. Parameter keys must start with --.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;--max-model-len&quot;:&quot;32768&quot;}</p>
     */
    @NameInMap("ModelParams")
    public String modelParamsShrink;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The password or temporary token for the customer image repository. Required when ImageName is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>temporary-token</p>
     */
    @NameInMap("RegistryPassword")
    public String registryPassword;

    /**
     * <p>The username for the customer image repository. Required when ImageName is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>temporary-user</p>
     */
    @NameInMap("RegistryUsername")
    public String registryUsername;

    public static RegisterAIDBClusterCustomModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAIDBClusterCustomModelShrinkRequest self = new RegisterAIDBClusterCustomModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setContainerEnvShrink(String containerEnvShrink) {
        this.containerEnvShrink = containerEnvShrink;
        return this;
    }
    public String getContainerEnvShrink() {
        return this.containerEnvShrink;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setCustomOssBucketName(String customOssBucketName) {
        this.customOssBucketName = customOssBucketName;
        return this;
    }
    public String getCustomOssBucketName() {
        return this.customOssBucketName;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setCustomOssBucketPath(String customOssBucketPath) {
        this.customOssBucketPath = customOssBucketPath;
        return this;
    }
    public String getCustomOssBucketPath() {
        return this.customOssBucketPath;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setDirectCommand(String directCommand) {
        this.directCommand = directCommand;
        return this;
    }
    public String getDirectCommand() {
        return this.directCommand;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setDisplayModelName(String displayModelName) {
        this.displayModelName = displayModelName;
        return this;
    }
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setInferenceEngine(String inferenceEngine) {
        this.inferenceEngine = inferenceEngine;
        return this;
    }
    public String getInferenceEngine() {
        return this.inferenceEngine;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setModelParamsShrink(String modelParamsShrink) {
        this.modelParamsShrink = modelParamsShrink;
        return this;
    }
    public String getModelParamsShrink() {
        return this.modelParamsShrink;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setRegistryPassword(String registryPassword) {
        this.registryPassword = registryPassword;
        return this;
    }
    public String getRegistryPassword() {
        return this.registryPassword;
    }

    public RegisterAIDBClusterCustomModelShrinkRequest setRegistryUsername(String registryUsername) {
        this.registryUsername = registryUsername;
        return this;
    }
    public String getRegistryUsername() {
        return this.registryUsername;
    }

}
