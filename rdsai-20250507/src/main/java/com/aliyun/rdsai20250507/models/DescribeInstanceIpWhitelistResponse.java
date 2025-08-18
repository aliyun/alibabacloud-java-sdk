// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceIpWhitelistResponseBody body;

    public static DescribeInstanceIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpWhitelistResponse self = new DescribeInstanceIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceIpWhitelistResponse setBody(DescribeInstanceIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
