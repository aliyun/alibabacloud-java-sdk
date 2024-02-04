// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalDatabaseNetworksResponseBody body;

    public static DescribeGlobalDatabaseNetworksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDatabaseNetworksResponse self = new DescribeGlobalDatabaseNetworksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDatabaseNetworksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalDatabaseNetworksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalDatabaseNetworksResponse setBody(DescribeGlobalDatabaseNetworksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDatabaseNetworksResponseBody getBody() {
        return this.body;
    }

}
