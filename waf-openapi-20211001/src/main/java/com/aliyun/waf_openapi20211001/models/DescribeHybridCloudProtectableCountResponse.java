// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudProtectableCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudProtectableCountResponseBody body;

    public static DescribeHybridCloudProtectableCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudProtectableCountResponse self = new DescribeHybridCloudProtectableCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudProtectableCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudProtectableCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudProtectableCountResponse setBody(DescribeHybridCloudProtectableCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudProtectableCountResponseBody getBody() {
        return this.body;
    }

}
