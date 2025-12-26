// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgeBaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Strategy&quot;: &quot;rrf&quot;,
     *   &quot;RRFK&quot;:60,
     *   &quot;Weight&quot;: 0.5
     * }</p>
     */
    @NameInMap("HybridStrategyConfig")
    public String hybridStrategyConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;FilterCondition&quot;: &quot;and&quot;, 
     *     &quot;MetaDataFilters&quot;: [
     *         {
     *             &quot;Key&quot;: &quot;key1&quot;, 
     *             &quot;Value&quot;: &quot;value1&quot;, 
     *             &quot;Operator&quot;: &quot;==&quot;
     *         },
     *         {
     *             &quot;Key&quot;: &quot;key2&quot;, 
     *             &quot;Value&quot;: &quot;value2&quot;, 
     *             &quot;Operator&quot;: &quot;!=&quot;
     *         },
     *         {
     *             &quot;Key&quot;: &quot;file_name&quot;, 
     *             &quot;Value&quot;: &quot;prefix&quot;, 
     *             &quot;Operator&quot;: &quot;contains&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("MetaDataFilterConditions")
    public String metaDataFilterConditions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>dense</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <strong>example:</strong>
     * <p>{
     *    &quot;ConnectionId&quot;:&quot;conn-xxx&quot;,
     *     &quot;Model&quot;: &quot;qwen-max&quot;,
     *     &quot;TopK&quot;: 5
     * }</p>
     */
    @NameInMap("RerankConfig")
    public String rerankConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;ConnectionId&quot;:&quot;conn-xxx&quot;,
     *     &quot;Model&quot;: &quot;qwen-max&quot;,
     *     &quot;Temperature&quot;: 0.7,
     *     &quot;TopP&quot;: 0.9,
     *     &quot;PresencePenalty&quot;: 0.5,
     *     &quot;FrequencyPenalty&quot;: 0.5,
     *     &quot;Seed&quot;: 0,
     *     &quot;MaxTokens&quot;: 1024,
     *     &quot;Stop&quot;: [],
     *     &quot;EnableThinking&quot;: true
     * }</p>
     */
    @NameInMap("RewriteConfig")
    public String rewriteConfig;

    @NameInMap("ScoreThreshold")
    public Float scoreThreshold;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RetrieveKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgeBaseRequest self = new RetrieveKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgeBaseRequest setHybridStrategyConfig(String hybridStrategyConfig) {
        this.hybridStrategyConfig = hybridStrategyConfig;
        return this;
    }
    public String getHybridStrategyConfig() {
        return this.hybridStrategyConfig;
    }

    public RetrieveKnowledgeBaseRequest setMetaDataFilterConditions(String metaDataFilterConditions) {
        this.metaDataFilterConditions = metaDataFilterConditions;
        return this;
    }
    public String getMetaDataFilterConditions() {
        return this.metaDataFilterConditions;
    }

    public RetrieveKnowledgeBaseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RetrieveKnowledgeBaseRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public RetrieveKnowledgeBaseRequest setRerankConfig(String rerankConfig) {
        this.rerankConfig = rerankConfig;
        return this;
    }
    public String getRerankConfig() {
        return this.rerankConfig;
    }

    public RetrieveKnowledgeBaseRequest setRewriteConfig(String rewriteConfig) {
        this.rewriteConfig = rewriteConfig;
        return this;
    }
    public String getRewriteConfig() {
        return this.rewriteConfig;
    }

    public RetrieveKnowledgeBaseRequest setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    public RetrieveKnowledgeBaseRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public RetrieveKnowledgeBaseRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public RetrieveKnowledgeBaseRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
