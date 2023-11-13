// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListExampleQueriesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

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
