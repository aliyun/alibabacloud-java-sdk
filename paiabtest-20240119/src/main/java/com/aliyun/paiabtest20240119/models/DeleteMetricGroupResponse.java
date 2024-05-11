// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetricGroupResponseBody body;

    public static DeleteMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricGroupResponse self = new DeleteMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricGroupResponse setBody(DeleteMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricGroupResponseBody getBody() {
        return this.body;
    }

}
