// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppResourceAllocResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppResourceAllocResponseBody body;

    public static DescribeAppResourceAllocResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResourceAllocResponse self = new DescribeAppResourceAllocResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppResourceAllocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppResourceAllocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppResourceAllocResponse setBody(DescribeAppResourceAllocResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppResourceAllocResponseBody getBody() {
        return this.body;
    }

}
