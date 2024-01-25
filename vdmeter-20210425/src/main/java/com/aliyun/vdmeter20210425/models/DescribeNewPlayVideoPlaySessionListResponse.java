// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNewPlayVideoPlaySessionListResponseBody body;

    public static DescribeNewPlayVideoPlaySessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessionListResponse self = new DescribeNewPlayVideoPlaySessionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNewPlayVideoPlaySessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNewPlayVideoPlaySessionListResponse setBody(DescribeNewPlayVideoPlaySessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNewPlayVideoPlaySessionListResponseBody getBody() {
        return this.body;
    }

}
