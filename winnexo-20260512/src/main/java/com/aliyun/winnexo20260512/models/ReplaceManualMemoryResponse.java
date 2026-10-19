// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceManualMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceManualMemoryResponseBody body;

    public static ReplaceManualMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceManualMemoryResponse self = new ReplaceManualMemoryResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceManualMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceManualMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceManualMemoryResponse setBody(ReplaceManualMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceManualMemoryResponseBody getBody() {
        return this.body;
    }

}
