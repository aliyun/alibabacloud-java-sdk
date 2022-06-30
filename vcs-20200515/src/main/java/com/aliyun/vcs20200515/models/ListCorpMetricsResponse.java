// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCorpMetricsResponseBody body;

    public static ListCorpMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpMetricsResponse self = new ListCorpMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCorpMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCorpMetricsResponse setBody(ListCorpMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCorpMetricsResponseBody getBody() {
        return this.body;
    }

}
