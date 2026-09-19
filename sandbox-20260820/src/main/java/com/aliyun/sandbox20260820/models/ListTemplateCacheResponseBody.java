// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListTemplateCacheResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("message")
    public String message;

    @NameInMap("nextToken")
    public String nextToken;

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
