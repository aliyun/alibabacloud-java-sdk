// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GenerateServiceLastAccessedDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateServiceLastAccessedDetailsResponseBody body;

    public static GenerateServiceLastAccessedDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateServiceLastAccessedDetailsResponse self = new GenerateServiceLastAccessedDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GenerateServiceLastAccessedDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateServiceLastAccessedDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateServiceLastAccessedDetailsResponse setBody(GenerateServiceLastAccessedDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateServiceLastAccessedDetailsResponseBody getBody() {
        return this.body;
    }

}
