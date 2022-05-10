// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceLinkedRoleStatusResponseBody body;

    public static DescribeServiceLinkedRoleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleStatusResponse self = new DescribeServiceLinkedRoleStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceLinkedRoleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceLinkedRoleStatusResponse setBody(DescribeServiceLinkedRoleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceLinkedRoleStatusResponseBody getBody() {
        return this.body;
    }

}
