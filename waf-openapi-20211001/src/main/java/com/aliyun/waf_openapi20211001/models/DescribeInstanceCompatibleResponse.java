// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeInstanceCompatibleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceCompatibleResponseBody body;

    public static DescribeInstanceCompatibleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCompatibleResponse self = new DescribeInstanceCompatibleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCompatibleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceCompatibleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceCompatibleResponse setBody(DescribeInstanceCompatibleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceCompatibleResponseBody getBody() {
        return this.body;
    }

}
