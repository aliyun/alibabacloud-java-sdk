// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeCloudConnectNetworksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCloudConnectNetworksResponseBody body;

    public static DescribeCloudConnectNetworksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudConnectNetworksResponse self = new DescribeCloudConnectNetworksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudConnectNetworksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudConnectNetworksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudConnectNetworksResponse setBody(DescribeCloudConnectNetworksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudConnectNetworksResponseBody getBody() {
        return this.body;
    }

}
