// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogShipperStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogShipperStatusResponseBody body;

    public static DescribeLogShipperStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogShipperStatusResponse self = new DescribeLogShipperStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogShipperStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogShipperStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogShipperStatusResponse setBody(DescribeLogShipperStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogShipperStatusResponseBody getBody() {
        return this.body;
    }

}
