// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DisableDataReflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDataReflowResponseBody body;

    public static DisableDataReflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDataReflowResponse self = new DisableDataReflowResponse();
        return TeaModel.build(map, self);
    }

    public DisableDataReflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDataReflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDataReflowResponse setBody(DisableDataReflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDataReflowResponseBody getBody() {
        return this.body;
    }

}
