// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelFeatureResponseBody body;

    public static DescribeModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelFeatureResponse self = new DescribeModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelFeatureResponse setBody(DescribeModelFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelFeatureResponseBody getBody() {
        return this.body;
    }

}
