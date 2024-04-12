// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWarningEventMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWarningEventMetricResponseBody body;

    public static GetWarningEventMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWarningEventMetricResponse self = new GetWarningEventMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetWarningEventMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWarningEventMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWarningEventMetricResponse setBody(GetWarningEventMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWarningEventMetricResponseBody getBody() {
        return this.body;
    }

}
