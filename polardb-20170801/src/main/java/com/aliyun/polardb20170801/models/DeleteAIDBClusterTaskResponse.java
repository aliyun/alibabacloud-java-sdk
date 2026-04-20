// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIDBClusterTaskResponseBody body;

    public static DeleteAIDBClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterTaskResponse self = new DeleteAIDBClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIDBClusterTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIDBClusterTaskResponse setBody(DeleteAIDBClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIDBClusterTaskResponseBody getBody() {
        return this.body;
    }

}
