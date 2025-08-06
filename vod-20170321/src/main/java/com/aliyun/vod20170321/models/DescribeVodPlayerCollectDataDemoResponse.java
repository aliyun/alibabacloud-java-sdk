// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerCollectDataDemoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodPlayerCollectDataDemoResponseBody body;

    public static DescribeVodPlayerCollectDataDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerCollectDataDemoResponse self = new DescribeVodPlayerCollectDataDemoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerCollectDataDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodPlayerCollectDataDemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodPlayerCollectDataDemoResponse setBody(DescribeVodPlayerCollectDataDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodPlayerCollectDataDemoResponseBody getBody() {
        return this.body;
    }

}
