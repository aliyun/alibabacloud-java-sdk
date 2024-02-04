// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectStepsResponseBody body;

    public static DescribeProjectStepsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectStepsResponse self = new DescribeProjectStepsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectStepsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectStepsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectStepsResponse setBody(DescribeProjectStepsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectStepsResponseBody getBody() {
        return this.body;
    }

}
