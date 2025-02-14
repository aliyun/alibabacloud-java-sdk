// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrictEventNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStrictEventNameResponseBody body;

    public static DescribeStrictEventNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrictEventNameResponse self = new DescribeStrictEventNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStrictEventNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStrictEventNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStrictEventNameResponse setBody(DescribeStrictEventNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStrictEventNameResponseBody getBody() {
        return this.body;
    }

}
