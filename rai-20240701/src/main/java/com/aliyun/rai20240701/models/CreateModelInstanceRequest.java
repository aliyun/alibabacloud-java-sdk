// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateModelInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eas-m-12345678</p>
     */
    @NameInMap("EasServiceId")
    public String easServiceId;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
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
     * <p>EAS Token</p>
     * 
     * <strong>example:</strong>
     * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
     */
    @NameInMap("ModelToken")
    public String modelToken;

    /**
     * <strong>example:</strong>
     * <p><a href="http://12345*****.cn-shanghai.aliyuncs.com/api/predict/demo">http://12345*****.cn-shanghai.aliyuncs.com/api/predict/demo</a></p>
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
     * <p>643168</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelInstanceRequest self = new CreateModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelInstanceRequest setEasServiceId(String easServiceId) {
        this.easServiceId = easServiceId;
        return this;
    }
    public String getEasServiceId() {
        return this.easServiceId;
    }

    public CreateModelInstanceRequest setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public CreateModelInstanceRequest setModelCallName(String modelCallName) {
        this.modelCallName = modelCallName;
        return this;
    }
    public String getModelCallName() {
        return this.modelCallName;
    }

    public CreateModelInstanceRequest setModelCategoryId(Long modelCategoryId) {
        this.modelCategoryId = modelCategoryId;
        return this;
    }
    public Long getModelCategoryId() {
        return this.modelCategoryId;
    }

    public CreateModelInstanceRequest setModelToken(String modelToken) {
        this.modelToken = modelToken;
        return this;
    }
    public String getModelToken() {
        return this.modelToken;
    }

    public CreateModelInstanceRequest setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public CreateModelInstanceRequest setModelVpcUrl(String modelVpcUrl) {
        this.modelVpcUrl = modelVpcUrl;
        return this;
    }
    public String getModelVpcUrl() {
        return this.modelVpcUrl;
    }

    public CreateModelInstanceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
