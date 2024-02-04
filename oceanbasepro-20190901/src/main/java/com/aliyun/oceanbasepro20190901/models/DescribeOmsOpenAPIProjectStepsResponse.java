// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectStepsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOmsOpenAPIProjectStepsResponseBody body;

    public static DescribeOmsOpenAPIProjectStepsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectStepsResponse self = new DescribeOmsOpenAPIProjectStepsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectStepsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsOpenAPIProjectStepsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOmsOpenAPIProjectStepsResponse setBody(DescribeOmsOpenAPIProjectStepsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsOpenAPIProjectStepsResponseBody getBody() {
        return this.body;
    }

}
