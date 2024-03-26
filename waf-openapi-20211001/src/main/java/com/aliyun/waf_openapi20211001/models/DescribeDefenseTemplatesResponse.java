// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseTemplatesResponseBody body;

    public static DescribeDefenseTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplatesResponse self = new DescribeDefenseTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseTemplatesResponse setBody(DescribeDefenseTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseTemplatesResponseBody getBody() {
        return this.body;
    }

}
