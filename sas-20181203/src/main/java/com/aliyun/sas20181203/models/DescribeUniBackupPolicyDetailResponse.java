// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUniBackupPolicyDetailResponseBody body;

    public static DescribeUniBackupPolicyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupPolicyDetailResponse self = new DescribeUniBackupPolicyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupPolicyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniBackupPolicyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUniBackupPolicyDetailResponse setBody(DescribeUniBackupPolicyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniBackupPolicyDetailResponseBody getBody() {
        return this.body;
    }

}
