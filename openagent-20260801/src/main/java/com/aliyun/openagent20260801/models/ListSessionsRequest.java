// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class ListSessionsRequest extends TeaModel {
    /**
     * <p>The maximum number of sessions to return per page. The value must be a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first request. For subsequent requests, pass the nextToken value returned in the previous response. Do not parse or construct this value.</p>
     * 
     * <strong>example:</strong>
     * <p>example-next-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsRequest self = new ListSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
