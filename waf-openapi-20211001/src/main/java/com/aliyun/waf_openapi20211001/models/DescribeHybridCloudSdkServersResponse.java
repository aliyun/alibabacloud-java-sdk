// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudSdkServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudSdkServersResponseBody body;

    public static DescribeHybridCloudSdkServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudSdkServersResponse self = new DescribeHybridCloudSdkServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudSdkServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudSdkServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudSdkServersResponse setBody(DescribeHybridCloudSdkServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudSdkServersResponseBody getBody() {
        return this.body;
    }

}
