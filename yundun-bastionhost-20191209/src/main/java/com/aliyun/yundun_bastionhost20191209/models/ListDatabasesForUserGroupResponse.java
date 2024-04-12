// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabasesForUserGroupResponseBody body;

    public static ListDatabasesForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesForUserGroupResponse self = new ListDatabasesForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabasesForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabasesForUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabasesForUserGroupResponse setBody(ListDatabasesForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabasesForUserGroupResponseBody getBody() {
        return this.body;
    }

}
