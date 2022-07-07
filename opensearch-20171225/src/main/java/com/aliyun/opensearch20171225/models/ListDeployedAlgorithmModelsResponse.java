// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDeployedAlgorithmModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployedAlgorithmModelsResponseBody body;

    public static ListDeployedAlgorithmModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployedAlgorithmModelsResponse self = new ListDeployedAlgorithmModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployedAlgorithmModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployedAlgorithmModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeployedAlgorithmModelsResponse setBody(ListDeployedAlgorithmModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployedAlgorithmModelsResponseBody getBody() {
        return this.body;
    }

}
