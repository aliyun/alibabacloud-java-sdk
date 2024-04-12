// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChangeOrderMetricResponseBody body;

    public static GetChangeOrderMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderMetricResponse self = new GetChangeOrderMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChangeOrderMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChangeOrderMetricResponse setBody(GetChangeOrderMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChangeOrderMetricResponseBody getBody() {
        return this.body;
    }

}
