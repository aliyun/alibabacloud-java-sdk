// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicantResponseBody body;

    public static DescribeApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicantResponse self = new DescribeApplicantResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicantResponse setBody(DescribeApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicantResponseBody getBody() {
        return this.body;
    }

}
