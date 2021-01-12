// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeInstanceCrossBackupPolicyResponse setBody(DescribeInstanceCrossBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceCrossBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
