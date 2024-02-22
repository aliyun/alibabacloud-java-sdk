// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteABMetricGroupResponseBody body;

    public static DeleteABMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricGroupResponse self = new DeleteABMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteABMetricGroupResponse setBody(DeleteABMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABMetricGroupResponseBody getBody() {
        return this.body;
    }

}
