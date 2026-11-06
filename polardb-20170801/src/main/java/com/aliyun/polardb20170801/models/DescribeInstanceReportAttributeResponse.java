// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInstanceReportAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceReportAttributeResponseBody body;

    public static DescribeInstanceReportAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceReportAttributeResponse self = new DescribeInstanceReportAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceReportAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceReportAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceReportAttributeResponse setBody(DescribeInstanceReportAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceReportAttributeResponseBody getBody() {
        return this.body;
    }

}
