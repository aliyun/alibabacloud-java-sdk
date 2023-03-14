// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachHostGroupAccountsToUserResponseBody body;

    public static AttachHostGroupAccountsToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserResponse self = new AttachHostGroupAccountsToUserResponse();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachHostGroupAccountsToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachHostGroupAccountsToUserResponse setBody(AttachHostGroupAccountsToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachHostGroupAccountsToUserResponseBody getBody() {
        return this.body;
    }

}
