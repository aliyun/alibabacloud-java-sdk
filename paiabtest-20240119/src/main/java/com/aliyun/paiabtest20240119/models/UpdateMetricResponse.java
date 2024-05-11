// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetricResponseBody body;

    public static UpdateMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricResponse self = new UpdateMetricResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetricResponse setBody(UpdateMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetricResponseBody getBody() {
        return this.body;
    }

}
