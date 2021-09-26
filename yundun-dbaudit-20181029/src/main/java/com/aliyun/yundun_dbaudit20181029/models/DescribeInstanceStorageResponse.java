// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceStorageResponseBody body;

    public static DescribeInstanceStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageResponse self = new DescribeInstanceStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStorageResponse setBody(DescribeInstanceStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStorageResponseBody getBody() {
        return this.body;
    }

}
