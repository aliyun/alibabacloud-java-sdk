// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenDataMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenDataMapResponseBody body;

    public static DescribeScreenDataMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenDataMapResponse self = new DescribeScreenDataMapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenDataMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenDataMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenDataMapResponse setBody(DescribeScreenDataMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenDataMapResponseBody getBody() {
        return this.body;
    }

}
