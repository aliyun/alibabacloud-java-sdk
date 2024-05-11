// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricGroupResponseBody body;

    public static GetMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricGroupResponse self = new GetMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricGroupResponse setBody(GetMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricGroupResponseBody getBody() {
        return this.body;
    }

}
