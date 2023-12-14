// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayCategoriesResponseBody body;

    public static DescribeGatewayCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCategoriesResponse self = new DescribeGatewayCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayCategoriesResponse setBody(DescribeGatewayCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayCategoriesResponseBody getBody() {
        return this.body;
    }

}
