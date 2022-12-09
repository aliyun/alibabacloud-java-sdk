// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendByAliasResponseBody body;

    public static SendByAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasResponse self = new SendByAliasResponse();
        return TeaModel.build(map, self);
    }

    public SendByAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendByAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendByAliasResponse setBody(SendByAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public SendByAliasResponseBody getBody() {
        return this.body;
    }

}
