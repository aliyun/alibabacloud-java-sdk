// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHitRuleListResponseBody body;

    public static DescribeHitRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleListResponse self = new DescribeHitRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHitRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHitRuleListResponse setBody(DescribeHitRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHitRuleListResponseBody getBody() {
        return this.body;
    }

}
