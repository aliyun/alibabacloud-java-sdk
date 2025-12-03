// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSecurityStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenSecurityStatInfoResponseBody body;

    public static DescribeScreenSecurityStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSecurityStatInfoResponse self = new DescribeScreenSecurityStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSecurityStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenSecurityStatInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenSecurityStatInfoResponse setBody(DescribeScreenSecurityStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenSecurityStatInfoResponseBody getBody() {
        return this.body;
    }

}
