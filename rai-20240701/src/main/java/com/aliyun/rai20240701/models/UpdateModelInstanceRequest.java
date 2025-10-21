// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateModelInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vllm==0.9.0</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>eas-m-12345678</p>
     */
    @NameInMap("EasServiceId")
    public String easServiceId;

    /**
     * <strong>example:</strong>
     * <p>rai_content_detection_model</p>
     */
    @NameInMap("EasServiceName")
    public String easServiceName;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("ModelCallName")
    public String modelCallName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelCategoryId")
    public Long modelCategoryId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ModelInstanceId")
    public Long modelInstanceId;

    /**
     * <strong>example:</strong>
     * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
     */
    @NameInMap("ModelToken")
    public String modelToken;

    /**
     * <strong>example:</strong>
     * <p><a href="http://12345*****.cn-shanghai.aliyuncs.com/api/predict/echo">http://12345*****.cn-shanghai.aliyuncs.com/api/predict/echo</a></p>
     */
    @NameInMap("ModelUrl")
    public String modelUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="http://12345*****.vpc.cn-shanghai.aliyuncs.com/api/predict/demo">http://12345*****.vpc.cn-shanghai.aliyuncs.com/api/predict/demo</a></p>
     */
    @NameInMap("ModelVpcUrl")
    public String modelVpcUrl;

    /**
     * <strong>example:</strong>
     * <p>608226</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static UpdateModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelInstanceRequest self = new UpdateModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelInstanceRequest setEasServiceId(String easServiceId) {
        this.easServiceId = easServiceId;
        return this;
    }
    public String getEasServiceId() {
        return this.easServiceId;
    }

    public UpdateModelInstanceRequest setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public UpdateModelInstanceRequest setModelCallName(String modelCallName) {
        this.modelCallName = modelCallName;
        return this;
    }
    public String getModelCallName() {
        return this.modelCallName;
    }

    public UpdateModelInstanceRequest setModelCategoryId(Long modelCategoryId) {
        this.modelCategoryId = modelCategoryId;
        return this;
    }
    public Long getModelCategoryId() {
        return this.modelCategoryId;
    }

    public UpdateModelInstanceRequest setModelInstanceId(Long modelInstanceId) {
        this.modelInstanceId = modelInstanceId;
        return this;
    }
    public Long getModelInstanceId() {
        return this.modelInstanceId;
    }

    public UpdateModelInstanceRequest setModelToken(String modelToken) {
        this.modelToken = modelToken;
        return this;
    }
    public String getModelToken() {
        return this.modelToken;
    }

    public UpdateModelInstanceRequest setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public UpdateModelInstanceRequest setModelVpcUrl(String modelVpcUrl) {
        this.modelVpcUrl = modelVpcUrl;
        return this;
    }
    public String getModelVpcUrl() {
        return this.modelVpcUrl;
    }

    public UpdateModelInstanceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
