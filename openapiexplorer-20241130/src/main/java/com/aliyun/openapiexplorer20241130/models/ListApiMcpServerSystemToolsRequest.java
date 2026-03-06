// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServerSystemToolsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to start the next query. Set this parameter to the NextToken value returned by the last API call.</p>
     * <blockquote>
     * <p>Do not specify this parameter for the first query. If a query does not return all results, pass the NextToken value from the previous response to the next query to continue.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The number of entries to skip.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("skip")
    public Integer skip;

    public static ListApiMcpServerSystemToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiMcpServerSystemToolsRequest self = new ListApiMcpServerSystemToolsRequest();
        return TeaModel.build(map, self);
    }

    public ListApiMcpServerSystemToolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiMcpServerSystemToolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiMcpServerSystemToolsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
