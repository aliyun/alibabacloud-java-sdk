// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class PatchPolarClawConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PatchPolarClawConfigResponseBody body;

    public static PatchPolarClawConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PatchPolarClawConfigResponse self = new PatchPolarClawConfigResponse();
        return TeaModel.build(map, self);
    }

    public PatchPolarClawConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PatchPolarClawConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PatchPolarClawConfigResponse setBody(PatchPolarClawConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PatchPolarClawConfigResponseBody getBody() {
        return this.body;
    }

}
