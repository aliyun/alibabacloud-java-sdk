// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetAvailabilityMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvailabilityMetricResponseBody body;

    public static GetAvailabilityMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvailabilityMetricResponse self = new GetAvailabilityMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetAvailabilityMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvailabilityMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvailabilityMetricResponse setBody(GetAvailabilityMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvailabilityMetricResponseBody getBody() {
        return this.body;
    }

}
