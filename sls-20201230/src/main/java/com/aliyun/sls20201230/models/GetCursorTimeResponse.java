// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCursorTimeResponseBody body;

    public static GetCursorTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCursorTimeResponse self = new GetCursorTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetCursorTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCursorTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCursorTimeResponse setBody(GetCursorTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCursorTimeResponseBody getBody() {
        return this.body;
    }

}
