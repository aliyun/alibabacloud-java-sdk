// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateABMetricGroupResponseBody body;

    public static UpdateABMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABMetricGroupResponse self = new UpdateABMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateABMetricGroupResponse setBody(UpdateABMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABMetricGroupResponseBody getBody() {
        return this.body;
    }

}
