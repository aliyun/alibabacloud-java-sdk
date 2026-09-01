// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AnswerKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The unique ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The maximum number of context characters. Valid values: 1000 to 32000.</p>
     * 
     * <strong>example:</strong>
     * <p>16000</p>
     */
    @NameInMap("MaxContextChars")
    public Integer maxContextChars;

    /**
     * <p>The user query text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Summarize this year\&quot;s financial report</p>
     */
    @NameInMap("QueryText")
    public String queryText;

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
     * <p>Specifies whether to enable reranking. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RerankEnabled")
    public Boolean rerankEnabled;

    /**
     * <p>Specifies whether to return citation sources. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReturnSources")
    public Boolean returnSources;

    /**
     * <p>The similarity score threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("ScoreThreshold")
    public Double scoreThreshold;

    /**
     * <p>The search mode. Valid values: knn, rrf, precise, semantic, and balanced.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The system prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a minimal test prompt for security verification.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The number of results to recall during retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The supplementary user instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>Return a short summary and test result.</p>
     */
    @NameInMap("UserInstructions")
    public String userInstructions;

    public static AnswerKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        AnswerKnowledgeBaseRequest self = new AnswerKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public AnswerKnowledgeBaseRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public AnswerKnowledgeBaseRequest setMaxContextChars(Integer maxContextChars) {
        this.maxContextChars = maxContextChars;
        return this;
    }
    public Integer getMaxContextChars() {
        return this.maxContextChars;
    }

    public AnswerKnowledgeBaseRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public AnswerKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AnswerKnowledgeBaseRequest setRerankEnabled(Boolean rerankEnabled) {
        this.rerankEnabled = rerankEnabled;
        return this;
    }
    public Boolean getRerankEnabled() {
        return this.rerankEnabled;
    }

    public AnswerKnowledgeBaseRequest setReturnSources(Boolean returnSources) {
        this.returnSources = returnSources;
        return this;
    }
    public Boolean getReturnSources() {
        return this.returnSources;
    }

    public AnswerKnowledgeBaseRequest setScoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public Double getScoreThreshold() {
        return this.scoreThreshold;
    }

    public AnswerKnowledgeBaseRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public AnswerKnowledgeBaseRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public AnswerKnowledgeBaseRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public AnswerKnowledgeBaseRequest setUserInstructions(String userInstructions) {
        this.userInstructions = userInstructions;
        return this;
    }
    public String getUserInstructions() {
        return this.userInstructions;
    }

}
