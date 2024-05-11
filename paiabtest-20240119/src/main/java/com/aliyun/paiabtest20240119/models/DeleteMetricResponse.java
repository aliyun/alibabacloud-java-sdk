// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetricResponseBody body;

    public static DeleteMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricResponse self = new DeleteMetricResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricResponse setBody(DeleteMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricResponseBody getBody() {
        return this.body;
    }

}
