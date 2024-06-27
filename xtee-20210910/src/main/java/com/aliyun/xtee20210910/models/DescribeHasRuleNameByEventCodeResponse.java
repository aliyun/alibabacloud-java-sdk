// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHasRuleNameByEventCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHasRuleNameByEventCodeResponseBody body;

    public static DescribeHasRuleNameByEventCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHasRuleNameByEventCodeResponse self = new DescribeHasRuleNameByEventCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHasRuleNameByEventCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHasRuleNameByEventCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHasRuleNameByEventCodeResponse setBody(DescribeHasRuleNameByEventCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHasRuleNameByEventCodeResponseBody getBody() {
        return this.body;
    }

}
