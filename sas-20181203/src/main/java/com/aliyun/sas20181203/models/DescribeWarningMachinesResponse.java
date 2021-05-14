// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeWarningMachinesResponse setBody(DescribeWarningMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWarningMachinesResponseBody getBody() {
        return this.body;
    }

}
