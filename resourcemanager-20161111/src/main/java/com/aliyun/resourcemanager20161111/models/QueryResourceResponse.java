// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class QueryResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryResourceResponseBody body;

    public static QueryResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceResponse self = new QueryResourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResourceResponse setBody(QueryResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResourceResponseBody getBody() {
        return this.body;
    }

}
