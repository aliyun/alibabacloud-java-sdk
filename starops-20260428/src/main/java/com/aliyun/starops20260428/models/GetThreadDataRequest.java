// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetThreadDataRequest extends TeaModel {
    /**
     * <p>The maximum number of session entries to return. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static GetThreadDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThreadDataRequest self = new GetThreadDataRequest();
        return TeaModel.build(map, self);
    }

    public GetThreadDataRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetThreadDataRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
