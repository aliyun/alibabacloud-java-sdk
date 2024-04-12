// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabasesForUserResponseBody body;

    public static ListDatabasesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesForUserResponse self = new ListDatabasesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabasesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabasesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabasesForUserResponse setBody(ListDatabasesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabasesForUserResponseBody getBody() {
        return this.body;
    }

}
