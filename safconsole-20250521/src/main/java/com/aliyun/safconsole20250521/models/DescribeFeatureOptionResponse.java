// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFeatureOptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFeatureOptionResponseBody body;

    public static DescribeFeatureOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureOptionResponse self = new DescribeFeatureOptionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFeatureOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFeatureOptionResponse setBody(DescribeFeatureOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFeatureOptionResponseBody getBody() {
        return this.body;
    }

}
