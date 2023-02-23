// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class DeletePipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePipelineRunResponseBody body;

    public static DeletePipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineRunResponse self = new DeletePipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineRunResponse setBody(DeletePipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineRunResponseBody getBody() {
        return this.body;
    }

}
