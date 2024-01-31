// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSearchConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSearchConditionResponseBody body;

    public static DescribeSearchConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchConditionResponse self = new DescribeSearchConditionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSearchConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSearchConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSearchConditionResponse setBody(DescribeSearchConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSearchConditionResponseBody getBody() {
        return this.body;
    }

}
