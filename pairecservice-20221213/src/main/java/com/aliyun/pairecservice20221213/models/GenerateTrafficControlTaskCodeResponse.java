// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTrafficControlTaskCodeResponseBody body;

    public static GenerateTrafficControlTaskCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskCodeResponse self = new GenerateTrafficControlTaskCodeResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTrafficControlTaskCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTrafficControlTaskCodeResponse setBody(GenerateTrafficControlTaskCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTrafficControlTaskCodeResponseBody getBody() {
        return this.body;
    }

}
