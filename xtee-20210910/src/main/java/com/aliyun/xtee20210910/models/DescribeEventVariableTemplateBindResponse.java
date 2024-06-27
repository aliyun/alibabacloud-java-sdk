// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventVariableTemplateBindResponseBody body;

    public static DescribeEventVariableTemplateBindResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableTemplateBindResponse self = new DescribeEventVariableTemplateBindResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableTemplateBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventVariableTemplateBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventVariableTemplateBindResponse setBody(DescribeEventVariableTemplateBindResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventVariableTemplateBindResponseBody getBody() {
        return this.body;
    }

}
