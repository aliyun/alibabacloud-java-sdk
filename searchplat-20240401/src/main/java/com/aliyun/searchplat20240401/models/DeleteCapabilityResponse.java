// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCapabilityResponseBody body;

    public static DeleteCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCapabilityResponse self = new DeleteCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCapabilityResponse setBody(DeleteCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCapabilityResponseBody getBody() {
        return this.body;
    }

}
