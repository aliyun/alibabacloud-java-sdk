// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class PrepaidCeaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PrepaidCeaseResponseBody body;

    public static PrepaidCeaseResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepaidCeaseResponse self = new PrepaidCeaseResponse();
        return TeaModel.build(map, self);
    }

    public PrepaidCeaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepaidCeaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrepaidCeaseResponse setBody(PrepaidCeaseResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepaidCeaseResponseBody getBody() {
        return this.body;
    }

}
