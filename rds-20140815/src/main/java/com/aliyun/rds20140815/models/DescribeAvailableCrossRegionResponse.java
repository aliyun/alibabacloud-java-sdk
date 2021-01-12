// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableCrossRegionResponseBody body;

    public static DescribeAvailableCrossRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionResponse self = new DescribeAvailableCrossRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableCrossRegionResponse setBody(DescribeAvailableCrossRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableCrossRegionResponseBody getBody() {
        return this.body;
    }

}
