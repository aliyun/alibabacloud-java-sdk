// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAvailableModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableModelsResponseBody body;

    public static DescribeAvailableModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableModelsResponse self = new DescribeAvailableModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableModelsResponse setBody(DescribeAvailableModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableModelsResponseBody getBody() {
        return this.body;
    }

}
