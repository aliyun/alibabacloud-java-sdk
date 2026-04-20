// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingRagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MmAppBindingRagResponseBody body;

    public static MmAppBindingRagResponse build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingRagResponse self = new MmAppBindingRagResponse();
        return TeaModel.build(map, self);
    }

    public MmAppBindingRagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MmAppBindingRagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MmAppBindingRagResponse setBody(MmAppBindingRagResponseBody body) {
        this.body = body;
        return this;
    }
    public MmAppBindingRagResponseBody getBody() {
        return this.body;
    }

}
