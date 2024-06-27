// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateCountResponseBody body;

    public static DescribeTemplateCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateCountResponse self = new DescribeTemplateCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateCountResponse setBody(DescribeTemplateCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateCountResponseBody getBody() {
        return this.body;
    }

}
