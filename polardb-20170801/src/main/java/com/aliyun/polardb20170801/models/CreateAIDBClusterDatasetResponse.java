// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIDBClusterDatasetResponseBody body;

    public static CreateAIDBClusterDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterDatasetResponse self = new CreateAIDBClusterDatasetResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIDBClusterDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIDBClusterDatasetResponse setBody(CreateAIDBClusterDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIDBClusterDatasetResponseBody getBody() {
        return this.body;
    }

}
