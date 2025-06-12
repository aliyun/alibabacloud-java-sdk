// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeBeebotIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBeebotIntentResponseBody body;

    public static DescribeBeebotIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBeebotIntentResponse self = new DescribeBeebotIntentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBeebotIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBeebotIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBeebotIntentResponse setBody(DescribeBeebotIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBeebotIntentResponseBody getBody() {
        return this.body;
    }

}
