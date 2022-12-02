// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutPipelineStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Pipeline body;

    public static PutPipelineStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PutPipelineStatusResponse self = new PutPipelineStatusResponse();
        return TeaModel.build(map, self);
    }

    public PutPipelineStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutPipelineStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutPipelineStatusResponse setBody(Pipeline body) {
        this.body = body;
        return this;
    }
    public Pipeline getBody() {
        return this.body;
    }

}
