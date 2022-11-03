// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ChargeFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChargeFlowResponseBody body;

    public static ChargeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ChargeFlowResponse self = new ChargeFlowResponse();
        return TeaModel.build(map, self);
    }

    public ChargeFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChargeFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChargeFlowResponse setBody(ChargeFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ChargeFlowResponseBody getBody() {
        return this.body;
    }

}
