// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class OpenVsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenVsServiceResponseBody body;

    public static OpenVsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenVsServiceResponse self = new OpenVsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenVsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenVsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenVsServiceResponse setBody(OpenVsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenVsServiceResponseBody getBody() {
        return this.body;
    }

}
