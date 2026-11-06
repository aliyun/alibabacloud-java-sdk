// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationBackupPolicyResponseBody body;

    public static DescribeApplicationBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationBackupPolicyResponse self = new DescribeApplicationBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationBackupPolicyResponse setBody(DescribeApplicationBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
