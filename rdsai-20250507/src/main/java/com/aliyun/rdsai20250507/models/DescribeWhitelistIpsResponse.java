// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeWhitelistIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhitelistIpsResponseBody body;

    public static DescribeWhitelistIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistIpsResponse self = new DescribeWhitelistIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhitelistIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhitelistIpsResponse setBody(DescribeWhitelistIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhitelistIpsResponseBody getBody() {
        return this.body;
    }

}
