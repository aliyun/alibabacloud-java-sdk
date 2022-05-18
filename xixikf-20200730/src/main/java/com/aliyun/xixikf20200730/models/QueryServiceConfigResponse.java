// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryServiceConfigResponseBody body;

    public static QueryServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceConfigResponse self = new QueryServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryServiceConfigResponse setBody(QueryServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServiceConfigResponseBody getBody() {
        return this.body;
    }

}
