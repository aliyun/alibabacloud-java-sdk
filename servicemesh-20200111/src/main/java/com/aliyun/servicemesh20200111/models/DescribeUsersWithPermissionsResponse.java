// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUsersWithPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsersWithPermissionsResponseBody body;

    public static DescribeUsersWithPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersWithPermissionsResponse self = new DescribeUsersWithPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsersWithPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsersWithPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsersWithPermissionsResponse setBody(DescribeUsersWithPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsersWithPermissionsResponseBody getBody() {
        return this.body;
    }

}
