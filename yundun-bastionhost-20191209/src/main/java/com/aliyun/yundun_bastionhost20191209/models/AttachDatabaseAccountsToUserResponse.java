// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachDatabaseAccountsToUserResponseBody body;

    public static AttachDatabaseAccountsToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDatabaseAccountsToUserResponse self = new AttachDatabaseAccountsToUserResponse();
        return TeaModel.build(map, self);
    }

    public AttachDatabaseAccountsToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDatabaseAccountsToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDatabaseAccountsToUserResponse setBody(AttachDatabaseAccountsToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDatabaseAccountsToUserResponseBody getBody() {
        return this.body;
    }

}
