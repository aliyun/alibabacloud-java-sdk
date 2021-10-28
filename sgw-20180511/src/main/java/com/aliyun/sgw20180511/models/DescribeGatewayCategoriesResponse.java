// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeGatewayCategoriesResponse setBody(DescribeGatewayCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayCategoriesResponseBody getBody() {
        return this.body;
    }

}
