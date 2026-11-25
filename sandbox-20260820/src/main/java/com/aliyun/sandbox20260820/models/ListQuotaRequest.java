// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListQuotaRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. To query the next page, specify the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>Trigger_fasdatalake_deductionfee</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaRequest self = new ListQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
