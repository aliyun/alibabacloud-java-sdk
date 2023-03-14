// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostGroupAccountsFromUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachHostGroupAccountsFromUserResponseBody body;

    public static DetachHostGroupAccountsFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachHostGroupAccountsFromUserResponse self = new DetachHostGroupAccountsFromUserResponse();
        return TeaModel.build(map, self);
    }

    public DetachHostGroupAccountsFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachHostGroupAccountsFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachHostGroupAccountsFromUserResponse setBody(DetachHostGroupAccountsFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachHostGroupAccountsFromUserResponseBody getBody() {
        return this.body;
    }

}
