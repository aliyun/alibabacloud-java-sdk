// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteLabelsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLabelsetResponseBody body;

    public static DeleteLabelsetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelsetResponse self = new DeleteLabelsetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLabelsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLabelsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLabelsetResponse setBody(DeleteLabelsetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLabelsetResponseBody getBody() {
        return this.body;
    }

}
