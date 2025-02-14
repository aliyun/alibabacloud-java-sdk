// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetConsoleFuncGrayStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsoleFuncGrayStatusResponseBody body;

    public static GetConsoleFuncGrayStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsoleFuncGrayStatusResponse self = new GetConsoleFuncGrayStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetConsoleFuncGrayStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsoleFuncGrayStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsoleFuncGrayStatusResponse setBody(GetConsoleFuncGrayStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsoleFuncGrayStatusResponseBody getBody() {
        return this.body;
    }

}
