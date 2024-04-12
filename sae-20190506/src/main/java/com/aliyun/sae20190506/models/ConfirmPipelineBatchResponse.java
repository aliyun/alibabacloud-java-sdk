// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ConfirmPipelineBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmPipelineBatchResponse setBody(ConfirmPipelineBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmPipelineBatchResponseBody getBody() {
        return this.body;
    }

}
