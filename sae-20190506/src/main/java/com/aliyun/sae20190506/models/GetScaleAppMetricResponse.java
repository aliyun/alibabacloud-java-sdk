// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetScaleAppMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScaleAppMetricResponseBody body;

    public static GetScaleAppMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScaleAppMetricResponse self = new GetScaleAppMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetScaleAppMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScaleAppMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScaleAppMetricResponse setBody(GetScaleAppMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScaleAppMetricResponseBody getBody() {
        return this.body;
    }

}
