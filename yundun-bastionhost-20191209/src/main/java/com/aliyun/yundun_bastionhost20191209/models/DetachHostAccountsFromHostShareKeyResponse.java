// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachHostAccountsFromHostShareKeyResponseBody body;

    public static DetachHostAccountsFromHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromHostShareKeyResponse self = new DetachHostAccountsFromHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachHostAccountsFromHostShareKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachHostAccountsFromHostShareKeyResponse setBody(DetachHostAccountsFromHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachHostAccountsFromHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
