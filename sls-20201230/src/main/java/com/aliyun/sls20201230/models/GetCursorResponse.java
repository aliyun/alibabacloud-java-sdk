// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCursorResponseBody body;

    public static GetCursorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCursorResponse self = new GetCursorResponse();
        return TeaModel.build(map, self);
    }

    public GetCursorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCursorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCursorResponse setBody(GetCursorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCursorResponseBody getBody() {
        return this.body;
    }

}
