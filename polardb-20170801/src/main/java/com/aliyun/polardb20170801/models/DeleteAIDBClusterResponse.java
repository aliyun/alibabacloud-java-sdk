// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIDBClusterResponseBody body;

    public static DeleteAIDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterResponse self = new DeleteAIDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIDBClusterResponse setBody(DeleteAIDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIDBClusterResponseBody getBody() {
        return this.body;
    }

}
