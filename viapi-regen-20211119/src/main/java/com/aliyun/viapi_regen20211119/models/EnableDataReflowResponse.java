// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class EnableDataReflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDataReflowResponseBody body;

    public static EnableDataReflowResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDataReflowResponse self = new EnableDataReflowResponse();
        return TeaModel.build(map, self);
    }

    public EnableDataReflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDataReflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDataReflowResponse setBody(EnableDataReflowResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDataReflowResponseBody getBody() {
        return this.body;
    }

}
