// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVulDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulDetailsResponse setBody(DescribeVulDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulDetailsResponseBody getBody() {
        return this.body;
    }

}
