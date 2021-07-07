// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGlobalDatabaseNetworkResponseBody body;

    public static DescribeGlobalDatabaseNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDatabaseNetworkResponse self = new DescribeGlobalDatabaseNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDatabaseNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalDatabaseNetworkResponse setBody(DescribeGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
