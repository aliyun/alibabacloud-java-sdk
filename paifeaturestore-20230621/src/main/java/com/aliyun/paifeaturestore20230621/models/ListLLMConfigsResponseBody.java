// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLLMConfigsResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("LLMConfigs")
    public java.util.List<ListLLMConfigsResponseBodyLLMConfigs> LLMConfigs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mbU5D/SFHCHMApYkMcWlp5</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>898DB17C-09E9-5C41-909D-269BA183EB92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLLMConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLLMConfigsResponseBody self = new ListLLMConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLLMConfigsResponseBody setLLMConfigs(java.util.List<ListLLMConfigsResponseBodyLLMConfigs> LLMConfigs) {
        this.LLMConfigs = LLMConfigs;
        return this;
    }
    public java.util.List<ListLLMConfigsResponseBodyLLMConfigs> getLLMConfigs() {
        return this.LLMConfigs;
    }

    public ListLLMConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLLMConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLLMConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLLMConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLLMConfigsResponseBodyLLMConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>apikey-abcdxy</p>
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
         * <p>1024</p>
         */
        @NameInMap("EmbeddingDimension")
        public Integer embeddingDimension;

        /**
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>llm_config1</p>
         */
        @NameInMap("LLMConfigId")
        public String LLMConfigId;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        /**
         * <strong>example:</strong>
         * <p>text-embedding-v1</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>llm_config_name1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2vtzqjaohzqi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Rps")
        public Integer rps;

        /**
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListLLMConfigsResponseBodyLLMConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListLLMConfigsResponseBodyLLMConfigs self = new ListLLMConfigsResponseBodyLLMConfigs();
            return TeaModel.build(map, self);
        }

        public ListLLMConfigsResponseBodyLLMConfigs setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setEmbeddingDimension(Integer embeddingDimension) {
            this.embeddingDimension = embeddingDimension;
            return this;
        }
        public Integer getEmbeddingDimension() {
            return this.embeddingDimension;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setLLMConfigId(String LLMConfigId) {
            this.LLMConfigId = LLMConfigId;
            return this;
        }
        public String getLLMConfigId() {
            return this.LLMConfigId;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setRps(Integer rps) {
            this.rps = rps;
            return this;
        }
        public Integer getRps() {
            return this.rps;
        }

        public ListLLMConfigsResponseBodyLLMConfigs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
