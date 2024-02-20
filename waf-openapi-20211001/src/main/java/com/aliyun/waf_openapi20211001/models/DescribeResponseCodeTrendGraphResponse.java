// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResponseCodeTrendGraphResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResponseCodeTrendGraphResponseBody body;

    public static DescribeResponseCodeTrendGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResponseCodeTrendGraphResponse self = new DescribeResponseCodeTrendGraphResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResponseCodeTrendGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResponseCodeTrendGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResponseCodeTrendGraphResponse setBody(DescribeResponseCodeTrendGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResponseCodeTrendGraphResponseBody getBody() {
        return this.body;
    }

}
