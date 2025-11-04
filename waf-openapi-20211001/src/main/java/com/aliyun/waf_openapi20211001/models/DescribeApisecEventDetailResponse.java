// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecEventDetailResponseBody body;

    public static DescribeApisecEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventDetailResponse self = new DescribeApisecEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecEventDetailResponse setBody(DescribeApisecEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecEventDetailResponseBody getBody() {
        return this.body;
    }

}
