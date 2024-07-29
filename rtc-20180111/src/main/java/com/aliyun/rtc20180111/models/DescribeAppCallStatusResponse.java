// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppCallStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppCallStatusResponseBody body;

    public static DescribeAppCallStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppCallStatusResponse self = new DescribeAppCallStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppCallStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppCallStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppCallStatusResponse setBody(DescribeAppCallStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppCallStatusResponseBody getBody() {
        return this.body;
    }

}
