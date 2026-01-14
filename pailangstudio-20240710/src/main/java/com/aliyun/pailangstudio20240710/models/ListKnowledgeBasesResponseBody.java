// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesResponseBody extends TeaModel {
    @NameInMap("KnowledgeBases")
    public java.util.List<KnowledgeBase> knowledgeBases;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>35686626-8D83-5ADE-B400-08A6613A6057</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesResponseBody self = new ListKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesResponseBody setKnowledgeBases(java.util.List<KnowledgeBase> knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
        return this;
    }
    public java.util.List<KnowledgeBase> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public ListKnowledgeBasesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBasesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
