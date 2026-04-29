// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolarClawConfigResponseBody body;

    public static GetPolarClawConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawConfigResponse self = new GetPolarClawConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPolarClawConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolarClawConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolarClawConfigResponse setBody(GetPolarClawConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolarClawConfigResponseBody getBody() {
        return this.body;
    }

}
