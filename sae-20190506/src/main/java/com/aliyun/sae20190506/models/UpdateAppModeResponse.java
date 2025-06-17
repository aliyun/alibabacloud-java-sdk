// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppModeResponseBody body;

    public static UpdateAppModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModeResponse self = new UpdateAppModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppModeResponse setBody(UpdateAppModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppModeResponseBody getBody() {
        return this.body;
    }

}
