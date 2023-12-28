// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserExecutionLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserExecutionLogsResponseBody body;

    public static ListUserExecutionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserExecutionLogsResponse self = new ListUserExecutionLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserExecutionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserExecutionLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserExecutionLogsResponse setBody(ListUserExecutionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserExecutionLogsResponseBody getBody() {
        return this.body;
    }

}
