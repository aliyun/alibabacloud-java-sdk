// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachHostAccountsFromUserResponseBody body;

    public static DetachHostAccountsFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserResponse self = new DetachHostAccountsFromUserResponse();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachHostAccountsFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachHostAccountsFromUserResponse setBody(DetachHostAccountsFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachHostAccountsFromUserResponseBody getBody() {
        return this.body;
    }

}
