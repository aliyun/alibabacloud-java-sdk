// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventTrendsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEventTrendsResponseBody body;

    public static DescribeAiEngineEventTrendsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventTrendsResponse self = new DescribeAiEngineEventTrendsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventTrendsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEventTrendsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEventTrendsResponse setBody(DescribeAiEngineEventTrendsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEventTrendsResponseBody getBody() {
        return this.body;
    }

}
