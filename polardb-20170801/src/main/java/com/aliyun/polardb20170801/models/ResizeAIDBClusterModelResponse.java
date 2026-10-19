// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResizeAIDBClusterModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResizeAIDBClusterModelResponseBody body;

    public static ResizeAIDBClusterModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeAIDBClusterModelResponse self = new ResizeAIDBClusterModelResponse();
        return TeaModel.build(map, self);
    }

    public ResizeAIDBClusterModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeAIDBClusterModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeAIDBClusterModelResponse setBody(ResizeAIDBClusterModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeAIDBClusterModelResponseBody getBody() {
        return this.body;
    }

}
