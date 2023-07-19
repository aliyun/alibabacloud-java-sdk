// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceLinkedWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceLinkedWhitelistTemplateResponseBody body;

    public static DescribeInstanceLinkedWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLinkedWhitelistTemplateResponse self = new DescribeInstanceLinkedWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLinkedWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponse setBody(DescribeInstanceLinkedWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceLinkedWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
