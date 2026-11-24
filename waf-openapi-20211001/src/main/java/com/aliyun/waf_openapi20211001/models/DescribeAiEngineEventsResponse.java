// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEventsResponseBody body;

    public static DescribeAiEngineEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventsResponse self = new DescribeAiEngineEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEventsResponse setBody(DescribeAiEngineEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEventsResponseBody getBody() {
        return this.body;
    }

}
