// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseAnswerRequest extends TeaModel {
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
     * <p>The unique ID of the Q&amp;A task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>R3BGbnBqcXN******.2a5a23c9-******-179970533d30</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKnowledgeBaseAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseAnswerRequest self = new DescribeKnowledgeBaseAnswerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseAnswerRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DescribeKnowledgeBaseAnswerRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeKnowledgeBaseAnswerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
