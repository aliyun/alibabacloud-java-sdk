// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhitelistTemplateResponseBody body;

    public static DescribeWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistTemplateResponse self = new DescribeWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhitelistTemplateResponse setBody(DescribeWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
