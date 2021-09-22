// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineSchemaResponseBody body;

    public static GetPipelineSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineSchemaResponse self = new GetPipelineSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineSchemaResponse setBody(GetPipelineSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineSchemaResponseBody getBody() {
        return this.body;
    }

}
