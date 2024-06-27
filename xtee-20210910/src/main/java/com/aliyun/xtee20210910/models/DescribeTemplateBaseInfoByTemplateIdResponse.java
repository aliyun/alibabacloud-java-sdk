// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateBaseInfoByTemplateIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateBaseInfoByTemplateIdResponseBody body;

    public static DescribeTemplateBaseInfoByTemplateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateBaseInfoByTemplateIdResponse self = new DescribeTemplateBaseInfoByTemplateIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateBaseInfoByTemplateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateBaseInfoByTemplateIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateBaseInfoByTemplateIdResponse setBody(DescribeTemplateBaseInfoByTemplateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateBaseInfoByTemplateIdResponseBody getBody() {
        return this.body;
    }

}
