// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotPresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHoneypotPresetResponseBody body;

    public static DeleteHoneypotPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotPresetResponse self = new DeleteHoneypotPresetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHoneypotPresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHoneypotPresetResponse setBody(DeleteHoneypotPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHoneypotPresetResponseBody getBody() {
        return this.body;
    }

}
