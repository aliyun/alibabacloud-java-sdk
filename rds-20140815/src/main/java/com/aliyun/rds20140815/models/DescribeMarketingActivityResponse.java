// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMarketingActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMarketingActivityResponseBody body;

    public static DescribeMarketingActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarketingActivityResponse self = new DescribeMarketingActivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMarketingActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMarketingActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMarketingActivityResponse setBody(DescribeMarketingActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMarketingActivityResponseBody getBody() {
        return this.body;
    }

}
