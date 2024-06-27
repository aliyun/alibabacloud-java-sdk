// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthRulePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthRulePageListResponseBody body;

    public static DescribeAuthRulePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthRulePageListResponse self = new DescribeAuthRulePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthRulePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthRulePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthRulePageListResponse setBody(DescribeAuthRulePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthRulePageListResponseBody getBody() {
        return this.body;
    }

}
