// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeGlobalSecurityIPGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalSecurityIPGroupRelationResponseBody body;

    public static DescribeGlobalSecurityIPGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalSecurityIPGroupRelationResponse self = new DescribeGlobalSecurityIPGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalSecurityIPGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalSecurityIPGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalSecurityIPGroupRelationResponse setBody(DescribeGlobalSecurityIPGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalSecurityIPGroupRelationResponseBody getBody() {
        return this.body;
    }

}
