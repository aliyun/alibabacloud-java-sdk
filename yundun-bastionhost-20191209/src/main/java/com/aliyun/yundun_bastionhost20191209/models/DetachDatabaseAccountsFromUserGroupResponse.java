// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachDatabaseAccountsFromUserGroupResponseBody body;

    public static DetachDatabaseAccountsFromUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDatabaseAccountsFromUserGroupResponse self = new DetachDatabaseAccountsFromUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public DetachDatabaseAccountsFromUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDatabaseAccountsFromUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDatabaseAccountsFromUserGroupResponse setBody(DetachDatabaseAccountsFromUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDatabaseAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

}
