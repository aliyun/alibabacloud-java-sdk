// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLLMConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xyz</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("BaseUrl")
    public String baseUrl;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("MaxTokens")
    public Integer maxTokens;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_config1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Rps")
    public Integer rps;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateLLMConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLLMConfigRequest self = new CreateLLMConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLLMConfigRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateLLMConfigRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public CreateLLMConfigRequest setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public CreateLLMConfigRequest setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public CreateLLMConfigRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateLLMConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLLMConfigRequest setRps(Integer rps) {
        this.rps = rps;
        return this;
    }
    public Integer getRps() {
        return this.rps;
    }

    public CreateLLMConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
