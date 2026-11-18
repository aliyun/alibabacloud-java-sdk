// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListCustomDomainsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page, used for subsequent queries.</p>
     * 
     * <strong>example:</strong>
     * <p>example-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListCustomDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsRequest self = new ListCustomDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomDomainsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
