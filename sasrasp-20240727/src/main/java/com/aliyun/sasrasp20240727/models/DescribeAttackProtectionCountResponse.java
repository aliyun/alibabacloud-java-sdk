// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasrasp20240727.models;

import com.aliyun.tea.*;

public class DescribeAttackProtectionCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttackProtectionCountResponseBody body;

    public static DescribeAttackProtectionCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackProtectionCountResponse self = new DescribeAttackProtectionCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackProtectionCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackProtectionCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttackProtectionCountResponse setBody(DescribeAttackProtectionCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackProtectionCountResponseBody getBody() {
        return this.body;
    }

}
