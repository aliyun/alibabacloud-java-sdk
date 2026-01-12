// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class InvokeSyncAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeSyncAlgorithmResponseBody body;

    public static InvokeSyncAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeSyncAlgorithmResponse self = new InvokeSyncAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public InvokeSyncAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeSyncAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeSyncAlgorithmResponse setBody(InvokeSyncAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeSyncAlgorithmResponseBody getBody() {
        return this.body;
    }

}
