// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseTemplateResponseBody body;

    public static DescribeDefenseTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateResponse self = new DescribeDefenseTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseTemplateResponse setBody(DescribeDefenseTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseTemplateResponseBody getBody() {
        return this.body;
    }

}
