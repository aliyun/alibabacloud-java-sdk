// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineOverviewResponseBody body;

    public static DescribeAiEngineOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineOverviewResponse self = new DescribeAiEngineOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineOverviewResponse setBody(DescribeAiEngineOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineOverviewResponseBody getBody() {
        return this.body;
    }

}
