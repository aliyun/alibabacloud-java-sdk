// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCallListResponseBody body;

    public static DescribeCallListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallListResponse self = new DescribeCallListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCallListResponse setBody(DescribeCallListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallListResponseBody getBody() {
        return this.body;
    }

}
