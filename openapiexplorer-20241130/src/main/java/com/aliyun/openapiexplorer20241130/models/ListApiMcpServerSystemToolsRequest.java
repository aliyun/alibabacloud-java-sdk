// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServerSystemToolsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
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
