// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateOutputFormatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateOutputFormatResponseBody body;

    public static GenerateOutputFormatResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOutputFormatResponse self = new GenerateOutputFormatResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOutputFormatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOutputFormatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateOutputFormatResponse setBody(GenerateOutputFormatResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOutputFormatResponseBody getBody() {
        return this.body;
    }

}
