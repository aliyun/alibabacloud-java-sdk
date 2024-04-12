// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachDatabaseAccountsToUserGroupResponseBody body;

    public static AttachDatabaseAccountsToUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDatabaseAccountsToUserGroupResponse self = new AttachDatabaseAccountsToUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AttachDatabaseAccountsToUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDatabaseAccountsToUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDatabaseAccountsToUserGroupResponse setBody(AttachDatabaseAccountsToUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDatabaseAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

}
