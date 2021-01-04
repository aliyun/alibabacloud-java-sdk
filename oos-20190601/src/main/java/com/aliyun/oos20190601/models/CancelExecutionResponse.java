// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CancelExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelExecutionResponseBody body;

    public static CancelExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionResponse self = new CancelExecutionResponse();
        return TeaModel.build(map, self);
    }

    public CancelExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelExecutionResponse setBody(CancelExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelExecutionResponseBody getBody() {
        return this.body;
    }

}
