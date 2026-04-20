// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppMemoryResponseBody body;

    public static UpdateMmAppMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppMemoryResponse self = new UpdateMmAppMemoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppMemoryResponse setBody(UpdateMmAppMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppMemoryResponseBody getBody() {
        return this.body;
    }

}
