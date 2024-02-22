// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateABMetricResponseBody body;

    public static UpdateABMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABMetricResponse self = new UpdateABMetricResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateABMetricResponse setBody(UpdateABMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABMetricResponseBody getBody() {
        return this.body;
    }

}
