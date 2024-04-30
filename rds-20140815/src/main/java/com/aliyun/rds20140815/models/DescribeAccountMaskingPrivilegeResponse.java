// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAccountMaskingPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountMaskingPrivilegeResponseBody body;

    public static DescribeAccountMaskingPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountMaskingPrivilegeResponse self = new DescribeAccountMaskingPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountMaskingPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountMaskingPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountMaskingPrivilegeResponse setBody(DescribeAccountMaskingPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountMaskingPrivilegeResponseBody getBody() {
        return this.body;
    }

}
