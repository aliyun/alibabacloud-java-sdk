// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ValidateKnowLedgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateKnowLedgeResponseBody body;

    public static ValidateKnowLedgeResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateKnowLedgeResponse self = new ValidateKnowLedgeResponse();
        return TeaModel.build(map, self);
    }

    public ValidateKnowLedgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateKnowLedgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateKnowLedgeResponse setBody(ValidateKnowLedgeResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateKnowLedgeResponseBody getBody() {
        return this.body;
    }

}
