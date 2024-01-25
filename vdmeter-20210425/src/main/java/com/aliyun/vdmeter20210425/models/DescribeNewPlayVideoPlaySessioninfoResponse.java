// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessioninfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNewPlayVideoPlaySessioninfoResponseBody body;

    public static DescribeNewPlayVideoPlaySessioninfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessioninfoResponse self = new DescribeNewPlayVideoPlaySessioninfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessioninfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNewPlayVideoPlaySessioninfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNewPlayVideoPlaySessioninfoResponse setBody(DescribeNewPlayVideoPlaySessioninfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNewPlayVideoPlaySessioninfoResponseBody getBody() {
        return this.body;
    }

}
