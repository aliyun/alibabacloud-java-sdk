// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListTemplateCacheResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>cae5f900-8b1d-4c0e-9c2a-1a2b3c4d5e6f</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("templateCaches")
    public java.util.List<PublicTemplateCache> templateCaches;

    public static ListTemplateCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateCacheResponseBody self = new ListTemplateCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTemplateCacheResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTemplateCacheResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateCacheResponseBody setTemplateCaches(java.util.List<PublicTemplateCache> templateCaches) {
        this.templateCaches = templateCaches;
        return this;
    }
    public java.util.List<PublicTemplateCache> getTemplateCaches() {
        return this.templateCaches;
    }

}
