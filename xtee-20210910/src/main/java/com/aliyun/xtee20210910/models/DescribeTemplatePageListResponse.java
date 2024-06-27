// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplatePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplatePageListResponseBody body;

    public static DescribeTemplatePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatePageListResponse self = new DescribeTemplatePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplatePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplatePageListResponse setBody(DescribeTemplatePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplatePageListResponseBody getBody() {
        return this.body;
    }

}
