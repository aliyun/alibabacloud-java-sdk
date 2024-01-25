// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessionEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody body;

    public static DescribeNewPlayVideoPlaySessionEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessionEventDetailResponse self = new DescribeNewPlayVideoPlaySessionEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponse setBody(DescribeNewPlayVideoPlaySessionEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody getBody() {
        return this.body;
    }

}
