// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateLLMConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apikey-***</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
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
     * <p>llm-config1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Rps")
    public Integer rps;

    public static UpdateLLMConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLLMConfigRequest self = new UpdateLLMConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLLMConfigRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public UpdateLLMConfigRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public UpdateLLMConfigRequest setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public UpdateLLMConfigRequest setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public UpdateLLMConfigRequest setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public UpdateLLMConfigRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateLLMConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLLMConfigRequest setRps(Integer rps) {
        this.rps = rps;
        return this;
    }
    public Integer getRps() {
        return this.rps;
    }

}
