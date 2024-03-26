// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceTemplatesResponseBody body;

    public static DescribeDefenseResourceTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceTemplatesResponse self = new DescribeDefenseResourceTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceTemplatesResponse setBody(DescribeDefenseResourceTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceTemplatesResponseBody getBody() {
        return this.body;
    }

}
