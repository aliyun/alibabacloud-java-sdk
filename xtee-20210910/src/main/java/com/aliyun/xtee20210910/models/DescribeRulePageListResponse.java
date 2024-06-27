// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRulePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRulePageListResponseBody body;

    public static DescribeRulePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulePageListResponse self = new DescribeRulePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRulePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRulePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRulePageListResponse setBody(DescribeRulePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRulePageListResponseBody getBody() {
        return this.body;
    }

}
