// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GenerateResourcePlanWithFlinkConfAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateResourcePlanWithFlinkConfAsyncResponseBody body;

    public static GenerateResourcePlanWithFlinkConfAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateResourcePlanWithFlinkConfAsyncResponse self = new GenerateResourcePlanWithFlinkConfAsyncResponse();
        return TeaModel.build(map, self);
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponse setBody(GenerateResourcePlanWithFlinkConfAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateResourcePlanWithFlinkConfAsyncResponseBody getBody() {
        return this.body;
    }

}
