// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachHostAccountsToHostShareKeyResponseBody body;

    public static AttachHostAccountsToHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToHostShareKeyResponse self = new AttachHostAccountsToHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachHostAccountsToHostShareKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachHostAccountsToHostShareKeyResponse setBody(AttachHostAccountsToHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachHostAccountsToHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
