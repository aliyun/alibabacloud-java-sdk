// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppTransitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppTransitionResponseBody body;

    public static UpdateMmAppTransitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppTransitionResponse self = new UpdateMmAppTransitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppTransitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppTransitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppTransitionResponse setBody(UpdateMmAppTransitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppTransitionResponseBody getBody() {
        return this.body;
    }

}
