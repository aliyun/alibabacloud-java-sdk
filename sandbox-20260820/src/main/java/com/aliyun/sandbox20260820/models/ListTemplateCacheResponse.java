// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListTemplateCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplateCacheResponseBody body;

    public static ListTemplateCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateCacheResponse self = new ListTemplateCacheResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateCacheResponse setBody(ListTemplateCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateCacheResponseBody getBody() {
        return this.body;
    }

}
