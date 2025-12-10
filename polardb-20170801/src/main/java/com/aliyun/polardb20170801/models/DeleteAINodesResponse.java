// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAINodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAINodesResponseBody body;

    public static DeleteAINodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAINodesResponse self = new DeleteAINodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAINodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAINodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAINodesResponse setBody(DeleteAINodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAINodesResponseBody getBody() {
        return this.body;
    }

}
