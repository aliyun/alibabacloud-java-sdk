// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceCrossBackupPolicyResponseBody body;

    public static DescribeInstanceCrossBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCrossBackupPolicyResponse self = new DescribeInstanceCrossBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCrossBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceCrossBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceCrossBackupPolicyResponse setBody(DescribeInstanceCrossBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceCrossBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
