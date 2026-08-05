// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCapabilityResponseBody body;

    public static UpdateCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCapabilityResponse self = new UpdateCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCapabilityResponse setBody(UpdateCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCapabilityResponseBody getBody() {
        return this.body;
    }

}
