// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourceTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceTasksResponseBody body;

    public static ListDataSourceTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTasksResponse self = new ListDataSourceTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceTasksResponse setBody(ListDataSourceTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceTasksResponseBody getBody() {
        return this.body;
    }

}
