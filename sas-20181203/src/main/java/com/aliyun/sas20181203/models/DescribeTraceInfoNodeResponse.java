// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTraceInfoNodeResponseBody body;

    public static DescribeTraceInfoNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoNodeResponse self = new DescribeTraceInfoNodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceInfoNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTraceInfoNodeResponse setBody(DescribeTraceInfoNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceInfoNodeResponseBody getBody() {
        return this.body;
    }

}
