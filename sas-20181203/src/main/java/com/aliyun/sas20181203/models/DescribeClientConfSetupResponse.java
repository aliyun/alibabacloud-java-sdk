// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfSetupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClientConfSetupResponseBody body;

    public static DescribeClientConfSetupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientConfSetupResponse self = new DescribeClientConfSetupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientConfSetupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientConfSetupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientConfSetupResponse setBody(DescribeClientConfSetupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientConfSetupResponseBody getBody() {
        return this.body;
    }

}
