// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyClusterListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridProxyClusterListResponseBody body;

    public static DescribeHybridProxyClusterListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyClusterListResponse self = new DescribeHybridProxyClusterListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyClusterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridProxyClusterListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridProxyClusterListResponse setBody(DescribeHybridProxyClusterListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridProxyClusterListResponseBody getBody() {
        return this.body;
    }

}
