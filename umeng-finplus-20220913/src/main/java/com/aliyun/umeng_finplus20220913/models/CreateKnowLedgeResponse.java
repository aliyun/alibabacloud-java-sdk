// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateKnowLedgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowLedgeResponseBody body;

    public static CreateKnowLedgeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowLedgeResponse self = new CreateKnowLedgeResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowLedgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowLedgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowLedgeResponse setBody(CreateKnowLedgeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowLedgeResponseBody getBody() {
        return this.body;
    }

}
