// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePipelineRunResponseBody body;

    public static UpdatePipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRunResponse self = new UpdatePipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineRunResponse setBody(UpdatePipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineRunResponseBody getBody() {
        return this.body;
    }

}
