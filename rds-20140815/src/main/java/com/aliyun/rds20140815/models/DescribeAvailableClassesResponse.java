// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableClassesResponseBody body;

    public static DescribeAvailableClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableClassesResponse self = new DescribeAvailableClassesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableClassesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableClassesResponse setBody(DescribeAvailableClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableClassesResponseBody getBody() {
        return this.body;
    }

}
