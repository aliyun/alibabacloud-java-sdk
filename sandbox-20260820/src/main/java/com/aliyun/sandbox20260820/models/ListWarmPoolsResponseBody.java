// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListWarmPoolsResponseBody extends TeaModel {
    /**
     * <p>The business code in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The actual maximum number of results returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>example-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of warm pools.</p>
     */
    @NameInMap("warmPools")
    public java.util.List<PublicWarmPoolConfig> warmPools;

    public static ListWarmPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarmPoolsResponseBody self = new ListWarmPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarmPoolsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWarmPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWarmPoolsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWarmPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWarmPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWarmPoolsResponseBody setWarmPools(java.util.List<PublicWarmPoolConfig> warmPools) {
        this.warmPools = warmPools;
        return this;
    }
    public java.util.List<PublicWarmPoolConfig> getWarmPools() {
        return this.warmPools;
    }

}
