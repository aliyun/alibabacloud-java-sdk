// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModuleConfigStatusResponseBody body;

    public static GetModuleConfigStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigStatusResponse self = new GetModuleConfigStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModuleConfigStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModuleConfigStatusResponse setBody(GetModuleConfigStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModuleConfigStatusResponseBody getBody() {
        return this.body;
    }

}
