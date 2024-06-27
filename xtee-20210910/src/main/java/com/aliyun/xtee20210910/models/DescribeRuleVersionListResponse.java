// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleVersionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleVersionListResponseBody body;

    public static DescribeRuleVersionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleVersionListResponse self = new DescribeRuleVersionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleVersionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleVersionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleVersionListResponse setBody(DescribeRuleVersionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleVersionListResponseBody getBody() {
        return this.body;
    }

}
