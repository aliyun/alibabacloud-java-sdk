// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterModelEnhancementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterModelEnhancementResponseBody body;

    public static DescribeDBClusterModelEnhancementResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterModelEnhancementResponse self = new DescribeDBClusterModelEnhancementResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterModelEnhancementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterModelEnhancementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterModelEnhancementResponse setBody(DescribeDBClusterModelEnhancementResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterModelEnhancementResponseBody getBody() {
        return this.body;
    }

}
