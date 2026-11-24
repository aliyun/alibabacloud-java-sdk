// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEventResponseBody body;

    public static DescribeAiEngineEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventResponse self = new DescribeAiEngineEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEventResponse setBody(DescribeAiEngineEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEventResponseBody getBody() {
        return this.body;
    }

}
