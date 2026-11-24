// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEventOperationsResponseBody body;

    public static DescribeAiEngineEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventOperationsResponse self = new DescribeAiEngineEventOperationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEventOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEventOperationsResponse setBody(DescribeAiEngineEventOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEventOperationsResponseBody getBody() {
        return this.body;
    }

}
