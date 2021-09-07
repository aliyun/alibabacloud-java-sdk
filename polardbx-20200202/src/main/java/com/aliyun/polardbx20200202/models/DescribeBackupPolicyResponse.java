// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupPolicyResponseBody body;

    public static DescribeBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponse self = new DescribeBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPolicyResponse setBody(DescribeBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
