// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIDBClusterDatasetResponseBody body;

    public static DeleteAIDBClusterDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterDatasetResponse self = new DeleteAIDBClusterDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIDBClusterDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIDBClusterDatasetResponse setBody(DeleteAIDBClusterDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIDBClusterDatasetResponseBody getBody() {
        return this.body;
    }

}
