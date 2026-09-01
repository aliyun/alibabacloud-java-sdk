// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AnswerKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <strong>example:</strong>
     * <p>16000</p>
     */
    @NameInMap("MaxContextChars")
    public Integer maxContextChars;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>总结下今年财报</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RerankEnabled")
    public Boolean rerankEnabled;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReturnSources")
    public Boolean returnSources;

    /**
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("ScoreThreshold")
    public Double scoreThreshold;

    /**
     * <strong>example:</strong>
     * <p>semantic</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <strong>example:</strong>
     * <p>This is a minimal test prompt for security verification.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
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
