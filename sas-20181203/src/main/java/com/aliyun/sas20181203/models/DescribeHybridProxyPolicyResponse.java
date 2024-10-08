// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridProxyPolicyResponseBody body;

    public static DescribeHybridProxyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyPolicyResponse self = new DescribeHybridProxyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridProxyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridProxyPolicyResponse setBody(DescribeHybridProxyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridProxyPolicyResponseBody getBody() {
        return this.body;
    }

}
