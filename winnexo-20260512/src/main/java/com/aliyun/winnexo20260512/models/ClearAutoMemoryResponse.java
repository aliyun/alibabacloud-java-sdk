// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ClearAutoMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearAutoMemoryResponseBody body;

    public static ClearAutoMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAutoMemoryResponse self = new ClearAutoMemoryResponse();
        return TeaModel.build(map, self);
    }

    public ClearAutoMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAutoMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearAutoMemoryResponse setBody(ClearAutoMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAutoMemoryResponseBody getBody() {
        return this.body;
    }

}
