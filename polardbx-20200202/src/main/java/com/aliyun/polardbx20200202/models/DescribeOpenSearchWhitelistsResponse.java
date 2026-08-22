// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchWhitelistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchWhitelistsResponseBody body;

    public static DescribeOpenSearchWhitelistsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchWhitelistsResponse self = new DescribeOpenSearchWhitelistsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchWhitelistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchWhitelistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchWhitelistsResponse setBody(DescribeOpenSearchWhitelistsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchWhitelistsResponseBody getBody() {
        return this.body;
    }

}
