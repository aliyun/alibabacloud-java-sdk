// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVulDetailsResponseBody body;

    public static DescribeVulDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsResponse self = new DescribeVulDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulDetailsResponse setBody(DescribeVulDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulDetailsResponseBody getBody() {
        return this.body;
    }

}
