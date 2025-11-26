// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMultiUserInstancesRequest extends TeaModel {
    /**
     * <p>Number of items per page in a paginated query. The maximum value is 100. Range: 10 - 100, default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Used for paginated queries. Leave it empty for the first request, and fill in the NextToken value returned from the previous response for subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAB4SwmEAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM0NzY3YTZjNjI3NjZmNmU3MjcxNjk3NDY5MzY3MjY4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListMultiUserInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiUserInstancesRequest self = new ListMultiUserInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiUserInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiUserInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
