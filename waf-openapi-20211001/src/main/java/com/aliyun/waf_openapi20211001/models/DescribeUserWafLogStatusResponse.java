// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserWafLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserWafLogStatusResponseBody body;

    public static DescribeUserWafLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserWafLogStatusResponse self = new DescribeUserWafLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserWafLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserWafLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserWafLogStatusResponse setBody(DescribeUserWafLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserWafLogStatusResponseBody getBody() {
        return this.body;
    }

}
