// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModuleConfigResponseBody body;

    public static GetModuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigResponse self = new GetModuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModuleConfigResponse setBody(GetModuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModuleConfigResponseBody getBody() {
        return this.body;
    }

}
