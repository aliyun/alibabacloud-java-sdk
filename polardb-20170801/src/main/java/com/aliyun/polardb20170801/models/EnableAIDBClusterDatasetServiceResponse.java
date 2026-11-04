// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableAIDBClusterDatasetServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAIDBClusterDatasetServiceResponseBody body;

    public static EnableAIDBClusterDatasetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAIDBClusterDatasetServiceResponse self = new EnableAIDBClusterDatasetServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnableAIDBClusterDatasetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAIDBClusterDatasetServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAIDBClusterDatasetServiceResponse setBody(EnableAIDBClusterDatasetServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAIDBClusterDatasetServiceResponseBody getBody() {
        return this.body;
    }

}
