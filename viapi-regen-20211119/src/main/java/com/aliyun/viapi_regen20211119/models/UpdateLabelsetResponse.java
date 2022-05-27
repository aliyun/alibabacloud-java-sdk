// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateLabelsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLabelsetResponseBody body;

    public static UpdateLabelsetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelsetResponse self = new UpdateLabelsetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLabelsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLabelsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLabelsetResponse setBody(UpdateLabelsetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLabelsetResponseBody getBody() {
        return this.body;
    }

}
