// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersForGroupResponseBody body;

    public static ListUsersForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponse self = new ListUsersForGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersForGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersForGroupResponse setBody(ListUsersForGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersForGroupResponseBody getBody() {
        return this.body;
    }

}
