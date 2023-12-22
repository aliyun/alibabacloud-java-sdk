// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTableMetaResponseBody body;

    public static UpdateTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableMetaResponse self = new UpdateTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableMetaResponse setBody(UpdateTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableMetaResponseBody getBody() {
        return this.body;
    }

}
