// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulWhitelistResponseBody body;

    public static DescribeVulWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulWhitelistResponse self = new DescribeVulWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulWhitelistResponse setBody(DescribeVulWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulWhitelistResponseBody getBody() {
        return this.body;
    }

}
