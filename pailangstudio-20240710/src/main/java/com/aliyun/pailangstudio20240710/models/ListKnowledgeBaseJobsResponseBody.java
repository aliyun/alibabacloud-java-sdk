// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseJobsResponseBody extends TeaModel {
    @NameInMap("KnowledgeBaseJobs")
    public java.util.List<KnowledgeBaseJob> knowledgeBaseJobs;

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
     * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKnowledgeBaseJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseJobsResponseBody self = new ListKnowledgeBaseJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseJobsResponseBody setKnowledgeBaseJobs(java.util.List<KnowledgeBaseJob> knowledgeBaseJobs) {
        this.knowledgeBaseJobs = knowledgeBaseJobs;
        return this;
    }
    public java.util.List<KnowledgeBaseJob> getKnowledgeBaseJobs() {
        return this.knowledgeBaseJobs;
    }

    public ListKnowledgeBaseJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBaseJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKnowledgeBaseJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
