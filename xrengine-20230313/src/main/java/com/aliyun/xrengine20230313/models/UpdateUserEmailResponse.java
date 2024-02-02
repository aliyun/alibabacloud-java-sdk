// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class UpdateUserEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserEmailResponseBody body;

    public static UpdateUserEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserEmailResponse self = new UpdateUserEmailResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserEmailResponse setBody(UpdateUserEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserEmailResponseBody getBody() {
        return this.body;
    }

}
