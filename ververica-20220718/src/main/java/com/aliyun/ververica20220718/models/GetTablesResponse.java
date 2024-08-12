// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTablesResponseBody body;

    public static GetTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTablesResponse self = new GetTablesResponse();
        return TeaModel.build(map, self);
    }

    public GetTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTablesResponse setBody(GetTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTablesResponseBody getBody() {
        return this.body;
    }

}
