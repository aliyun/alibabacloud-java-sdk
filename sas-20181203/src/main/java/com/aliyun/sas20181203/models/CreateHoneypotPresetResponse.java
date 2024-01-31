// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotPresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHoneypotPresetResponseBody body;

    public static CreateHoneypotPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotPresetResponse self = new CreateHoneypotPresetResponse();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHoneypotPresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHoneypotPresetResponse setBody(CreateHoneypotPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHoneypotPresetResponseBody getBody() {
        return this.body;
    }

}
