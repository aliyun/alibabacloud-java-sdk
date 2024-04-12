// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigMapResponseBody body;

    public static UpdateConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigMapResponse self = new UpdateConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigMapResponse setBody(UpdateConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigMapResponseBody getBody() {
        return this.body;
    }

}
