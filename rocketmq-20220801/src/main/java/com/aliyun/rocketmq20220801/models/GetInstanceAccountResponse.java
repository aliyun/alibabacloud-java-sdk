// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceAccountResponseBody body;

    public static GetInstanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAccountResponse self = new GetInstanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceAccountResponse setBody(GetInstanceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceAccountResponseBody getBody() {
        return this.body;
    }

}
