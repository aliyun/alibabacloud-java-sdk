// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDataNetworkListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalDataNetworkListResponseBody body;

    public static DescribeGlobalDataNetworkListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDataNetworkListResponse self = new DescribeGlobalDataNetworkListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDataNetworkListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalDataNetworkListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalDataNetworkListResponse setBody(DescribeGlobalDataNetworkListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDataNetworkListResponseBody getBody() {
        return this.body;
    }

}
