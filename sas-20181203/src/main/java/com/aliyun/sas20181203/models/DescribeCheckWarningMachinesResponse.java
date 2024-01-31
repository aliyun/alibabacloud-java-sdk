// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckWarningMachinesResponseBody body;

    public static DescribeCheckWarningMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningMachinesResponse self = new DescribeCheckWarningMachinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckWarningMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckWarningMachinesResponse setBody(DescribeCheckWarningMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckWarningMachinesResponseBody getBody() {
        return this.body;
    }

}
