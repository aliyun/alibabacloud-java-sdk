// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventVariableListResponseBody body;

    public static DescribeEventVariableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableListResponse self = new DescribeEventVariableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventVariableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventVariableListResponse setBody(DescribeEventVariableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventVariableListResponseBody getBody() {
        return this.body;
    }

}
