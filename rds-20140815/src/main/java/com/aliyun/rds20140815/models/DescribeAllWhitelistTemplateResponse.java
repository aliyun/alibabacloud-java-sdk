// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAllWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllWhitelistTemplateResponseBody body;

    public static DescribeAllWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllWhitelistTemplateResponse self = new DescribeAllWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllWhitelistTemplateResponse setBody(DescribeAllWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
