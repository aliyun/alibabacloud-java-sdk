// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCommonLogFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommonLogFieldsResponseBody body;

    public static DescribeCommonLogFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonLogFieldsResponse self = new DescribeCommonLogFieldsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonLogFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonLogFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonLogFieldsResponse setBody(DescribeCommonLogFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonLogFieldsResponseBody getBody() {
        return this.body;
    }

}
