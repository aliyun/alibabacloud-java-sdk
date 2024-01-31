// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMatchedMaliciousNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMatchedMaliciousNamesResponseBody body;

    public static DescribeMatchedMaliciousNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMatchedMaliciousNamesResponse self = new DescribeMatchedMaliciousNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMatchedMaliciousNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMatchedMaliciousNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMatchedMaliciousNamesResponse setBody(DescribeMatchedMaliciousNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMatchedMaliciousNamesResponseBody getBody() {
        return this.body;
    }

}
