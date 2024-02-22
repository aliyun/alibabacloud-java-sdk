// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteABMetricResponseBody body;

    public static DeleteABMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricResponse self = new DeleteABMetricResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteABMetricResponse setBody(DeleteABMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABMetricResponseBody getBody() {
        return this.body;
    }

}
