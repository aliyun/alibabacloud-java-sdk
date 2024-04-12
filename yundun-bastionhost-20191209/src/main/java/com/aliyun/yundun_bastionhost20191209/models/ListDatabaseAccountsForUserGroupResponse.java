// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabaseAccountsForUserGroupResponseBody body;

    public static ListDatabaseAccountsForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsForUserGroupResponse self = new ListDatabaseAccountsForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseAccountsForUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseAccountsForUserGroupResponse setBody(ListDatabaseAccountsForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseAccountsForUserGroupResponseBody getBody() {
        return this.body;
    }

}
