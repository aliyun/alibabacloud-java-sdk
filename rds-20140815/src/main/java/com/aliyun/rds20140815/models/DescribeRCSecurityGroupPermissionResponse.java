// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCSecurityGroupPermissionResponseBody body;

    public static DescribeRCSecurityGroupPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSecurityGroupPermissionResponse self = new DescribeRCSecurityGroupPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCSecurityGroupPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCSecurityGroupPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCSecurityGroupPermissionResponse setBody(DescribeRCSecurityGroupPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCSecurityGroupPermissionResponseBody getBody() {
        return this.body;
    }

}
