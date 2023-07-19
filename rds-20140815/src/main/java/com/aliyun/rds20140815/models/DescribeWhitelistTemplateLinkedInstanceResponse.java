// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeWhitelistTemplateLinkedInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWhitelistTemplateLinkedInstanceResponseBody body;

    public static DescribeWhitelistTemplateLinkedInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistTemplateLinkedInstanceResponse self = new DescribeWhitelistTemplateLinkedInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistTemplateLinkedInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponse setBody(DescribeWhitelistTemplateLinkedInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhitelistTemplateLinkedInstanceResponseBody getBody() {
        return this.body;
    }

}
