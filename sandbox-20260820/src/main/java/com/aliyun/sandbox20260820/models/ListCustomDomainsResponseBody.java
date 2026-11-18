// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponseBody extends TeaModel {
    /**
     * <p>The response code. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The custom domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("customDomains")
    public java.util.List<CustomDomainResp> customDomains;

    /**
     * <p>Indicates whether a next page is available.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The maximum number of records to return per page.</p>
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
     * <p>The offset for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("nextOffset")
    public Integer nextOffset;

    /**
     * <p>The pagination token for the next page. This parameter is empty if no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>cae5f900-8b1d-4c0e-9c2a-1a2b3c4d5e6f</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BCFAE0A-9FA9-5F72-8E8B-724632BC19A9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListCustomDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsResponseBody self = new ListCustomDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomDomainsResponseBody setCustomDomains(java.util.List<CustomDomainResp> customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public java.util.List<CustomDomainResp> getCustomDomains() {
        return this.customDomains;
    }

    public ListCustomDomainsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListCustomDomainsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomDomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomDomainsResponseBody setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Integer getNextOffset() {
        return this.nextOffset;
    }

    public ListCustomDomainsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomDomainsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
