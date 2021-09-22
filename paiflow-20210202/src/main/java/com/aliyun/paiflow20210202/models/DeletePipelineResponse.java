// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class DeletePipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePipelineResponseBody body;

    public static DeletePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineResponse self = new DeletePipelineResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineResponse setBody(DeletePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineResponseBody getBody() {
        return this.body;
    }

}
