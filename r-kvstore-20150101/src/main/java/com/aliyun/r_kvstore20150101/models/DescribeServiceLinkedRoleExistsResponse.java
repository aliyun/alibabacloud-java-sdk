// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceLinkedRoleExistsResponseBody body;

    public static DescribeServiceLinkedRoleExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleExistsResponse self = new DescribeServiceLinkedRoleExistsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceLinkedRoleExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceLinkedRoleExistsResponse setBody(DescribeServiceLinkedRoleExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceLinkedRoleExistsResponseBody getBody() {
        return this.body;
    }

}
