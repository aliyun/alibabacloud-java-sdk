// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmPipelineBatchResponseBody body;

    public static ConfirmPipelineBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPipelineBatchResponse self = new ConfirmPipelineBatchResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmPipelineBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmPipelineBatchResponse setBody(ConfirmPipelineBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmPipelineBatchResponseBody getBody() {
        return this.body;
    }

}
