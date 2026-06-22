// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ChangeMessageVisibilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeMessageVisibilityResponseBody body;

    public static ChangeMessageVisibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMessageVisibilityResponse self = new ChangeMessageVisibilityResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMessageVisibilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMessageVisibilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeMessageVisibilityResponse setBody(ChangeMessageVisibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMessageVisibilityResponseBody getBody() {
        return this.body;
    }

}
