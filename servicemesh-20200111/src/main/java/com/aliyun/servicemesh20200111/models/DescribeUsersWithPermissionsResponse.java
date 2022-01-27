// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUsersWithPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeUsersWithPermissionsResponse setBody(DescribeUsersWithPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsersWithPermissionsResponseBody getBody() {
        return this.body;
    }

}
