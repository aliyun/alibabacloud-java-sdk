// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineRunNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineRunNodeResponseBody body;

    public static GetPipelineRunNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunNodeResponse self = new GetPipelineRunNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineRunNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineRunNodeResponse setBody(GetPipelineRunNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineRunNodeResponseBody getBody() {
        return this.body;
    }

}
