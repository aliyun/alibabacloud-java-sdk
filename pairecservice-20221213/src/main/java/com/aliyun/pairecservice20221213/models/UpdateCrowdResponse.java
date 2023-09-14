// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateCrowdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCrowdResponseBody body;

    public static UpdateCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrowdResponse self = new UpdateCrowdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCrowdResponse setBody(UpdateCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrowdResponseBody getBody() {
        return this.body;
    }

}
