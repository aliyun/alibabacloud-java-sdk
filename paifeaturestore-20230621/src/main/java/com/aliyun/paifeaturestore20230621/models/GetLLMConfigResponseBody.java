// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetLLMConfigResponseBody extends TeaModel {
    /**
     * <p>The API key.</p>
     * 
     * <strong>example:</strong>
     * <p>api-abcdxy</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The base URL for API calls.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("BaseUrl")
    public String baseUrl;

    /**
     * <p>The batch size.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <p>The embedding dimension. If this parameter is unspecified or set to 0, the system uses the model\&quot;s default dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>Indicates whether fusion is enabled.</p>
     */
    @NameInMap("EnableFusion")
    public Boolean enableFusion;

    /**
     * <p>The time when the configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-04T11:26:09.036+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the configuration was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-04T11:26:09.036+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The ID of the LLM call configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_config1</p>
     */
    @NameInMap("LLMConfigId")
    public String LLMConfigId;

    /**
     * <p>The maximum number of tokens in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("MaxTokens")
    public Integer maxTokens;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The type of the model.</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The name of the LLM call configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_config_name1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C03B2680-AC9C-59CD-93C5-8142B92537FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of requests allowed per second.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Rps")
    public Integer rps;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetLLMConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLLMConfigResponseBody self = new GetLLMConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLLMConfigResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public GetLLMConfigResponseBody setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public GetLLMConfigResponseBody setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public GetLLMConfigResponseBody setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public GetLLMConfigResponseBody setEnableFusion(Boolean enableFusion) {
        this.enableFusion = enableFusion;
        return this;
    }
    public Boolean getEnableFusion() {
        return this.enableFusion;
    }

    public GetLLMConfigResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetLLMConfigResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetLLMConfigResponseBody setLLMConfigId(String LLMConfigId) {
        this.LLMConfigId = LLMConfigId;
        return this;
    }
    public String getLLMConfigId() {
        return this.LLMConfigId;
    }

    public GetLLMConfigResponseBody setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public GetLLMConfigResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetLLMConfigResponseBody setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public GetLLMConfigResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLLMConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLLMConfigResponseBody setRps(Integer rps) {
        this.rps = rps;
        return this;
    }
    public Integer getRps() {
        return this.rps;
    }

    public GetLLMConfigResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
