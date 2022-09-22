// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class GetFileTransResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileTransResponseBody body;

    public static GetFileTransResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileTransResponse self = new GetFileTransResponse();
        return TeaModel.build(map, self);
    }

    public GetFileTransResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileTransResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileTransResponse setBody(GetFileTransResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileTransResponseBody getBody() {
        return this.body;
    }

}
