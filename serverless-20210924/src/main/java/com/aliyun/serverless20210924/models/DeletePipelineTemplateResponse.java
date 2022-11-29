// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class DeletePipelineTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePipelineTemplateResponseBody body;

    public static DeletePipelineTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineTemplateResponse self = new DeletePipelineTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineTemplateResponse setBody(DeletePipelineTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineTemplateResponseBody getBody() {
        return this.body;
    }

}
