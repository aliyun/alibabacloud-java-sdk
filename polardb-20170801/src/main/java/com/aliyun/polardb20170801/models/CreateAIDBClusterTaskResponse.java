// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIDBClusterTaskResponseBody body;

    public static CreateAIDBClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterTaskResponse self = new CreateAIDBClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIDBClusterTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIDBClusterTaskResponse setBody(CreateAIDBClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIDBClusterTaskResponseBody getBody() {
        return this.body;
    }

}
