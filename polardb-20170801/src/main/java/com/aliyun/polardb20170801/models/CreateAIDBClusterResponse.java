// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIDBClusterResponseBody body;

    public static CreateAIDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterResponse self = new CreateAIDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIDBClusterResponse setBody(CreateAIDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIDBClusterResponseBody getBody() {
        return this.body;
    }

}
