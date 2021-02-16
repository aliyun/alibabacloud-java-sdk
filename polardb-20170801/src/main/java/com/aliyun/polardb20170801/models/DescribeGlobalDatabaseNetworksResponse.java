// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeGlobalDatabaseNetworksResponse setBody(DescribeGlobalDatabaseNetworksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDatabaseNetworksResponseBody getBody() {
        return this.body;
    }

}
