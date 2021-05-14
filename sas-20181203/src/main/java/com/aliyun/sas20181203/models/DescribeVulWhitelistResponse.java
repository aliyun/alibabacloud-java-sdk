// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVulWhitelistResponse setBody(DescribeVulWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulWhitelistResponseBody getBody() {
        return this.body;
    }

}
