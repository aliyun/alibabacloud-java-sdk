// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListWarmPoolsRequest extends TeaModel {
    /**
     * <p>The actual maximum number of results returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>example-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListWarmPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWarmPoolsRequest self = new ListWarmPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListWarmPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWarmPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
