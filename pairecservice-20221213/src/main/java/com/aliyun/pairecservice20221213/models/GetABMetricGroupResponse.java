// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetABMetricGroupResponseBody body;

    public static GetABMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetABMetricGroupResponse self = new GetABMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetABMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetABMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetABMetricGroupResponse setBody(GetABMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetABMetricGroupResponseBody getBody() {
        return this.body;
    }

}
