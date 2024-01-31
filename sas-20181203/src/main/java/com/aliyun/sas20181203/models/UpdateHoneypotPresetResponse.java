// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotPresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHoneypotPresetResponseBody body;

    public static UpdateHoneypotPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotPresetResponse self = new UpdateHoneypotPresetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHoneypotPresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHoneypotPresetResponse setBody(UpdateHoneypotPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHoneypotPresetResponseBody getBody() {
        return this.body;
    }

}
