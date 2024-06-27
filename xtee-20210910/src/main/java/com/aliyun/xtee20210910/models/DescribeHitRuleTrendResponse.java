// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHitRuleTrendResponseBody body;

    public static DescribeHitRuleTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleTrendResponse self = new DescribeHitRuleTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHitRuleTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHitRuleTrendResponse setBody(DescribeHitRuleTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHitRuleTrendResponseBody getBody() {
        return this.body;
    }

}
