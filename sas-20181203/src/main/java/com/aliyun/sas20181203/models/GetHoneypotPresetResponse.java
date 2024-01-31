// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotPresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHoneypotPresetResponseBody body;

    public static GetHoneypotPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotPresetResponse self = new GetHoneypotPresetResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotPresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotPresetResponse setBody(GetHoneypotPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotPresetResponseBody getBody() {
        return this.body;
    }

}
