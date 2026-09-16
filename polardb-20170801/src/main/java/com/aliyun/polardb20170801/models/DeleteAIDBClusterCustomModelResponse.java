// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterCustomModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIDBClusterCustomModelResponseBody body;

    public static DeleteAIDBClusterCustomModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterCustomModelResponse self = new DeleteAIDBClusterCustomModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterCustomModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIDBClusterCustomModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIDBClusterCustomModelResponse setBody(DeleteAIDBClusterCustomModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIDBClusterCustomModelResponseBody getBody() {
        return this.body;
    }

}
