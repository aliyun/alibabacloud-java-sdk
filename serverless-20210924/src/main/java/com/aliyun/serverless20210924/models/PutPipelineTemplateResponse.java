// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutPipelineTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PipelineTemplate body;

    public static PutPipelineTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PutPipelineTemplateResponse self = new PutPipelineTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PutPipelineTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutPipelineTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutPipelineTemplateResponse setBody(PipelineTemplate body) {
        this.body = body;
        return this;
    }
    public PipelineTemplate getBody() {
        return this.body;
    }

}
