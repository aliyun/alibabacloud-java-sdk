// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDbListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbListResponseBody body;

    public static DescribeDbListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbListResponse self = new DescribeDbListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbListResponse setBody(DescribeDbListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbListResponseBody getBody() {
        return this.body;
    }

}
