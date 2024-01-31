// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLocalAvailableRecoveryTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLocalAvailableRecoveryTimeResponseBody body;

    public static DescribeLocalAvailableRecoveryTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalAvailableRecoveryTimeResponse self = new DescribeLocalAvailableRecoveryTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLocalAvailableRecoveryTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLocalAvailableRecoveryTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLocalAvailableRecoveryTimeResponse setBody(DescribeLocalAvailableRecoveryTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLocalAvailableRecoveryTimeResponseBody getBody() {
        return this.body;
    }

}
