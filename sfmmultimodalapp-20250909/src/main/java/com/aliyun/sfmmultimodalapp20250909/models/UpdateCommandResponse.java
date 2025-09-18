// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCommandResponseBody body;

    public static UpdateCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommandResponse self = new UpdateCommandResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCommandResponse setBody(UpdateCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommandResponseBody getBody() {
        return this.body;
    }

}
