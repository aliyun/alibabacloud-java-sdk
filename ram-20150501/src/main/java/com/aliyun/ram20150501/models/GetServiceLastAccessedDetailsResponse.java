// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetServiceLastAccessedDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceLastAccessedDetailsResponseBody body;

    public static GetServiceLastAccessedDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLastAccessedDetailsResponse self = new GetServiceLastAccessedDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLastAccessedDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceLastAccessedDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceLastAccessedDetailsResponse setBody(GetServiceLastAccessedDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLastAccessedDetailsResponseBody getBody() {
        return this.body;
    }

}
