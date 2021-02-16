// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterAccessWhitelistResponseBody body;

    public static DescribeDBClusterAccessWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhitelistResponse self = new DescribeDBClusterAccessWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAccessWhitelistResponse setBody(DescribeDBClusterAccessWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAccessWhitelistResponseBody getBody() {
        return this.body;
    }

}
