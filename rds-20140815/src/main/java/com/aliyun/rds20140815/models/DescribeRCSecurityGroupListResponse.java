// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCSecurityGroupListResponseBody body;

    public static DescribeRCSecurityGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSecurityGroupListResponse self = new DescribeRCSecurityGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCSecurityGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCSecurityGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCSecurityGroupListResponse setBody(DescribeRCSecurityGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCSecurityGroupListResponseBody getBody() {
        return this.body;
    }

}
