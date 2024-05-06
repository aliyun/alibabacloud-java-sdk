// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClusterTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterTasksResponseBody body;

    public static ListClusterTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTasksResponse self = new ListClusterTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterTasksResponse setBody(ListClusterTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterTasksResponseBody getBody() {
        return this.body;
    }

}
