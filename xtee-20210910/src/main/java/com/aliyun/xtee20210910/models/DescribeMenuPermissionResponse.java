// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMenuPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMenuPermissionResponseBody body;

    public static DescribeMenuPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMenuPermissionResponse self = new DescribeMenuPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMenuPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMenuPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMenuPermissionResponse setBody(DescribeMenuPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMenuPermissionResponseBody getBody() {
        return this.body;
    }

}
