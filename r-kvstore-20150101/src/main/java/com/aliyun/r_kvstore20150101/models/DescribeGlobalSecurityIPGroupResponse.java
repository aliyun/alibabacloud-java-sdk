// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeGlobalSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalSecurityIPGroupResponseBody body;

    public static DescribeGlobalSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalSecurityIPGroupResponse self = new DescribeGlobalSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalSecurityIPGroupResponse setBody(DescribeGlobalSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
