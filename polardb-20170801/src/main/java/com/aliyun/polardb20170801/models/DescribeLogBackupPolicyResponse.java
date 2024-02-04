// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogBackupPolicyResponseBody body;

    public static DescribeLogBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupPolicyResponse self = new DescribeLogBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogBackupPolicyResponse setBody(DescribeLogBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
