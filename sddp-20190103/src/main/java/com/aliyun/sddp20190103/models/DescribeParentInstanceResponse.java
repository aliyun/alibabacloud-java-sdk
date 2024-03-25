// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParentInstanceResponseBody body;

    public static DescribeParentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentInstanceResponse self = new DescribeParentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParentInstanceResponse setBody(DescribeParentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParentInstanceResponseBody getBody() {
        return this.body;
    }

}
