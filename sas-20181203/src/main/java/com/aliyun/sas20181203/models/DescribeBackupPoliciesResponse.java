// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupPoliciesResponseBody body;

    public static DescribeBackupPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPoliciesResponse self = new DescribeBackupPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupPoliciesResponse setBody(DescribeBackupPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPoliciesResponseBody getBody() {
        return this.body;
    }

}
