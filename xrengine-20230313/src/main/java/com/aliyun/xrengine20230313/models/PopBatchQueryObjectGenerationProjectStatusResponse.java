// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBatchQueryObjectGenerationProjectStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopBatchQueryObjectGenerationProjectStatusResponseBody body;

    public static PopBatchQueryObjectGenerationProjectStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBatchQueryObjectGenerationProjectStatusResponse self = new PopBatchQueryObjectGenerationProjectStatusResponse();
        return TeaModel.build(map, self);
    }

    public PopBatchQueryObjectGenerationProjectStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBatchQueryObjectGenerationProjectStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBatchQueryObjectGenerationProjectStatusResponse setBody(PopBatchQueryObjectGenerationProjectStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBatchQueryObjectGenerationProjectStatusResponseBody getBody() {
        return this.body;
    }

}
