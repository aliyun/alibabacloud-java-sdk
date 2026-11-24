// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEventNodesResponseBody body;

    public static DescribeAiEngineEventNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventNodesResponse self = new DescribeAiEngineEventNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEventNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEventNodesResponse setBody(DescribeAiEngineEventNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEventNodesResponseBody getBody() {
        return this.body;
    }

}
