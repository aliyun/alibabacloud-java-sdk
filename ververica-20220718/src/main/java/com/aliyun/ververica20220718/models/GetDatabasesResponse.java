// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatabasesResponseBody body;

    public static GetDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabasesResponse self = new GetDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabasesResponse setBody(GetDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabasesResponseBody getBody() {
        return this.body;
    }

}
