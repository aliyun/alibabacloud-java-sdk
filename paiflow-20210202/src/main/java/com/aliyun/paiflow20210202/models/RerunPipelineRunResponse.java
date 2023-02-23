// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class RerunPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RerunPipelineRunResponseBody body;

    public static RerunPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunPipelineRunResponse self = new RerunPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public RerunPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunPipelineRunResponse setBody(RerunPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunPipelineRunResponseBody getBody() {
        return this.body;
    }

}
