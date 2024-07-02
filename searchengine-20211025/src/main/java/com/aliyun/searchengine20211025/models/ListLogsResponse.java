// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogsResponseBody body;

    public static ListLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogsResponse self = new ListLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogsResponse setBody(ListLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogsResponseBody getBody() {
        return this.body;
    }

}
