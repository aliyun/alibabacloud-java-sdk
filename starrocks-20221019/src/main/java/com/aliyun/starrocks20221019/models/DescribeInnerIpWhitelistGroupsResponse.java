// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInnerIpWhitelistGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInnerIpWhitelistGroupsResponseBody body;

    public static DescribeInnerIpWhitelistGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInnerIpWhitelistGroupsResponse self = new DescribeInnerIpWhitelistGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInnerIpWhitelistGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInnerIpWhitelistGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInnerIpWhitelistGroupsResponse setBody(DescribeInnerIpWhitelistGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInnerIpWhitelistGroupsResponseBody getBody() {
        return this.body;
    }

}
