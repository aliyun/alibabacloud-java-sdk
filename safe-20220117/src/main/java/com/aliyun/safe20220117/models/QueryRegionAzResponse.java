// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryRegionAzResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRegionAzResponseBody body;

    public static QueryRegionAzResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRegionAzResponse self = new QueryRegionAzResponse();
        return TeaModel.build(map, self);
    }

    public QueryRegionAzResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRegionAzResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRegionAzResponse setBody(QueryRegionAzResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRegionAzResponseBody getBody() {
        return this.body;
    }

}
