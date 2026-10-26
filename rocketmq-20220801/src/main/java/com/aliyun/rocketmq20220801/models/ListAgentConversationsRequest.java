// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListAgentConversationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJpZCI6IjAxOThjOGE5In0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("purpose")
    public String purpose;

    /**
     * <strong>example:</strong>
     * <p>消息堆积</p>
     */
    @NameInMap("q")
    public String q;

    public static ListAgentConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentConversationsRequest self = new ListAgentConversationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentConversationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentConversationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentConversationsRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public ListAgentConversationsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

}
