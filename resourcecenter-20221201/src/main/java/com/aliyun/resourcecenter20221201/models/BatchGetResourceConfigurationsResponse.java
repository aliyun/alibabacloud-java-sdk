// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class BatchGetResourceConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetResourceConfigurationsResponseBody body;

    public static BatchGetResourceConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetResourceConfigurationsResponse self = new BatchGetResourceConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetResourceConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetResourceConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetResourceConfigurationsResponse setBody(BatchGetResourceConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetResourceConfigurationsResponseBody getBody() {
        return this.body;
    }

}
