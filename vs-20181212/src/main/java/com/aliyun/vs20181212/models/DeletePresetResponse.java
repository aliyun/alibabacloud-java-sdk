// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePresetResponseBody body;

    public static DeletePresetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePresetResponse self = new DeletePresetResponse();
        return TeaModel.build(map, self);
    }

    public DeletePresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePresetResponse setBody(DeletePresetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePresetResponseBody getBody() {
        return this.body;
    }

}
