// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDBClusterAccessWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterAccessWhitelistResponse setBody(DescribeDBClusterAccessWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAccessWhitelistResponseBody getBody() {
        return this.body;
    }

}
