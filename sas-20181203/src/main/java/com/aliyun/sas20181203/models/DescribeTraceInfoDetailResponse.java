// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTraceInfoDetailResponseBody body;

    public static DescribeTraceInfoDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoDetailResponse self = new DescribeTraceInfoDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceInfoDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTraceInfoDetailResponse setBody(DescribeTraceInfoDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceInfoDetailResponseBody getBody() {
        return this.body;
    }

}
