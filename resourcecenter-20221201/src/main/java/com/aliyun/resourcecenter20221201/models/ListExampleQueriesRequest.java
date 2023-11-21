// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListExampleQueriesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListExampleQueriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExampleQueriesRequest self = new ListExampleQueriesRequest();
        return TeaModel.build(map, self);
    }

    public ListExampleQueriesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListExampleQueriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
