// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUuidsByVulNamesResponseBody body;

    public static DescribeUuidsByVulNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidsByVulNamesResponse self = new DescribeUuidsByVulNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUuidsByVulNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUuidsByVulNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUuidsByVulNamesResponse setBody(DescribeUuidsByVulNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUuidsByVulNamesResponseBody getBody() {
        return this.body;
    }

}
