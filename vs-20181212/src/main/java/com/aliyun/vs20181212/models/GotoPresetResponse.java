// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GotoPresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GotoPresetResponseBody body;

    public static GotoPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        GotoPresetResponse self = new GotoPresetResponse();
        return TeaModel.build(map, self);
    }

    public GotoPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GotoPresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GotoPresetResponse setBody(GotoPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public GotoPresetResponseBody getBody() {
        return this.body;
    }

}
