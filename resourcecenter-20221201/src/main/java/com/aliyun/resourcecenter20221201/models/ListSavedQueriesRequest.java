// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListSavedQueriesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 50.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListSavedQueriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSavedQueriesRequest self = new ListSavedQueriesRequest();
        return TeaModel.build(map, self);
    }

    public ListSavedQueriesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListSavedQueriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
