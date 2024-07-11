// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SearchInventoryResponseBody extends TeaModel {
    @NameInMap("Entities")
    public java.util.List<java.util.Map<String, ?>> entities;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A81E4B2E-6B33-4BAE-9856-55DB7C893E01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryResponseBody self = new SearchInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchInventoryResponseBody setEntities(java.util.List<java.util.Map<String, ?>> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEntities() {
        return this.entities;
    }

    public SearchInventoryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchInventoryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
