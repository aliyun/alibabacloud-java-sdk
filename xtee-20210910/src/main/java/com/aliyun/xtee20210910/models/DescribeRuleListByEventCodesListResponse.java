// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleListByEventCodesListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleListByEventCodesListResponseBody body;

    public static DescribeRuleListByEventCodesListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleListByEventCodesListResponse self = new DescribeRuleListByEventCodesListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleListByEventCodesListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleListByEventCodesListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleListByEventCodesListResponse setBody(DescribeRuleListByEventCodesListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleListByEventCodesListResponseBody getBody() {
        return this.body;
    }

}
