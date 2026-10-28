// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class ListMessagesRequest extends TeaModel {
    /**
     * <p>The maximum number of timeline entries to return per page. The value must be a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first request. For subsequent requests, use the value returned from the previous page.</p>
     * 
     * <strong>example:</strong>
     * <p>example-next-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Filters messages by the specified run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>run_example_001</p>
     */
    @NameInMap("runId")
    public String runId;

    public static ListMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesRequest self = new ListMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListMessagesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListMessagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMessagesRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

}
