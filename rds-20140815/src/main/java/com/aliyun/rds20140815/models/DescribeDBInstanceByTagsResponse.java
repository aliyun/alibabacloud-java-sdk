// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceByTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceByTagsResponseBody body;

    public static DescribeDBInstanceByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceByTagsResponse self = new DescribeDBInstanceByTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceByTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceByTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceByTagsResponse setBody(DescribeDBInstanceByTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceByTagsResponseBody getBody() {
        return this.body;
    }

}
