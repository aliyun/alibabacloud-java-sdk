// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUniBackupPoliciesResponseBody body;

    public static DescribeUniBackupPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupPoliciesResponse self = new DescribeUniBackupPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniBackupPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUniBackupPoliciesResponse setBody(DescribeUniBackupPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniBackupPoliciesResponseBody getBody() {
        return this.body;
    }

}
