// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationDatabasesResponseBody body;

    public static ListOperationDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationDatabasesResponse self = new ListOperationDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationDatabasesResponse setBody(ListOperationDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationDatabasesResponseBody getBody() {
        return this.body;
    }

}
