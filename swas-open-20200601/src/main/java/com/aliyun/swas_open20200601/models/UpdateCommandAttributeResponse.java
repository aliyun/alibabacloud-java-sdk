// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateCommandAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCommandAttributeResponseBody body;

    public static UpdateCommandAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommandAttributeResponse self = new UpdateCommandAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommandAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommandAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCommandAttributeResponse setBody(UpdateCommandAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommandAttributeResponseBody getBody() {
        return this.body;
    }

}
