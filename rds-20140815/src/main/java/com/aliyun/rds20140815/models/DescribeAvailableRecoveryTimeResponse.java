// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableRecoveryTimeResponseBody body;

    public static DescribeAvailableRecoveryTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableRecoveryTimeResponse self = new DescribeAvailableRecoveryTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableRecoveryTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableRecoveryTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableRecoveryTimeResponse setBody(DescribeAvailableRecoveryTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableRecoveryTimeResponseBody getBody() {
        return this.body;
    }

}
