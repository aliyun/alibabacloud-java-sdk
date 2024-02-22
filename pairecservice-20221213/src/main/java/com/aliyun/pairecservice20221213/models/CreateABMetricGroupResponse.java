// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateABMetricGroupResponseBody body;

    public static CreateABMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricGroupResponse self = new CreateABMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateABMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateABMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateABMetricGroupResponse setBody(CreateABMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateABMetricGroupResponseBody getBody() {
        return this.body;
    }

}
