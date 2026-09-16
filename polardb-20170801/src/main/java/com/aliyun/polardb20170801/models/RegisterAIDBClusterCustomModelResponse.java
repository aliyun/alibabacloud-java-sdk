// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RegisterAIDBClusterCustomModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterAIDBClusterCustomModelResponseBody body;

    public static RegisterAIDBClusterCustomModelResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAIDBClusterCustomModelResponse self = new RegisterAIDBClusterCustomModelResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAIDBClusterCustomModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterAIDBClusterCustomModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterAIDBClusterCustomModelResponse setBody(RegisterAIDBClusterCustomModelResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterAIDBClusterCustomModelResponseBody getBody() {
        return this.body;
    }

}
