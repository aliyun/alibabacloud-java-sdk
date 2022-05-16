// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessageMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessageMetricsResponseBody body;

    public static ListMessageMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageMetricsResponse self = new ListMessageMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageMetricsResponse setBody(ListMessageMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageMetricsResponseBody getBody() {
        return this.body;
    }

}
