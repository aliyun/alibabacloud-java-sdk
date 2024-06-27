// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventVariableTemplateListResponseBody body;

    public static DescribeEventVariableTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableTemplateListResponse self = new DescribeEventVariableTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventVariableTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventVariableTemplateListResponse setBody(DescribeEventVariableTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventVariableTemplateListResponseBody getBody() {
        return this.body;
    }

}
