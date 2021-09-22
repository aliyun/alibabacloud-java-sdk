// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePipelineResponseBody body;

    public static UpdatePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineResponse self = new UpdatePipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineResponse setBody(UpdatePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineResponseBody getBody() {
        return this.body;
    }

}
