// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousMoveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ContinuousMoveResponseBody body;

    public static ContinuousMoveResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousMoveResponse self = new ContinuousMoveResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousMoveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinuousMoveResponse setBody(ContinuousMoveResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinuousMoveResponseBody getBody() {
        return this.body;
    }

}
