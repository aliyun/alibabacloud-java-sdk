// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetricGroupResponseBody body;

    public static UpdateMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricGroupResponse self = new UpdateMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetricGroupResponse setBody(UpdateMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetricGroupResponseBody getBody() {
        return this.body;
    }

}
