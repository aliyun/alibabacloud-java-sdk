// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RetrievalKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>财报</p>
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
     * <p>true</p>
     */
    @NameInMap("RerankEnabled")
    public Boolean rerankEnabled;

    /**
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("ScoreThreshold")
    public Double scoreThreshold;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    public static RetrievalKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrievalKnowledgeBaseRequest self = new RetrievalKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public RetrievalKnowledgeBaseRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public RetrievalKnowledgeBaseRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public RetrievalKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RetrievalKnowledgeBaseRequest setRerankEnabled(Boolean rerankEnabled) {
        this.rerankEnabled = rerankEnabled;
        return this;
    }
    public Boolean getRerankEnabled() {
        return this.rerankEnabled;
    }

    public RetrievalKnowledgeBaseRequest setScoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public Double getScoreThreshold() {
        return this.scoreThreshold;
    }

    public RetrievalKnowledgeBaseRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
