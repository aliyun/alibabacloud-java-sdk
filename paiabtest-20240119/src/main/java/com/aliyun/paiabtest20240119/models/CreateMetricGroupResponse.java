// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetricGroupResponseBody body;

    public static CreateMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricGroupResponse self = new CreateMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetricGroupResponse setBody(CreateMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetricGroupResponseBody getBody() {
        return this.body;
    }

}
