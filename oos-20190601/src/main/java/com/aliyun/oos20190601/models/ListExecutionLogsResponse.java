// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExecutionLogsResponseBody body;

    public static ListExecutionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionLogsResponse self = new ListExecutionLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutionLogsResponse setBody(ListExecutionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionLogsResponseBody getBody() {
        return this.body;
    }

}
