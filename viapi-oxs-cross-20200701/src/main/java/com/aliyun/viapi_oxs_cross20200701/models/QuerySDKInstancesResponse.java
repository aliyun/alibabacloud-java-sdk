// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class QuerySDKInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySDKInstancesResponseBody body;

    public static QuerySDKInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySDKInstancesResponse self = new QuerySDKInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QuerySDKInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySDKInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySDKInstancesResponse setBody(QuerySDKInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySDKInstancesResponseBody getBody() {
        return this.body;
    }

}
