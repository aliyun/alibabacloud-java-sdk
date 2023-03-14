// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsersResponseBody body;

    public static ListUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponse self = new ListUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersResponse setBody(ListUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersResponseBody getBody() {
        return this.body;
    }

}
