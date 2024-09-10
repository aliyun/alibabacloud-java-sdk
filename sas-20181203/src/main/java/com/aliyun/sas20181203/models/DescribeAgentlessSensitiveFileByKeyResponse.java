// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentlessSensitiveFileByKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgentlessSensitiveFileByKeyResponseBody body;

    public static DescribeAgentlessSensitiveFileByKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentlessSensitiveFileByKeyResponse self = new DescribeAgentlessSensitiveFileByKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgentlessSensitiveFileByKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgentlessSensitiveFileByKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgentlessSensitiveFileByKeyResponse setBody(DescribeAgentlessSensitiveFileByKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgentlessSensitiveFileByKeyResponseBody getBody() {
        return this.body;
    }

}
