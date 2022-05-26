// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserPermissionsResponseBody body;

    public static DescribeUserPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionsResponse self = new DescribeUserPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserPermissionsResponse setBody(DescribeUserPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserPermissionsResponseBody getBody() {
        return this.body;
    }

}
