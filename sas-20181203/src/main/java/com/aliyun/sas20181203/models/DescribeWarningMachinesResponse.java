// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWarningMachinesResponseBody body;

    public static DescribeWarningMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarningMachinesResponse self = new DescribeWarningMachinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWarningMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWarningMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWarningMachinesResponse setBody(DescribeWarningMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWarningMachinesResponseBody getBody() {
        return this.body;
    }

}
