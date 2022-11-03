// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ValidFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidFlowResponseBody body;

    public static ValidFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidFlowResponse self = new ValidFlowResponse();
        return TeaModel.build(map, self);
    }

    public ValidFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidFlowResponse setBody(ValidFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidFlowResponseBody getBody() {
        return this.body;
    }

}
