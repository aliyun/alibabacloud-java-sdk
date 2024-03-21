// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeQualificationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQualificationStatusResponseBody body;

    public static DescribeQualificationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualificationStatusResponse self = new DescribeQualificationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQualificationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQualificationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQualificationStatusResponse setBody(DescribeQualificationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualificationStatusResponseBody getBody() {
        return this.body;
    }

}
